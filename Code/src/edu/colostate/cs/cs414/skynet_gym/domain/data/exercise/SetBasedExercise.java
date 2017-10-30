package edu.colostate.cs.cs414.skynet_gym.domain.data.exercise;

import java.time.Duration;

/**
 * This is a set based exercise
 * 
 * @author Mike Allan
 *
 */
public class SetBasedExercise implements ExerciseTypeIf {
	
	private String type;
	private int numberOfSets;
	private int numberOfRepetitions;
	
	public SetBasedExercise(int numberOfSets,
			int numberOfRepetitions) {
		this.type = "set based";
		this.setNumberOfSets(numberOfSets);
		this.setNumberOfRepetitions(numberOfRepetitions);
	}
	
	@Override
	public String toString() {
		return (this.type + ":" +
				String.valueOf(this.numberOfSets) + ":" +
				String.valueOf(this.numberOfRepetitions));
	}
	
	@Override
	public boolean equals(Object o){
		try {
			return (this.toString().equals(SetBasedExercise.class.cast(o).toString()));
		} catch (java.lang.ClassCastException e) {
			return false;
		} catch (java.lang.NullPointerException e) {
			return false;
		}
	}

	/**
	 * @return the numberOfSets
	 */
	public int getNumberOfSets() {
		return numberOfSets;
	}

	/**
	 * @param numberOfSets the numberOfSets to set
	 */
	protected void setNumberOfSets(int numberOfSets) {
		this.numberOfSets = numberOfSets;
	}

	/**
	 * @return the numberOfRepetitions
	 */
	public int getNumberOfRepetitions() {
		return numberOfRepetitions;
	}

	/**
	 * @param numberOfRepetitions the numberOfRepetitions to set
	 */
	protected void setNumberOfRepetitions(int numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @return null since this is a set based exercise
	 */
	public Duration getDuration() {
		return null;
	}


}
