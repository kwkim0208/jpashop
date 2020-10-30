package jpabook.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String  street;
    private String zipcoode;
    protected  Address(){}
    public Address(String city,String street,String zipcoode){
        this.city=city;
        this.street=street;
        this.zipcoode=zipcoode;
    }
}
