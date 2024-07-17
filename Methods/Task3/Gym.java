import java.util.Arrays;

class Gym{


	static String gymName="Fitness Freak Hub";
	
	static String equipments[]={null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addGymEquipments(String equipment){
		
		System.out.println("Gym Equipments Started");
	
		boolean isGymEquipmentsadded=false;
		 if(equipments!=null){
			
		   equipments[index]=equipment;
		   index++;
		   
		   isGymEquipmentsadded=true;
		}
		else
			System.out.println("please Add Equipments");
	
		return isGymEquipmentsadded;
	}
	
	
	public static void getEquipments(){
		System.out.println("The Gym Equipments Added are: ");
		for(String equipment:equipments)
			System.out.println(equipment);
	}

	public static boolean deleteGymEquipment(String equipmentToBeDeleted){
		System.out.println("Delete Method Started");
		
		boolean isEquipDelete=false;
		
		int newSize,oldIndex;
		
		for(newSize=0,oldIndex=0;oldIndex<equipments.length;oldIndex++){
			
			if(equipments[oldIndex]!=equipmentToBeDeleted){
				equipments[oldIndex]=equipments[newSize];
				newSize++;
				
				isEquipDelete=true;
			}else isEquipDelete=true;
		
		}
		
		equipments=Arrays.copyOf(equipments,newSize);
		
		if(isEquipDelete==false){
			System.out.println(equipmentToBeDeleted+"Not Found");
		}
		System.out.println("Delete Method Ended");
		return isEquipDelete;
		
	}
	
	
	
}
			
		