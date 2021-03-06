package edu.colostate.cs.cs414.skynet_gym.domain.data.people;

import java.io.Serializable;

/**
 * Stores qualification data
 * 
 * @author Mike Allan
 *
 */
public class Qualification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4834400992487782873L;
	private String description;
	private String name;

	public Qualification(String name, String description) {
		this.setName(name);
		this.setDescription(description);
	}
	
	@Override
	public boolean equals(Object o){
		try {
			return (this.toString().equals(Qualification.class.cast(o).toString()));
		} catch (java.lang.ClassCastException e) {
			return false;
		} catch (java.lang.NullPointerException e) {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return (this.description + ":" +
				this.name);
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
