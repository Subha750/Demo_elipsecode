package com.sarat.alienRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sarat.model.Alien;
@RepositoryRestResource(collectionResourceRel="aliens",path="aliens")//in that application we are not using controler 
//only use that above Annotation it will handle and mapped every request
public interface AlienRepo extends JpaRepository<Alien,Integer>
{

}
