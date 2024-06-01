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
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long runWorkflowId;

    public String reportNumber;

    @ManyToOne
    @JoinColumn(name = "run_work_flow_id")
    public RunWorkflow runWorkflow;

    @ManyToOne
    @JoinColumn(name = "hist_run_workflow_id")
    public HistRunWorkflow histRunWorkflow;
}
