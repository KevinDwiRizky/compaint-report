package org.kevin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class HistRunWorkflow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long runWorkflowId;
    public String lastStatus;

    @OneToMany(mappedBy = "histRunWorkflow")
    public List<Complaint> complaints;
}
