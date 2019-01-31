package marco.peinado.di.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import marco.peinado.di.IWorkout;
import marco.peinado.di.RunWorkout;
import marco.peinado.di.Workout;

public class WorkoutTest {
	Workout workout;

	@Test
    public void RunWorkout_pace_should_be_6() {
		IWorkout run = new RunWorkout(10, 60);
		this.workout = new Workout(run);
		
		double runPace = workout.workout.getMovingPace();
		assertEquals(6, runPace, "Runnign pace should be 6");
    }
	
	@Test
    public void RunWorkout_pace_should_be_0() {
		IWorkout run = new RunWorkout(0, 60);
		this.workout = new Workout(run);
		
		double runPace = workout.workout.getMovingPace();
		assertEquals(0, runPace, "Runnign pace should be 0");
    }

}
