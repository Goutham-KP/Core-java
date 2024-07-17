class WatchShopRunner{


	public static void main(String[] time){
	
		System.out.println("Main Started");
		boolean isWatch=WatchShop.createWatchName("Rolex");
		System.out.println("Is Add Watch: "+isWatch);
		 isWatch=WatchShop.createWatchName("Fastrack");
		System.out.println("Is Add Watch: "+isWatch);
		 isWatch=WatchShop.createWatchName("FireBolt");
		System.out.println("Is Add Watch: "+isWatch);
		 isWatch=WatchShop.createWatchName("Noise");
		System.out.println("Is Add Watch: "+isWatch);
		 isWatch=WatchShop.createWatchName("Boult");
		System.out.println("Is Add Watch: "+isWatch);
		 isWatch=WatchShop.createWatchName("Boat");
		System.out.println("Is Add Watch: "+isWatch);
		 isWatch=WatchShop.createWatchName("Quatrz");
		System.out.println("Is Add Watch: "+isWatch);
		 isWatch=WatchShop.createWatchName("Hmt");
		System.out.println("Is Add Watch: "+isWatch);
		 isWatch=WatchShop.createWatchName("Sonata");
		System.out.println("Is Add Watch: "+isWatch);
		 isWatch=WatchShop.createWatchName("Fossil");
		System.out.println("Is Add Watch: "+isWatch);
		
		
		WatchShop.getWatch();
		
		boolean isUpdateWatch=WatchShop.updateWatchName("Quatrz","Ben10");
		System.out.println("Is Watch updated: "+isUpdateWatch);
		
		WatchShop.getWatch();
		
		boolean isWatchDeleted=GoldShop.deleteGoldItem("Sonata");
		System.out.println("Is Watch Name Deleted: "+isWatchDeleted);
		
		WatchShop.getWatch();
		
		System.out.println("Main Ended");
	}
}