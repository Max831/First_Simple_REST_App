package net.pro.customer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

/*
Simple JavaBean domain object that represents Customer
 */
@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
public class Customer extends BaseEntity{
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "address")
    private String address;
    @Column(name = "budget")
    private BigDecimal budget;
}
