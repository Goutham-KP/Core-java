class Dominos {

    public static double takeOrder(String foodName) {
        double price = 0.0;
        if (foodName == "Margherita Pizza") {
            price = 199.00;
            return price;
        }
        if (foodName == "Farmhouse Pizza") {
            price = 249.00;
            return price;
        }
        if (foodName == "Pepperoni Pizza") {
            price = 269.00;
            return price;
        }
        if (foodName == "Cheese Burst Pizza") {
            price = 299.00;
            return price;
        }
        if (foodName == "Veggie Paradise Pizza") {
            price = 279.00;
            return price;
        }
        if (foodName == "Chicken Supreme Pizza") {
            price = 319.00;
            return price;
        }
        if (foodName == "Extravaganzza Pizza") {
            price = 349.00;
            return price;
        }
        if (foodName == "Burger Pizza") {
            price = 189.00;
            return price;
        }
        if (foodName == "Paneer Makhani Pizza") {
            price = 259.00;
            return price;
        }
        if (foodName == "Mexican Green Wave Pizza") {
            price = 289.00;
            return price;
        }
        if (foodName == "Garlic Breadsticks") {
            price = 99.00;
            return price;
        }
        if (foodName == "Cheese Garlic Bread") {
            price = 129.00;
            return price;
        }
        if (foodName == "Potato Wedges") {
            price = 119.00;
            return price;
        }
        if (foodName == "Taco Mexicana") {
            price = 149.00;
            return price;
        }
        if (foodName == "Choco Lava Cake") {
            price = 129.00;
            return price;
        } else {
            System.out.println("The Food is Unavilabel");
        }
        return price;
    }

    public static double takeOrder(String foodName, int quantity) {
        double price = 0.0;
        if (foodName == "Margherita Pizza") {
            price = 199.00;
            return price * quantity;
        }
        if (foodName == "Farmhouse Pizza") {
            price = 249.00;
            return price * quantity;
        }
        if (foodName == "Pepperoni Pizza") {
            price = 269.00;
            return price * quantity;
        }
        if (foodName == "Cheese Burst Pizza") {
            price = 299.00;
            return price * quantity;
        }
        if (foodName == "Veggie Paradise Pizza") {
            price = 279.00;
            return price * quantity;
        }
        if (foodName == "Chicken Supreme Pizza") {
            price = 319.00;
            return price * quantity;
        }
        if (foodName == "Extravaganzza Pizza") {
            price = 349.00;
            return price * quantity;
        }
        if (foodName == "Burger Pizza") {
            price = 189.00;
            return price * quantity;
        }
        if (foodName == "Paneer Makhani Pizza") {
            price = 259.00;
            return price * quantity;
        }
        if (foodName == "Mexican Green Wave Pizza") {
            price = 289.00;
            return price * quantity;
        }
        if (foodName == "Garlic Breadsticks") {
            price = 99.00;
            return price * quantity;
        }
        if (foodName == "Cheese Garlic Bread") {
            price = 129.00;
            return price * quantity;
        }
        if (foodName == "Potato Wedges") {
            price = 119.00;
            return price * quantity;
        }
        if (foodName == "Taco Mexicana") {
            price = 149.00;
            return price * quantity;
        }
        if (foodName == "Choco Lava Cake") {
            price = 129.00;
            return price * quantity;
        } else {
            System.out.println("The Food is Unavilabel");
        }
        return 0.0;
    }
}
