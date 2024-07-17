class Patient {

    static String patientId;
    static String name;
    static int age;
    static String gender;
    static long contactNumber;
    static String email;
    static String medicalHistory;
    static String currentMedications;

    public static boolean createPatientDetails(String id, String fullName, int agee, String avatar,
         long contact, String mail, String history, String medications) {
		 
		boolean isPatientDeatilsPresent=false;
		if(id!=null){
			patientId = id;
		}
		if(fullName!=null){
			name =fullName;
		}
		else{
			System.out.println("provide Full Name");
		}
		if(agee!=0){
			age = agee;
		}
		if(avatar!=null){
			gender = avatar;
		}
		else{
			System.out.println("please Mention ur Gender");
		}
		 
		if(contact!=0){
			contactNumber=contact;
		}
		else{
			System.out.println("Provide proper Phone Number");
		}
		
		if(mail!=null){
			email=mail;
		}
		
		else{
			System.out.println("Please Check your Email");
		}
		
		if(history!=null){
			medicalHistory=history;
		}
		else{
			System.out.println("You Dont have any Medical History");
		}
		
		if(medications!=null){
			currentMedications=medications;
		}
		else{
			System.out.println("There are no Current Medications");
		}
		
		 
        //contactNumber = contact;
        //email = mail;
        //medicalHistory = history;
        //currentMedications = medications;
		
		return isPatientDeatilsPresent;
    }

    public static void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Current Medications: " + currentMedications);
    }

}
