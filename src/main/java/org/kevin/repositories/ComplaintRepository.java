package org.kevin.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.kevin.entity.Complaint;

@ApplicationScoped
public class ComplaintRepository implements PanacheRepository<Complaint> {
}
