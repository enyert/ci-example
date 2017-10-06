package com.everis.citutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by evinasgu - Everis SKL-1 on 06/10/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Beer {
    public Beer(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
