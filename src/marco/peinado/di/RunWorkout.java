package marco.peinado.di;

public class RunWorkout implements IWorkout{
	private double distance;
	private double timeMin;
	
	public RunWorkout(double distance, double timeMin) {
		this.distance = distance;
		this.timeMin = timeMin;
	}
	
	public double getMovingPace()
	{
		if(this.timeMin == 0 || this.distance == 0) {
			return 0;
		}
		
		return this.timeMin / this.distance ;
	}

}
