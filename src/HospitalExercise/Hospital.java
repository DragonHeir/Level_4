package HospitalExercise;
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

	public void assignPatientsToDoctors() {
		int currentDoctor = 0;
		int ctr = 0;
		for (Patient p : patientList) {
			try {
				doctorList.get(currentDoctor).assignPatient(p);
				if(ctr%3==2) {
					currentDoctor++;
				}
				ctr++;
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void makeDoctorsWork() {
		// TODO Auto-generated method stub
		
	}

	public List<Doctor> getZombies() {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(Doctor evilDoctor) {
		// TODO Auto-generated method stub
		
	}

	public void add(Patient patient) {
		// TODO Auto-generated method stub
		
	}
}
