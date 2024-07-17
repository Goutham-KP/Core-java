class TextileRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        boolean isAddMaterial = Textile.addMaterial("Cotton");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Silk");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Wool");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Linen");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Polyester");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Nylon");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Rayon");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Denim");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Velvet");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Chiffon");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Georgette");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Satin");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Spandex");
        System.out.println("Is Add Material: " + isAddMaterial);
        isAddMaterial = Textile.addMaterial("Lace");
        System.out.println("Is Add Material: " + isAddMaterial);

        Textile.getMaterial();

        boolean isUpdateMaterial = Textile.updateMaterial("Wool", "Cashmere");
        System.out.println("Is Update Material: " + isUpdateMaterial);

        Textile.getMaterial();
    }
}
