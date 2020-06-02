package entity;


import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MediaId implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public String name;
public MediaType mtype;

public MediaId(String name, MediaType mtype) {
	super();
	this.name = name;
	this.mtype = mtype;
}



}
