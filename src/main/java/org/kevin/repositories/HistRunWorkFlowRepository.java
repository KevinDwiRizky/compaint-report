package org.kevin.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.kevin.entity.HistRunWorkflow;

@ApplicationScoped
public class HistRunWorkFlowRepository implements PanacheRepository<HistRunWorkflow> {
}
