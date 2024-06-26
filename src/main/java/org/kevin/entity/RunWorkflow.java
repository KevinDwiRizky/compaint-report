package org.kevin.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class RunWorkflow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long runWorkflowId;
    public String lastStatus;

    @OneToMany(mappedBy = "runWorkflow", fetch = FetchType.EAGER)
    @JsonBackReference
    public List<Complaint> complaints;
}
