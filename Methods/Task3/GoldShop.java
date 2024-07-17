import java.util.Arrays;

class GoldShop{

	
	static String goldNames[]={null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addGoldItems(String goldName){
		System.out.println("Adding Gold Names Started");
		
		boolean isAddGoldItems=false;
		
		if(goldName!=null){
		
			goldNames[index]=goldName;
			index++;
			
			isAddGoldItems=true;
		}
		else{
				System.out.println("Add Proper Item");
		}
		System.out.println("Adding Gold Names Ended");
		return isAddGoldItems;
	}
	
	public static void getGoldItems(){
	
		System.out.println("Fetching Gold Items: ");
		for(String goldName:goldNames)
		System.out.println(goldName);
	}
	
	
	public static boolean updateGoldItems(String oldName,String newName){
	
		System.out.println("Update of Gold Item Started");
		
		boolean isUpdateGoldItem=false;
		
		for(int index=0;index<goldNames.length;index++){
			if(oldName==goldNames[index]){
				goldNames[index]=newName;
				
				isUpdateGoldItem=true;
			}
			
		}
		if(isUpdateGoldItem==false){
			System.out.println(oldName+"Not Available");
		}
		
		System.out.println("Update of Gold Item Ended");
		return isUpdateGoldItem;
	}
	
	public static boolean deleteGoldItem(String goldToBeDeleted){
			  System.out.println("The delete method is started");
			  boolean isGoldDeleted=false;
			  
			  int newSize,oldIndex;
			 
			  for(newSize=0,oldIndex=0;oldIndex<goldNames.length;oldIndex++ ){
				  
				  if(goldNames[oldIndex]!=goldToBeDeleted){
					  goldNames[oldIndex]=goldNames[newSize];
					  newSize++;
					  isGoldDeleted=true;
				  }else  isGoldDeleted=true;

			  }
			 goldNames =Arrays.copyOf(goldNames,newSize);
			  
			  
			  if(isGoldDeleted==false){
				  System.out.println(goldToBeDeleted+ "not found");
			  }
			System.out.println("The delete method is ended");
           return isGoldDeleted;
		  }
		  
	
}
			