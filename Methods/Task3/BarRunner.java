class BarRunner{


	public static void main(String[] alcohol){
		System.out.println("Main Started");
		
		boolean isWineAdd=Bar.addWineName("Old Monk");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Tuborg");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Breezer");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("BudWizer");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("magic moments");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Bagpiper");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Kingfisher");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("power cool");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Ub");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Mansion House");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Imperial Blue");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Old Traven");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Bro code");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Balck Dog");
		System.out.println("Is Wine Added: "+isWineAdd);
		isWineAdd=Bar.addWineName("Royal Challenege");
		System.out.println("Is Wine Added: "+isWineAdd);
		
		Bar.getWine();
		
		
		boolean isWineUpdate=Bar.updateWineName("Breezer","Scotch Yard");
		System.out.println("Is Update Wine Name: "+isWineUpdate);
		
		Bar.getWine();
		
		boolean isWineDelete=Bar.deleteWineName("BudWizer");
		System.out.println("Is Delete Wine Name: "+isWineDelete);
		
		Bar.getWine();
		
	}
	
}