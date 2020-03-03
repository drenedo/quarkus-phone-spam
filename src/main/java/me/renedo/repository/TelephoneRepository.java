package me.renedo.repository;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import me.renedo.entity.Telephone;

@ApplicationScoped
public class TelephoneRepository implements PanacheRepository<Telephone> {

    public Telephone findByNumber(String number){
        return find("number", number).firstResult();
    }
}
