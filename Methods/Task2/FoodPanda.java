class FoodPanda {
    
    public static double takeOrder(String foodName) {
        double price = 0.0;
        if (foodName == "Burger") {
            price = 99.00;
            return price;
        }
        if (foodName == "Cheeseburger") {
            price = 129.00;
            return price;
        }
        if (foodName == "Veggie Burger") {
            price = 89.00;
            return price;
        }
        if (foodName == "Chicken Sandwich") {
            price = 119.00;
            return price;
        }
        if (foodName == "Club Sandwich") {
            price = 139.00;
            return price;
        }
        if (foodName == "Grilled Cheese Sandwich") {
            price = 79.00;
            return price;
        }
        if (foodName == "French Fries") {
            price = 49.00;
            return price;
        }
        if (foodName == "Onion Rings") {
            price = 59.00;
            return price;
        }
        if (foodName == "Caesar Salad") {
            price = 89.00;
            return price;
        }
        if (foodName == "Garden Salad") {
            price = 79.00;
            return price;
        }
        if (foodName == "Chicken Salad") {
            price = 99.00;
            return price;
        }
        if (foodName == "Tomato Soup") {
            price = 49.00;
            return price;
        }
        if (foodName == "Chicken Noodle Soup") {
            price = 69.00;
            return price;
        }
        if (foodName == "Minestrone Soup") {
            price = 59.00;
            return price;
        }
        if (foodName == "Clam Chowder") {
            price = 79.00;
            return price;
        } else {
            System.out.println("Currently we are not taking orders for this food");
        }
        return price;
    }
    
    public static double takeOrder(String foodName, int quantity) {
        double price = 0.0;
        if (foodName == "Burger") {
            price = 99.00;
            return price * quantity;
        }
        if (foodName == "Cheeseburger") {
            price = 129.00;
            return price * quantity;
        }
        if (foodName == "Veggie Burger") {
            price = 89.00;
            return price * quantity;
        }
        if (foodName == "Chicken Sandwich") {
            price = 119.00;
            return price * quantity;
        }
        if (foodName == "Club Sandwich") {
            price = 139.00;
            return price * quantity;
        }
        if (foodName == "Grilled Cheese Sandwich") {
            price = 79.00;
            return price * quantity;
        }
        if (foodName == "French Fries") {
            price = 49.00;
            return price * quantity;
        }
        if (foodName == "Onion Rings") {
            price = 59.00;
            return price * quantity;
        }
        if (foodName == "Caesar Salad") {
            price = 89.00;
            return price * quantity;
        }
        if (foodName == "Garden Salad") {
            price = 79.00;
            return price * quantity;
        }
        if (foodName == "Chicken Salad") {
            price = 99.00;
            return price * quantity;
        }
        if (foodName == "Tomato Soup") {
            price = 49.00;
            return price * quantity;
        }
        if (foodName == "Chicken Noodle Soup") {
            price = 69.00;
            return price * quantity;
        }
        if (foodName == "Minestrone Soup") {
            price = 59.00;
            return price * quantity;
        }
        if (foodName == "Clam Chowder") {
            price = 79.00;
            return price * quantity;
        } else {
            System.out.println("Currently we are not taking orders for this food");
        }
        return 0.0;
    }
}
