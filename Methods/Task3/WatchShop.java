import java.util.Arrays;

class WatchShop{


	static String watchNames[]={null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	
	public static boolean createWatchName(String watchName){
		System.out.println("Adding Watch Name Started: ");
		
		boolean isWatchAdded=false;
		
		
			if(watchName!=null){
				watchNames[index]=watchName;
				index++;
				
				isWatchAdded=true;
			}
			else{
				System.out.println("Can't add");
			}
		
		
		System.out.println("Adding Watch Name Ended: ");
		return isWatchAdded;
	}
	
	public static void getWatch(){
		System.out.println("Fetching Watches: ");
		for(String watchName:watchNames)
			System.out.println(watchName);
			
	}
	
	public static boolean updateWatchName(String oldWatch,String newWatch){
	
		System.out.println("update Started");
		
		boolean isUpdateWatch=false;
		
		for(int index=0;index<watchNames.length;index++){
			if(oldWatch==watchNames[index]){
				watchNames[index]=newWatch;
				
				isUpdateWatch=true;
			}
		}
		if(isUpdateWatch==false)
			System.out.println(oldWatch+"Not Found");
		
		
		System.out.println("update Ended");
		return isUpdateWatch;
	
	}
	public static boolean deleteWatchName(String watchToBeDeleted){
		System.out.println("Delete Method Started");
		
		boolean isWatchDelete=false;
		
		int newSize,oldIndex;
		
		for(newSize=0,oldIndex=0;oldIndex<watchNames.length;oldIndex++){
			
			if(watchNames[oldIndex]!=watchToBeDeleted){
				watchNames[oldIndex]=watchNames[newSize];
				newSize++;
				
				isWatchDelete=true;
			}else isWatchDelete=true;
		
		}
		
		watchNames=Arrays.copyOf(watchNames,newSize);
		
		if(isWatchDelete==false){
			System.out.println(watchToBeDeleted+"Not Found");
		}
		System.out.println("Delete Method Ended");
		return isWatchDelete;
		
	}
	
	
	
}

	