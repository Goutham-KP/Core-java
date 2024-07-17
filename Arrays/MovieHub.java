class MovieHub{
	static String englishMovies[]={"The Shawshank Redemption","The Godfather","The Dark Knight","Pulp Fiction","Schindler's List","The Lord of the Rings: The Return of the King","Fight Club","Forrest Gump","Inception","The Matrix","Goodfellas","The Silence of the Lambs","Seven","The Usual Suspects","The Lion King","Saving Private Ryan","The Green Mile","Interstellar","Gladiator","Braveheart","Titanic","The Departed","Back to the Future","Jurassic Park","Star Wars: Episode V - The Empire Strikes Back"};
	static String kannadaMovies[]={"K.G.F: Chapter 1", "K.G.F: Chapter 2","Katheyondu Shuruvagide","Humble Politician Nograj", "Chambal", "Yuvarathnaa", "Act 1978", "Gantumoote", "Ammachi Yemba Nenapu", "Kavaludaari", "Love Mocktail", "Rathnan Prapancha", "Kotigobba 3", "Bheemasena Nalamaharaja", "Bharaate", "Birbal", "Yaana", "Ikkat", "Odeya", "Bell Bottom", "Pogaru", "Geetha", "Seetharaam Benoy:Case No18","Ondu Shikariya Kathe","99"};
	static String topMovies[]={"Bird Box", "Extraction", "The Irishman", "The Kissing Booth 2","6 Underground", "Spencer Confidential", "Enola Holmes", "Project Power","Army of the Dead","Red Notice"};
	static String hindiMoviesorSeries[]={"Sacred Games", "Delhi Crime", "Ludo", "Ghoul", "Paava Kadhaigal", "Jamtara: Sabka Number Ayega", "She", "Bard of Blood", "Tribhanga - Tedhi Medhi Crazy", "Ray", "Little Things", "Guilty", "Mismatched", "Raat Akeli Hai", "Bombay Begums", "Choked: Paisa Bolta Hai", "AK vs AK", "Masaba Masaba", "Betaal", "Dolly Kitty Aur Woh Chamakte Sitare", "Bulbbul", "Haseen Dillruba", "Chopsticks","Jagame Thandhiram","Ye Kaali Kaali Ankhein"};
	static String koreanSeries[]={"Crash Landing on You", "Kingdom", "Vincenzo", "It's Okay to Not Be Okay", "Start-Up", "Sweet Home", "Hospital Playlist", "The Uncanny Counter", "Love Alarm", "My ID is Gangnam Beauty", "Stranger", "Extracurricular", "My Holo Love", "Arthdal Chronicles", "The King: Eternal Monarch", "Hi Bye, Mama!", "Rugal", "Memories of the Alhambra", "Tomorrow with You", "A Korean Odyssey"};
	
	public static void main(String[] movies){
		//System.out.println("The Top 25 English Movies in Netflix are: "+englishMovies[0]+" "+englishMovies[1]+" "+englishMovies[2]+" "+englishMovies[3]+" "+englishMovies[4]+" "+englishMovies[5]+englishMovies[6]+" "+englishMovies[7]+" "+englishMovies[8]+" "+englishMovies[9]+" "+englishMovies[10]+" "+englishMovies[11]+" "+englishMovies[12]+" "+englishMovies[13]+" "+englishMovies[14]+" "+englishMovies[15]+" "+englishMovies[16]+" "+englishMovies[17]+" "+englishMovies[18]+" "+englishMovies[19]+" "+englishMovies[20]+" "+englishMovies[21]+" "+englishMovies[22]+" "+englishMovies[23]+" "+englishMovies[24]);
		
		//System.out.println("The Top 25 Kannada Movies in Amazon Prime are: "+kannadaMovies[0]+" "+kannadaMovies[1]+" "+kannadaMovies[2]+" "+kannadaMovies[3]+" "+kannadaMovies[4]+" "+kannadaMovies[5]+kannadaMovies[6]+" "+kannadaMovies[7]+" "+kannadaMovies[8]+" "+kannadaMovies[9]+" "+kannadaMovies[10]+" "+kannadaMovies[11]+" "+kannadaMovies[12]+" "+kannadaMovies[13]+" "+kannadaMovies[14]+" "+kannadaMovies[15]+" "+kannadaMovies[16]+" "+kannadaMovies[17]+" "+kannadaMovies[18]+" "+kannadaMovies[19]+" "+kannadaMovies[20]+" "+kannadaMovies[21]+" "+kannadaMovies[22]+" "+kannadaMovies[23]+" "+kannadaMovies[24]);
		
		//System.out.println("The Top 10 Movies in Netflix are: "+topMovies[0]+" "+topMovies[1]+" "+topMovies[2]+" "+topMovies[3]+" "+topMovies[4]+" "+topMovies[5]+" "+topMovies[6]+" "+topMovies[7]+" "+topMovies[8]+" "+topMovies[9]+" "+topMovies[10]);
		
		//System.out.println("The Top 25 Hindi Movies  or Series in Netflix are: "+hindiMoviesorSeries[0]+" "+hindiMoviesorSeries[1]+" "+hindiMoviesorSeries[2]+" "+hindiMoviesorSeries[3]+" "+hindiMoviesorSeries[4]+" "+hindiMoviesorSeries[5]+hindiMoviesorSeries[6]+" "+hindiMoviesorSeries[7]+" "+hindiMoviesorSeries[8]+" "+hindiMoviesorSeries[9]+" "+hindiMoviesorSeries[10]+" "+hindiMoviesorSeries[11]+" "+hindiMoviesorSeries[12]+" "+hindiMoviesorSeries[13]+" "+hindiMoviesorSeries[14]+" "+hindiMoviesorSeries[15]+" "+hindiMoviesorSeries[16]+" "+hindiMoviesorSeries[17]+" "+hindiMoviesorSeries[18]+" "+hindiMoviesorSeries[19]+" "+hindiMoviesorSeries[20]+" "+hindiMoviesorSeries[21]+" "+hindiMoviesorSeries[22]+" "+hindiMoviesorSeries[23]+" "+hindiMoviesorSeries[24]);
		
		//System.out.println("The Top 25 English Movies in Netflix are: "+koreanSeries[0]+" "+koreanSeries[1]+" "+koreanSeries[2]+" "+koreanSeries[3]+" "+koreanSeries[4]+" "+koreanSeries[5]+koreanSeries[6]+" "+koreanSeries[7]+" "+koreanSeries[8]+" "+koreanSeries[9]+" "+koreanSeries[10]+" "+koreanSeries[11]+" "+koreanSeries[12]+" "+koreanSeries[13]+" "+koreanSeries[14]+" "+koreanSeries[15]+" "+koreanSeries[16]+" "+koreanSeries[17]+" "+koreanSeries[18]+" "+koreanSeries[19]+" "+koreanSeries[20]);
	
		System.out.println("The Top 25 English Movies are: ");
		for(index=0;index<englishMovies.length;index++){
			System.out.println(englishMovies[index]);
		}
		System.out.println("The Top 25 Kannada Movies are: ");
		for(int i=0;i<kannadamovies.length;i++){
			System.out.println(kannadaMovies[i]);
		}
		System.out.println("The Top 10 Movies of Netflix: ");
		for(index=0;index=topMovies.length;index++){
			System.out.println(topMovies[index]);
		}
		System.out.println("The Top Hindi Movies OR Series: ")
		for(index=0;index<hindiMoviesorSeries.length;index++){
			System.out.println(hindiMoviesorSeries[index]);
		}
		System.out.println("The Top 25 Korean Series : ");
		for(int i=0;i<koreanSeries.length;i++){
			System.out.println(koreanSeries[i]);
		}
		
	}
}