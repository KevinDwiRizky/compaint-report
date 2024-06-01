package org.kevin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BidangExplain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long reportNumber;

    @ManyToOne
    @JoinColumn(name = "complaint_id")
    public Complaint complaint;

    @ManyToOne
    @JoinColumn(name = "bidang_unit_id")
    public BidangUnit bidangUnit;
}
