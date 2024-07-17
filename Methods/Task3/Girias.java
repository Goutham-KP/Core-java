import java.util.Arrays;

class Girias {

    static String storeName = "Girias";
    static String homeAppliances[] = {null, null, null, null, null, null, null, null,null,null,null,null};
    static int index;

    public static boolean addHomeAppliance(String appliance) {
        System.out.println("Adding Home Appliance");
        boolean isHomeApplianceAdded = false;
        if (homeAppliances!=null) {
            homeAppliances[index] = appliance;
            index++;
            isHomeApplianceAdded = true;
        } else {
            System.out.println("No space to add more appliances");
        }
        return isHomeApplianceAdded;
    }

    public static void getHomeAppliances() {
        System.out.println("The Home Appliances Added are: ");
        for (String appliance : homeAppliances) 
                System.out.println(appliance);

    }
	
	public static boolean deleteHomeAppliance(String applianceToBeDeleted){
		System.out.println("Delete Method Started");
		
		boolean isApplianceDelete=false;
		
		int newSize,oldIndex;
		
		for(newSize=0,oldIndex=0;oldIndex<homeAppliances.length;oldIndex++){
			
			if(homeAppliances[oldIndex]!=applianceToBeDeleted){
				homeAppliances[oldIndex]=homeAppliances[newSize];
				newSize++;
				
				isApplianceDelete=true;
			}else isApplianceDelete=true;
		
		}
		
		homeAppliances=Arrays.copyOf(homeAppliances,newSize);
		
		if(isApplianceDelete==false){
			System.out.println(applianceToBeDeleted+"Not Found");
		}
		System.out.println("Delete Method Ended");
		return isApplianceDelete;
		
	}
	
	
}
