class GiriasRunner {

    public static void main(String[] args) {
        boolean isApplianceAdded = Girias.addHomeAppliance("Refrigerator");
        System.out.println("Appliance Added: " + isApplianceAdded);
        isApplianceAdded = Girias.addHomeAppliance("Washing Machine");
        System.out.println("Appliance Added: " + isApplianceAdded);
        isApplianceAdded = Girias.addHomeAppliance("Microwave Oven");
        System.out.println("Appliance Added: " + isApplianceAdded);
        isApplianceAdded = Girias.addHomeAppliance("Air Conditioner");
        System.out.println("Appliance Added: " + isApplianceAdded);
        isApplianceAdded = Girias.addHomeAppliance("Dishwasher");
        System.out.println("Appliance Added: " + isApplianceAdded);
        isApplianceAdded = Girias.addHomeAppliance("Water Purifier");
        System.out.println("Appliance Added: " + isApplianceAdded);
        isApplianceAdded = Girias.addHomeAppliance("Television");
        System.out.println("Appliance Added: " + isApplianceAdded);
        isApplianceAdded = Girias.addHomeAppliance("Vacuum Cleaner");
        System.out.println("Appliance Added: " + isApplianceAdded);
		isApplianceAdded = Girias.addHomeAppliance("Phone");
        System.out.println("Appliance Added: " + isApplianceAdded);
		isApplianceAdded = Girias.addHomeAppliance("Fan");
        System.out.println("Appliance Added: " + isApplianceAdded);
		isApplianceAdded = Girias.addHomeAppliance("Gas Stove");
        System.out.println("Appliance Added: " + isApplianceAdded);
		isApplianceAdded = Girias.addHomeAppliance("Water Geaser");
        System.out.println("Appliance Added: " + isApplianceAdded);

        Girias.getHomeAppliances();
		
		boolean isApplianceDelete=Girias.deleteHomeAppliance("Dishwasher");
		System.out.println("Is Delete: "+isApplianceDelete);
		
		Girias.getHomeAppliances();
    }
}