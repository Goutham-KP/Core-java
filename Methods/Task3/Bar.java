import java.util.Arrays;

class Bar{

	static String wineNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addWineName(String wineName){
		System.out.println("Add Wine Started");
		
		boolean isAddWine=false;
		
		if(index<wineNames.length){
			if(wineName!=null){
				wineNames[index]=wineName;
				index++;
				
				isAddWine=true;
				
			}
			else{
				System.out.println("Add proper Wine Name");
			}
		}
		else{
			System.out.println("can't add more Wine");
		}
		System.out.println("Add Wine  Ended");
		return isAddWine;
	}
	
	public static void getWine(){
		System.out.println("Searching for Wine Names:" );
		for(String wine:wineNames)
			System.out.println(wine);
	
	}
	
	
	public static boolean updateWineName(String oldWine,String newWine){
	
		System.out.println("updating Wine Name Started");
		boolean isUpdateWine=false;
		
		for(int index=0;index<wineNames.length;index++){
			if(oldWine==wineNames[index]){
				wineNames[index]=newWine;
				
				isUpdateWine=true;
			}
		}
		if(isUpdateWine==false){
			System.out.println(oldWine+"Not Found");
		}
		
		System.out.println("updating Wine Name ended");
		return isUpdateWine;
	}
	public static boolean deleteWineName(String wineToBeDeleted){
		System.out.println("Delete Method Started");
		
		boolean isWineDelete=false;
		
		int newSize,oldIndex;
		
		for(newSize=0,oldIndex=0;oldIndex<wineNames.length;oldIndex++){
			
			if(wineNames[oldIndex]!=wineToBeDeleted){
				wineNames[oldIndex]=wineNames[newSize];
				newSize++;
				
				isWineDelete=true;
			}
		
		}
		
		wineNames=Arrays.copyOf(wineNames,newSize);
		
		if(isWineDelete==false){
			System.out.println(wineToBeDeleted+"Not Found");
		}
		System.out.println("Delete Method Ended");
		return isWineDelete;
		
	}
	

	
}
				