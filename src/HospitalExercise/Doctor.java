package HospitalExercise;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> doctorPatients = new ArrayList<Patient>();
	public boolean isEvil = false;

	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	
	public Doctor(String string) {
		// TODO Auto-generated constructor stub
	}

	public Doctor(String string, Hospital aHospital) {
		// TODO Auto-generated constructor stub
	}


	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient p) throws DoctorFullException {
		if (doctorPatients.size() >= 3) {
			throw new DoctorFullException();
		}
		doctorPatients.add(p);
	}

	public ArrayList<Patient> getPatients() {
		
		return doctorPatients;
	}

	public void doMedicine() {
		for (Patient p : doctorPatients) {
			p.feelsCaredFor = true;
			if (isEvil) {
				p.kill(); 
			}
		}
		
	}

	public boolean isEvil() {
		return isEvil;
	}

	public void joinTheDarkSide() {
		isEvil = true;	
	}

	public Object getHospital() {
		// TODO Auto-generated method stub
		return null;
	}

}
 