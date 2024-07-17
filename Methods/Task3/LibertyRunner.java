class LibertyRunner{

	public static void main(String[] sandals){
		System.out.println("Main Started");
		
		boolean isAddShoe=Liberty.createShoeName("Bata");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("Paragon");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("Addidas");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("Puma");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("Vkc Pride");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("Vkc lite");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("prefect");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("fortune");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("Gliders");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("Foot fun");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("Senorita");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("FanFare");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("fendi");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("Flatlist");
		System.out.println("is Add Shoe: "+isAddShoe);
		isAddShoe=Liberty.createShoeName("Fendi");
		System.out.println("is Add Shoe: "+isAddShoe);
		
		Liberty.getShoe();
		
		boolean isUpdateShoe=Liberty.updateShoeName("Addidas","Folk");
		System.out.println("Is update Shoe : "+isUpdateShoe);
		
		Liberty.getShoe();
	
	}
	
}