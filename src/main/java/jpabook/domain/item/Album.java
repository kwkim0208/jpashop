package jpabook.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Setter
@Getter
@DiscriminatorValue("Album")
public class Album extends Item{
    private String artist;
    private String etc;
}
