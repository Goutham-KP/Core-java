class PatientRunner{

	public static void main(String[] args) {
	
        Patient.createPatientDetails("PT1001", "Kiran M", 22, "Female", 1234567890l,
                "kiran@gmail.com", "Diabetes, Hypertension", "Metformin, Lisinopril");
        Patient.getPatientDetails();
    }
}