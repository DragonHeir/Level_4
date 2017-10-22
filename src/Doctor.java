import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> doctorPatients = new ArrayList<Patient>();

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
		}
		
	}

}
 