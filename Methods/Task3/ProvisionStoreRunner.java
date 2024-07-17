class ProvisionStoreRunner{


	public static void main(String[] store){
	
		System.out.println("Main Started");
		
		boolean isItemAdded=ProvisionStore.addItem("Raw Rice");
		System.out.println("Item Added: "+isItemAdded);
		boolean isPrice=ProvisionStore.addPrice(50.0);
		System.out.println("Item Price added: "+isPrice);
		isItemAdded=ProvisionStore.addItem("oils");
		System.out.println("Item Added: "+isItemAdded);
		 isPrice=ProvisionStore.addPrice(60.0);
		System.out.println("Item Price added: "+isPrice);
		isItemAdded=ProvisionStore.addItem("Soaps");
		System.out.println("Item Added: "+isItemAdded);
		 isPrice=ProvisionStore.addPrice(70.0);
		System.out.println("Item Price added: "+isPrice);
		isItemAdded=ProvisionStore.addItem("Shampoos");
		System.out.println("Item Added: "+isItemAdded);
		 isPrice=ProvisionStore.addPrice(100.0);
		System.out.println("Item Price added: "+isPrice);
		isItemAdded=ProvisionStore.addItem("Detergents");
		System.out.println("Item Added: "+isItemAdded);
		 isPrice=ProvisionStore.addPrice(150.0);
		System.out.println("Item Price added: "+isPrice);
		isItemAdded=ProvisionStore.addItem("Washing detergents");
		System.out.println("Item Added: "+isItemAdded);
		 isPrice=ProvisionStore.addPrice(250.0);
		System.out.println("Item Price added: "+isPrice);
		
		//ProvisionStore.getItems();
		
		
		
		
		
		boolean isItemUpdate=ProvisionStore.updateItem("Detergents","Musquito Coil");
		System.out.println("Is Update Item: "+isItemUpdate);
		
		ProvisionStore.getItems();
		ProvisionStore.getPrice();
		
		boolean isDeleteItem=ProvisionStore.deleteItem("Washing detergents");
		System.out.println("Is Delete Item: "+isDeleteItem);
		
		ProvisionStore.getItems();
		
		
		
		System.out.println("Main Ended");
		
	}
}