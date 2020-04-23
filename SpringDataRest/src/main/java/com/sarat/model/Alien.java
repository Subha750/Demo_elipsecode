package com.sarat.model;
import javax.persistence.*;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Entity
@Table(name="Aliendetail")
public class Alien 
{
	@Id
	///@GeneratedValue
private int aid;
private String aname;
public int getAid() 
{
	return aid;
}
public void setAid(int aid)
{
	this.aid = aid;
}
public String getAname() 
{
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}

}
///Here we used @GeneratedValue for auto generate value 
///Here I create a reposiory class noneed to create controler class because  used SpringDataRest
//@RepositoryRestResource(collectionResourceRel="aliens",path="aliens")//in that application we are not using controler 
///only use that above Annotation it will handle and mapped every request on Repositary interface