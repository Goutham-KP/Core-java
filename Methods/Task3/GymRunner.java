class GymRunner{


	public static void main(String[] fitness){
	
		boolean isEquipmentadded=Gym.addGymEquipments("Dumbell");
		System.out.println("Equipment Added: "+isEquipmentadded);
		isEquipmentadded=Gym.addGymEquipments("Barbell");
		System.out.println("Equipment Added: "+isEquipmentadded);
		isEquipmentadded=Gym.addGymEquipments("Thread Mill");
		System.out.println("Equipment Added: "+isEquipmentadded);
		isEquipmentadded=Gym.addGymEquipments("Cycling ");
		System.out.println("Equipment Added: "+isEquipmentadded);
		isEquipmentadded=Gym.addGymEquipments("Boxing Bag");
		System.out.println("Equipment Added: "+isEquipmentadded);
		isEquipmentadded=Gym.addGymEquipments("Weight Plates");
		System.out.println("Equipment Added: "+isEquipmentadded);
		isEquipmentadded=Gym.addGymEquipments("Rope");
		System.out.println("Equipment Added: "+isEquipmentadded);
		isEquipmentadded=Gym.addGymEquipments("Safety Belts");
		System.out.println("Equipment Added: "+isEquipmentadded);
		
		
		Gym.getEquipments();
		
		boolean isDelete=Gym.deleteGymEquipment("Safety Belts");
		System.out.println("Is Delete : "+isDelete);
		
		Gym.getEquipments();
    }
}