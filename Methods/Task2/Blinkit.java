class Blinkit {

    public static double takeOrder(String foodName) {
        double price = 0.0;
        if (foodName == "Plain Dosa") {
            price = 50.00;
            return price;
        }
        if (foodName == "Rava Dosa") {
            price = 70.00;
            return price;
        }
        if (foodName == "Paper Dosa") {
            price = 80.00;
            return price;
        }
        if (foodName == "Set Dosa") {
            price = 90.00;
            return price;
        }
        if (foodName == "Upma") {
            price = 60.00;
            return price;
        }
        if (foodName == "Kesari Bath") {
            price = 40.00;
            return price;
        }
        if (foodName == "Vada") {
            price = 35.00;
            return price;
        }
        if (foodName == "Medu Vada") {
            price = 45.00;
            return price;
        }
        if (foodName == "Poori Bhaji") {
            price = 80.00;
            return price;
        }
        if (foodName == "Kara Bath") {
            price = 50.00;
            return price;
        }
        if (foodName == "Sambar Vada") {
            price = 55.00;
            return price;
        }
        if (foodName == "Rasam Vada") {
            price = 55.00;
            return price;
        }
        if (foodName == "Chow Chow Bath") {
            price = 85.00;
            return price;
        }
        if (foodName == "Masala Puri") {
            price = 60.00;
            return price;
        }
        if (foodName == "Idli Vada Combo") {
            price = 65.00;
            return price;
        } else {
            System.out.println("We are not taking Order for this food currently");
        }
        return price;
    }

    public static double takeOrder(String foodName, int quantity) {
        double price = 0.0;
        if (foodName == "Plain Dosa") {
            price = 50.00;
            return price * quantity;
        }
        if (foodName == "Rava Dosa") {
            price = 70.00;
            return price * quantity;
        }
        if (foodName == "Paper Dosa") {
            price = 80.00;
            return price * quantity;
        }
        if (foodName == "Set Dosa") {
            price = 90.00;
            return price * quantity;
        }
        if (foodName == "Upma") {
            price = 60.00;
            return price * quantity;
        }
        if (foodName == "Kesari Bath") {
            price = 40.00;
            return price * quantity;
        }
        if (foodName == "Vada") {
            price = 35.00;
            return price * quantity;
        }
        if (foodName == "Medu Vada") {
            price = 45.00;
            return price * quantity;
        }
        if (foodName == "Poori Bhaji") {
            price = 80.00;
            return price * quantity;
        }
        if (foodName == "Kara Bath") {
            price = 50.00;
            return price * quantity;
        }
        if (foodName == "Sambar Vada") {
            price = 55.00;
            return price * quantity;
        }
        if (foodName == "Rasam Vada") {
            price = 55.00;
            return price * quantity;
        }
        if (foodName == "Chow Chow Bath") {
            price = 85.00;
            return price * quantity;
        }
        if (foodName == "Masala Puri") {
            price = 60.00;
            return price * quantity;
        }
        if (foodName == "Idli Vada Combo") {
            price = 65.00;
            return price * quantity;
        } else {
            System.out.println("We are not taking Order for this food currently");
        }
        return 0.0;
    }
}
