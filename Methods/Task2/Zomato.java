class Zomato {
    
    public static double takeOrder(String foodName) {
        double price = 0.0;
        if (foodName == "Soup") {
            price = 40.00;
            return price;
        }
        if (foodName == "MuttonSoup") {
            price = 150.00;
            return price;
        }
        if (foodName == "Mutton Fry") {
            price = 240.00;
            return price;
        }
        if (foodName == "Mutton Biryani") {
            price = 250.00;
            return price;
        }
        if (foodName == "Mutton Donne Biryani") {
            price = 309.00;
            return price;
        }
        if (foodName == "Egg Biryani") {
            price = 179.00;
            return price;
        }
        if (foodName == "Andhra Chilli Chicken") {
            price = 199.00;
            return price;
        }
        if (foodName == "Malenadu Pepper Chicken") {
            price = 189.00;
            return price;
        }
        if (foodName == "Guntur Chicken") {
            price = 169.00;
            return price;
        }
        if (foodName == "Mutton Pepper dry") {
            price = 319.00;
            return price;
        }
        if (foodName == "Mutton Boti Fry") {
            price = 219.00;
            return price;
        }
        if (foodName == "Mutton chops") {
            price = 329.00;
            return price;
        }
        if (foodName == "Donne Biryani Rice") {
            price = 159.00;
            return price;
        }
        if (foodName == "Chicken Biryani") {
            price = 155.00;
            return price;
        }
        if (foodName == "Chicken Fry") {
            price = 125.00;
            return price;
        } else {
            System.out.println("The Food is Currently unavailable");
        }
        return price;
    }
    
    public static double takeOrder(String foodName, int quantity) {
        double price = 0.0;
        if (foodName == "Soup") {
            price = 40.00;
            return price * quantity;
        }
        if (foodName == "MuttonSoup") {
            price = 150.00;
            return price * quantity;
        }
        if (foodName == "Mutton Fry") {
            price = 240.00;
            return price * quantity;
        }
        if (foodName == "Mutton Biryani") {
            price = 250.00;
            return price * quantity;
        }
        if (foodName == "Mutton Donne Biryani") {
            price = 309.00;
            return price * quantity;
        }
        if (foodName == "Egg Biryani") {
            price = 179.00;
            return price * quantity;
        }
        if (foodName == "Andhra Chilli Chicken") {
            price = 199.00;
            return price * quantity;
        }
        if (foodName == "Malenadu Pepper Chicken") {
            price = 189.00;
            return price * quantity;
        }
        if (foodName == "Guntur Chicken") {
            price = 169.00;
            return price * quantity;
        }
        if (foodName == "Mutton Pepper dry") {
            price = 319.00;
            return price * quantity;
        }
        if (foodName == "Mutton Boti Fry") {
            price = 219.00;
            return price * quantity;
        }
        if (foodName == "Mutton chops") {
            price = 329.00;
            return price * quantity;
        }
        if (foodName == "Donne Biryani Rice") {
            price = 159.00;
            return price * quantity;
        }
        if (foodName == "Chicken Biryani") {
            price = 155.00;
            return price * quantity;
        }
        if (foodName == "Chicken Fry") {
            price = 125.00;
            return price * quantity;
        } else {
            System.out.println("Currently the food is unavailable");
        }
        return 0.0;
    }
}
		
	