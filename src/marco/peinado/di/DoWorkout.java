package marco.peinado.di;

public class DoWorkout{

	public static void main(String[] args) {
		IWorkout run = new RunWorkout(10, 60);
		Workout workout = new Workout(run);
		double runPace = workout.workout.getMovingPace();
		System.out.println("The run pace was: " + runPace);
		
		IWorkout bikeRide = new BikeWorkout();
		Workout bikeWorkout = new Workout(bikeRide);
		double bikePace = bikeWorkout.workout.getMovingPace();
		System.out.println("The bike pace was: " + bikePace);
	}

}
