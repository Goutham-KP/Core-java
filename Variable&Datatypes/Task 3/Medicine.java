class Medicine {
    public static void main(String[] args) {
        String name = "Paracetamol";
        int dosage = 500; // in milligrams
        String form = "Tablet";
        boolean isPrescription = false;

        System.out.println("Name: " + name);
        System.out.println("Dosage: " + dosage + " mg");
        System.out.println("Form: " + form);
        System.out.println("Prescription: " + (isPrescription ? "Yes" : "No"));
    }
}