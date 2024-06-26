package org.kevin.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.kevin.dto.PenjelasanBidangResponse;
import org.kevin.dto.WebResponse;
import org.kevin.entity.BidangExplain;
import org.kevin.service.ComplaintService;

@Path("/complaint")
public class ComplaintResource {
    @Inject
    private ComplaintService complaintService;

    @GET
    @Path("/penjelasan-bidang")
    @Produces(MediaType.APPLICATION_JSON)
    public WebResponse<PenjelasanBidangResponse> getP03PenjelasanBidang(@QueryParam("reportNumber") String reportNumber) {
        PenjelasanBidangResponse response = complaintService.getPenjelasanBidang(reportNumber);

        if (response.getLastStatus() != null && response.getBidangExplain() != null &&response.getNamaFungsi() != null) {
            return WebResponse.<PenjelasanBidangResponse>builder()
                    .status(Response.Status.OK.getStatusCode())
                    .message("SUKSES")
                    .data(response)
                    .build();
        } else {
            return WebResponse.<PenjelasanBidangResponse>builder()
                    .status(Response.Status.NOT_FOUND.getStatusCode())
                    .message("DATA TIDAK DITEMUKAN")
                    .data(null)
                    .build();
        }
    }
}
