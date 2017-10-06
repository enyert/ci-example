package com.everis.citutorial.repository;

import com.everis.citutorial.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by evinasgu - Everis SKL-1 on 06/10/2017.
 */
@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {}