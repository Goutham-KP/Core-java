class Medicine {
	static String name = "Paracetamol";
    static int dosage = 500; // in milligrams
    public static void main(String[] acetaminophen) {
       
        String form = "Tablet";
        boolean isPrescription = false;
		String specilaized="Pain Relief";

        System.out.println("Name: " + name);
        System.out.println("Dosage: " + dosage + " mg");
        System.out.println("Form: " + form);
        System.out.println("Prescription: " + (isPrescription ? "Yes" : "No"));
		System.out.println("The Tablet is used for  : "+specilaized);
    }
}