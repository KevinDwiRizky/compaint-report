package org.kevin.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.kevin.dto.PenjelasanBidangResponse;
import org.kevin.entity.BidangExplain;
import org.kevin.repositories.*;
import org.kevin.service.ComplaintService;

import java.util.Optional;

@ApplicationScoped
public class ComplaintServiceImpl implements ComplaintService {

    @Inject
    private ComplaintRepository complainRepository;

    @Inject
    private RunWorkflowRepository runWorkflowRepository;

    @Inject
    private HistRunWorkFlowRepository histRunWorkflowRepository;

    @Inject
    private BidangExplainRepository bidangExplainRepository;

    @Inject
    private BidangUnitRepository bidangUnitRepository;

    @Override
    @Transactional
    public PenjelasanBidangResponse getPenjelasanBidang(String reportNumber) {
        Optional<BidangExplain> bidangExplainOpt = bidangExplainRepository.find("reportNumber", reportNumber).firstResultOptional();

        if (bidangExplainOpt.isPresent()) {
            BidangExplain bidangExplain = bidangExplainOpt.get();

            String lastStatus = null;
            if (bidangExplain.complaint.runWorkflow != null && bidangExplain.complaint.runWorkflow.lastStatus != null) {
                lastStatus = bidangExplain.complaint.runWorkflow.lastStatus;
            } else if (bidangExplain.complaint.histRunWorkflow != null) {
                lastStatus = bidangExplain.complaint.histRunWorkflow.lastStatus;
            }

            String namaFungsi = bidangExplain.bidangUnit != null ? bidangExplain.bidangUnit.bidangUnitName : null;

            return new PenjelasanBidangResponse("00", "SUKSES", lastStatus, bidangExplain, namaFungsi);
        } else {
            return new PenjelasanBidangResponse("01", "DATA TIDAK DITEMUKAN", null, null, null);
        }
    }
}
