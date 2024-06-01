package org.kevin.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class BidangUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long bidangUnitId;
    public String bidangUnitName;

    @OneToMany(mappedBy = "bidangUnit")
    public List<BidangExplain> bidangExplains;

}

