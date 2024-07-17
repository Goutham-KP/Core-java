class Zepto {
    
    public static double takeOrder(String foodName) {
        double price = 0.0;
        if (foodName == "Idli") {
            price = 30.00;
            return price;
        }
        if (foodName == "Dosa") {
            price = 50.00;
            return price;
        }
        if (foodName == "Masala Dosa") {
            price = 70.00;
            return price;
        }
        if (foodName == "Upma") {
            price = 60.00;
            return price;
        }
        if (foodName == "Vada") {
            price = 35.00;
            return price;
        }
        if (foodName == "Pongal") {
            price = 80.00;
            return price;
        }
        if (foodName == "Bisi Bele Bath") {
            price = 90.00;
            return price;
        }
        if (foodName == "Rava Kesari") {
            price = 50.00;
            return price;
        }
        if (foodName == "Mysore Pak") {
            price = 40.00;
            return price;
        }
        if (foodName == "Sambar Rice") {
            price = 70.00;
            return price;
        }
        if (foodName == "Rasam Rice") {
            price = 60.00;
            return price;
        }
        if (foodName == "Curd Rice") {
            price = 50.00;
            return price;
        }
        if (foodName == "Lemon Rice") {
            price = 65.00;
            return price;
        }
        if (foodName == "Tamarind Rice") {
            price = 75.00;
            return price;
        }
        if (foodName == "Akki Rotti") {
            price = 55.00;
            return price;
        } else {
            System.out.println("The Food Unavailable");
        }
        return price;
    }
    
    public static double takeOrder(String foodName, int quantity) {
        double price = 0.0;
        if (foodName == "Idli") {
            price = 30.00;
            return price * quantity;
        }
        if (foodName == "Dosa") {
            price = 50.00;
            return price * quantity;
        }
        if (foodName == "Masala Dosa") {
            price = 70.00;
            return price * quantity;
        }
        if (foodName == "Upma") {
            price = 60.00;
            return price * quantity;
        }
        if (foodName == "Vada") {
            price = 35.00;
            return price * quantity;
        }
        if (foodName == "Pongal") {
            price = 80.00;
            return price * quantity;
        }
        if (foodName == "Bisi Bele Bath") {
            price = 90.00;
            return price * quantity;
        }
        if (foodName == "Rava Kesari") {
            price = 50.00;
            return price * quantity;
        }
        if (foodName == "Mysore Pak") {
            price = 40.00;
            return price * quantity;
        }
        if (foodName == "Sambar Rice") {
            price = 70.00;
            return price * quantity;
        }
        if (foodName == "Rasam Rice") {
            price = 60.00;
            return price * quantity;
        }
        if (foodName == "Curd Rice") {
            price = 50.00;
            return price * quantity;
        }
        if (foodName == "Lemon Rice") {
            price = 65.00;
            return price * quantity;
        }
        if (foodName == "Tamarind Rice") {
            price = 75.00;
            return price * quantity;
        }
        if (foodName == "Akki Rotti") {
            price = 55.00;
            return price * quantity;
        } else {
            System.out.println("The Food Unavailable");
        }
        return 0.0;
    }
}