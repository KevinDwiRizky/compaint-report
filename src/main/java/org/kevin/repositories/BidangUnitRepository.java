package org.kevin.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.kevin.entity.BidangUnit;
@ApplicationScoped
public class BidangUnitRepository implements PanacheRepository<BidangUnit> {
}
