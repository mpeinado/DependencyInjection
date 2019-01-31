package marco.peinado.di;

public class Workout {

	/*
	 * In this case our Workout class would be tightly 
	 * couple to the RunWorkout class.
	 */
	//private RunWorkout runWorkout;
	
	// our workout can be RunWorkout or BikeWrokout
	public IWorkout workout; 
	
	/**
	 * Dependency Injection is about injecting dependencies. 
	 * The concrete class is injected. 
	 * This is constructor based DI 
	 * @param workout
	 */
	public Workout(IWorkout workout) {
		this.workout = workout;
	}
	
	/**
	 * Setter based injection
	 * This is recommended for when many dependencies 
	 * need to be injected. 
	 */
	public void setWorkoutType(IWorkout workout)
	{
		this.workout = workout;
	}

}
