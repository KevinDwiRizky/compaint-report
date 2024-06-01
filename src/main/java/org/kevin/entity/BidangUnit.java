package org.kevin.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class BidangUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long bidangUnitId;
    public String bidangUnitName;

    @OneToMany(mappedBy = "bidangUnit",fetch = FetchType.EAGER)
    @JsonBackReference
    public List<BidangExplain> bidangExplains;

}

