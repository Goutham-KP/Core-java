class SportsMania{
	static String iplTeams[]={"Royal Challengers Bengaluru","Mumbai Indians","Gujrath Titans","LucknowSuper Gaints","Rajasthan Royals","Delhi Capitals","Punjab KIngs","Sunrisers Hyderabad","Kolkata Knight Riders"};
	static String batsmens[]={"Virat Kholi","David Warner","Suresh Raina","Ab Devillers","KL Rahul","Shikar Dhawan","Glen Maxwell","Pollard","Shane Watson","Chris Gayle"};
	static String bolwers[]={"Lasith Malinga","Dwayne bravo","Yuzi Chahal","Jasprit Bumrah","Vinay Kumar","Dale Steyn","Mitchel Starc","Trent Boult","Mohammed Shami","Harshal Patel"};
	static String teams[]={"Australia","India","New Zealand","England","South Africa","West Indies","Afghanisthan","Sri Lanka","Bangladesh","USA"};
	
	public static void main(String[] cricket){
		
		System.out.println("The IPL Teams are: "+iplTeams[0]+" "+iplTeams[1]+" "+iplTeams[2]+" "+iplTeams[3]+" "+iplTeams[4]+" "+iplTeams[5]+" "+iplTeams[6]+" "+iplTeams[7]+" "+iplTeams[8]);
		System.out.println("The Top 10 IPL Batsmens Are: "+batsmens[0]+" "+batsmens[1]+" "+batsmens[2]+" "+batsmens[3]+" "+batsmens[4]+" "+batsmens[5]+" "+batsmens[6]+" "+batsmens[7]+" "+batsmens[8]+" "+batsmens[9]);
		System.out.println("The Top 10 IPL Bowlers Are: "+bolwers[0]+" "+bolwers[1]+" "+bolwers[2]+" "+bolwers[3]+" "+bolwers[4]+" "+bolwers[5]+" "+bolwers[6]+" "+bolwers[7]+" "+bolwers[8]+" "+bolwers[9]);
	    System.out.println("The Top 10 ICC  Cricket Teams  Are: "+teams[0]+" "+teams[1]+" "+teams[2]+" "+teams[3]+" "+teams[4]+" "+teams[5]+" "+teams[6]+" "+teams[7]+" "+teams[8]+" "+teams[9]);
	    
		System.out.println("The IPL Teams: ");
		for(index=0;index<iplTeams.length;index++){
			System.out.println(iplTeams[index]);
		}
		System.out.println("The Top 10 IPL Batsmens are: ");
		for(int i=0;i<batsmens.length;i++){
			System.out.println(batsmens[i]);
		}
		System.out.println("The Top 10 IPL Bowlers: ");
		for(index=0;index<bowlers.length;index++){
			System.out.println(bowlers[index]);
		}
		System.out.printn("The TOP ICC Teams : ");
		for(int i=0;i<yeams.length;i++){
			System.out.println(teams[i]);
		}
		
	}
}

