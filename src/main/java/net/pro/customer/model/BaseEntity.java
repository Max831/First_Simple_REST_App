package net.pro.customer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {
    @Id
    @SequenceGenerator(name = "customersIdSeq", sequenceName = "customers_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customersIdSeq")
    private long id;
}
