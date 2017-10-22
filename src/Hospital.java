import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	ArrayList<Patient> patientList = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		doctorList.add(d);
	}
	
	public List<Doctor> getDoctors() {
		return doctorList;
	}

	public void addPatient(Patient p) {
		patientList.add(p);

	}

	public List<Patient> getPatients() {
		return patientList;
	}

}
