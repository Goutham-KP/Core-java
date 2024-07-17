class GoldRunner{

	public static void main(String[] uma){
		System.out.println("Main Started");
		
		boolean isGoldAdded=GoldShop.addGoldItems("Long Necklace");
		System.out.println("Is this Gold Item Added: "+isGoldAdded);
		isGoldAdded=GoldShop.addGoldItems("Full Jada");
		System.out.println("Is this Gold Item Added: "+isGoldAdded);
		isGoldAdded=GoldShop.addGoldItems("Pendant");
		System.out.println("Is this Gold Item Added: "+isGoldAdded);
		isGoldAdded=GoldShop.addGoldItems("Half Jada");
		System.out.println("Is this Gold Item Added: "+isGoldAdded);
		isGoldAdded=GoldShop.addGoldItems("Jada Billa");
		System.out.println("Is this Gold Item Added: "+isGoldAdded);
		isGoldAdded=GoldShop.addGoldItems("Gold Ring");
		System.out.println("Is this Gold Item Added: "+isGoldAdded);
		isGoldAdded=GoldShop.addGoldItems("Vaddanam");
		System.out.println("Is this Gold Item Added: "+isGoldAdded);
		
		
		GoldShop.getGoldItems();
		
		boolean isGoldUpdate=GoldShop.updateGoldItems("Half Jada","Gold Necklace");
		System.out.println("Is Gold Name Updated: "+isGoldUpdate);
		
		GoldShop.getGoldItems();
		
		boolean isGoldDeleted=GoldShop.deleteGoldItem("Long Necklace");
		System.out.println("Is Gold Name Deleted: "+isGoldDeleted);
		
		GoldShop.getGoldItems();
		
	}
	
	
}
		