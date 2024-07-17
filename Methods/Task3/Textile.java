class Textile {

    static String materialNames[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    static int index;

    public static boolean addMaterial(String material) {
        System.out.println("Adding Material started");

        boolean isAddMaterial = false;

        if (index < materialNames.length) {
            if (material != null) {
                materialNames[index] = material;
                index++;

                isAddMaterial = true;
            } else {
                System.out.println("Provide a proper material name");
            }
        } else {
            System.out.println("Can't add more materials");
        }

        System.out.println("Adding Material ended");
        return isAddMaterial;
    }

    public static void getMaterial() {
        System.out.println("Fetching materials:");
        for (String materialName : materialNames) {
            System.out.println(materialName);
        }
    }

    public static boolean updateMaterial(String oldMaterial, String newMaterial) {
        System.out.println("Updating Material started");

        boolean isUpdateMaterial = false;

        for (int index = 0; index < materialNames.length; index++) {
            if (oldMaterial != null && oldMaterial.equals(materialNames[index])) {
                materialNames[index] = newMaterial;
                isUpdateMaterial = true;
            }
        }
        if (!isUpdateMaterial) {
            System.out.println(oldMaterial + " not found");
        }

        System.out.println("Updating Material ended");
        return isUpdateMaterial;
    }
	
	
	

}