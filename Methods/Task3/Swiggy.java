class Swiggy{

	static String swiggyFoodNames[]={null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addFoodName(String foodName){
		System.out.println("Adding Food Name Started");
		
		boolean isCreateFoodName=false;
		
		if(index<swiggyFoodNames.length){
			if(foodName!=null){
				swiggyFoodNames[index]=foodName;
				index++;
				
				isCreateFoodName=true;
			}
			else{
				System.out.println("add Proper food Name: ");
			}
		}
		else{
			System.out.println("can't add more Food");
		}
		System.out.println("Adding Food Name Ended:");
		return isCreateFoodName;
	
	}
	
	public static void getFoodNames(){
		System.out.println("Fetching Food Names");
		for(String food:swiggyFoodNames)
			System.out.println(food);
			
	}
	
	public static boolean findFoodName(String foodName){
		boolean isFoodFound=false;
		for(int index=0;index<swiggyFoodNames.length;index++){
			
			if(foodName==swiggyFoodNames[index]){
				System.out.println("Food Name found");
			
				isFoodFound=true;
				break;
			}
		else{
			System.out.println("Food Name not found");
		}
		}
		
		return isFoodFound;
	}
			
	
	public static boolean updateFoodName(String oldFood,String newFood){
	
		System.out.println("Updating Food Name: ");
		
		boolean isUpdateFoodName=false;
		
		for(int index=0;index<swiggyFoodNames.length;index++){
			if(oldFood==swiggyFoodNames[index]){
				swiggyFoodNames[index]=newFood;
				
				 isUpdateFoodName=true;
			}
	
		}
		if(isUpdateFoodName==false){
			System.out.println(oldFood+" -> Not Found");
		}
		
		System.out.println("Updating Food Name Ended");
		return isUpdateFoodName;
		
	}

}