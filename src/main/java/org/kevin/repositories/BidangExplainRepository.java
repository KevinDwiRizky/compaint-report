package org.kevin.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.kevin.entity.BidangExplain;

@ApplicationScoped
public class BidangExplainRepository implements PanacheRepository<BidangExplain> {
}
