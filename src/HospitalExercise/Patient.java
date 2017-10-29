package HospitalExercise;

public class Patient {
	boolean feelsCaredFor = false;
	boolean isAlive = true;

	public void checkPulse() {
		feelsCaredFor = true;
	}

	public boolean feelsCaredFor() {		
		return feelsCaredFor;
	}

	public void kill() {
		isAlive = false;
	}

	public boolean isAlive() {
		return isAlive;
	}

}
