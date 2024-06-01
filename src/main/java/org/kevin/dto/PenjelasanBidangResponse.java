package org.kevin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.kevin.entity.BidangExplain;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PenjelasanBidangResponse {
    private String lastStatus;
    private BidangExplain bidangExplain;
    private String namaFungsi;
}
