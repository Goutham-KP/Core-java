class Liberty{

	static String shoeNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createShoeName(String shoe){
		System.out.println("adding Shoe Brands started");
		
		boolean isAddShoe=false;
		
		if(index<shoeNames.length){
			if(shoe!=null){
				shoeNames[index]=shoe;
				index++;
				
				isAddShoe=true;
				
			}
			else{
				System.out.println("give proper name");
			}
		}else{
			System.out.println("can't add more");
		}
		
		System.out.println("adding shoe Brands Ended");
		return isAddShoe;
		
	}
	
	public static void getShoe(){
		System.out.println("Fetching shoes:");
		for(String shoeName:shoeNames){
			System.out.println(shoeName);
		}
	}
	
	
	public static boolean updateShoeName(String oldShoe,String newShoe){
		System.out.println("updating Shoe Started");
		
		boolean isUpdateShoe=false;
		
		for(int index=0;index<shoeNames.length;index++){
			if(oldShoe==shoeNames[index]){
				shoeNames[index]=newShoe;
				
				isUpdateShoe=true;
			}
			
		}
		if(isUpdateShoe==false){
			System.out.println(oldShoe+"Not Found");
		}
		
		System.out.println("updating Shoe Ended");
		return isUpdateShoe;
	

	}
	
	
	
	
}