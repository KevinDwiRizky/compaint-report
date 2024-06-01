package org.kevin.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RunWorkflowRepository implements PanacheRepository<RunWorkflowRepository> {
}
