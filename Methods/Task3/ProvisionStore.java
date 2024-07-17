import java.util.Arrays;

class ProvisionStore{


	static String shopName="Provision Store";
	
	
	
	static String provisionItems[]={null,null,null,null,null,null};
	static double itemPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
	static int index ;
	static int index1;
	
	
	public static boolean addItem(String provisionItem){
		
		System.out.println("Provision Items Started");
		
		boolean isAddedItems =false;
		
		if(provisionItem!=null){
			provisionItems[index]=provisionItem;
			index++;
			isAddedItems=true;
			
		}
		else{
			System.out.println("please Add Proper Items");
		}
		System.out.println("Provision Items Ended");
		return isAddedItems;
		
	}
	
	public static boolean addPrice(double itemPrice){
		
		System.out.println("Item Price Started");
		boolean isPriceAdded=false;
		
		if(itemPrice>0.0){
			itemPrices[index1]=itemPrice;
			index1++;
			isPriceAdded=true;
		}
		else System.out.println("Please try add valid price");
		
		return isPriceAdded;
	}
	
	
	public static void getItems(){
		System.out.println("The Provision Items: ");
		for( String provisionItem:provisionItems)
		System.out.println(provisionItem);
		
	}
	
	public static void getPrice(){
		System.out.println("The Provision Items Price: ");
		for(double itemPrice:itemPrices)
			System.out.println(itemPrice);
	}
	
	public static boolean updateItem(String oldItem, String newItem){
		
		System.out.println("Update Item Started");
		boolean isUpdateItem=false;
		
		for(int index=0;index<provisionItems.length;index++){
			if(oldItem==provisionItems[index]){
				
				provisionItems[index]=newItem;
				
				
				isUpdateItem=true;
			}
		}
		if(isUpdateItem==false){
			System.out.println(oldItem+"Not Found");
		}
		
		System.out.println("Update Item Ended");
	return isUpdateItem;
	}
	

	public static boolean deleteItem(String itemToBeDeleted){
		System.out.println("Delete Method Started");
		
		boolean isItemDelete=false;
		
		int newSize,oldIndex;
		
		for(newSize=0,oldIndex=0;oldIndex<provisionItems.length;oldIndex++){
			
			if(provisionItems[oldIndex]!=itemToBeDeleted){
				provisionItems[oldIndex]=provisionItems[newSize];
				newSize++;
				
				isItemDelete=true;
			}else isItemDelete=true;
		
		}
		
		provisionItems=Arrays.copyOf(provisionItems,newSize);
		
		if(isItemDelete==false){
			System.out.println(itemToBeDeleted+"Not Found");
		}
		System.out.println("Delete Method Ended");
		return isItemDelete;
		
	}
	
	
	
}