package kidneyFailure.ExpertSystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Diagnosis {
	
	private Patient patient;
	private Analytics analytics;
	private float gfr;
	private List<Symptom> symptoms;
	private int renalInsufficiencyIndex;
	private KidneyFailureRisk failureRisk;
	private RenalInsufficiencyType renalInsufficiencyType;
	private Set<Treatment> treatments;
	
	
	
	//CONSTRUCTOR
	
	public Diagnosis() {
		super();
		this.renalInsufficiencyIndex = 0;
		this.symptoms = new LinkedList<Symptom>();
		this.treatments = new TreeSet<Treatment>();
	}
	
	public Diagnosis(Patient p, Analytics analytics) {
		super();
		this.renalInsufficiencyIndex = 0;
		this.symptoms = new LinkedList<Symptom>();
		this.treatments = new TreeSet<Treatment>();
		this.patient = p;
		this.analytics = analytics;
		calculateGFR();
	}

	
	//GETTERS AND SETTERS
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Analytics getAnalytics() {
		return analytics;
	}

	public void setAnalytics(Analytics analytics) {
		this.analytics = analytics;
	}
	
	public float getGfr() {
		return gfr;
	}

	public void setGfr(float gfr) {
		this.gfr = gfr;
	}
	
	public List<Symptom> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<Symptom> symptoms) {
		this.symptoms = symptoms;
	}

	public int getRenalInsufficiencyIndex() {
		return renalInsufficiencyIndex;
	}

	public void setRenalInsufficiencyIndex(int renalInsufficiencyIndex) {
		this.renalInsufficiencyIndex = renalInsufficiencyIndex;
	}

	public KidneyFailureRisk getFailureRisk() {
		return failureRisk;
	}

	public void setFailureRisk(KidneyFailureRisk failureRisk) {
		this.failureRisk = failureRisk;
	}

	public RenalInsufficiencyType getRenalInsufficiencyType() {
		return renalInsufficiencyType;
	}

	public void setRenalInsufficiencyType(RenalInsufficiencyType renalInsufficiencyType) {
		this.renalInsufficiencyType = renalInsufficiencyType;
	}
	
	public Set<Treatment> getTreatments() {
		return treatments;
	}

	public void setTreatments(Set<Treatment> treatments) {
		this.treatments = treatments;
	}
	
	
	//METHODS

	public void incrementRenalInsufficiencyIndex(int value) {
		renalInsufficiencyIndex += value;
	}

	public void addSymptom(Symptom symptom) {
		this.symptoms.add(symptom);
	}
	
	public void addTreatment(Treatment treatment) {
		this.treatments.add(treatment);
	}
	
	private void calculateGFR() {
		gfr = (float)Math.pow((double)analytics.getSerumCreatinine(), (double)-1.154)
				*(float)Math.pow((double)this.patient.getAge(), (double)-0.203)*186f;
		if (this.patient.getSex().equalsIgnoreCase("female")) {
			gfr = gfr*0.742f;
		}
		if (this.patient.getIsBlackRace()) {
			gfr = gfr*1.212f;
		}
	}

	@Override
	public String toString() {
		return "Diagnosis [patient=" + patient + ", analytics=" + analytics + ", gfr=" + gfr + ", symptoms=" + symptoms
				+ ", renalInsufficiencyIndex=" + renalInsufficiencyIndex + ", failureRisk=" + failureRisk
				+ ", renalInsufficiencyType=" + renalInsufficiencyType + ", treatments=" + treatments + "]";
	}


}
