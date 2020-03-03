package me.renedo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Telephone extends PanacheEntityBase {

    @Id
    private String number;

    private String description;

    private Integer reliability;

    private Date date;

    private String status;
}
