class FoodPandaRunner {
    public static void main(String[] deliver) {
        
        double rate = FoodPanda.takeOrder("Burger");
        System.out.println("Burger price is: " + rate);
        double rate1 = FoodPanda.takeOrder("Cheeseburger");
        System.out.println("Cheeseburger price is: " + rate1);
        double rate2 = FoodPanda.takeOrder("Veggie Burger");
        System.out.println("Veggie Burger price is: " + rate2);
        double rate3 = FoodPanda.takeOrder("Chicken Sandwich");
        System.out.println("Chicken Sandwich price is: " + rate3);
        double rate4 = FoodPanda.takeOrder("Club Sandwich");
        System.out.println("Club Sandwich price is: " + rate4);
        double rate5 = FoodPanda.takeOrder("Grilled Cheese Sandwich");
        System.out.println("Grilled Cheese Sandwich price is: " + rate5);
        double rate6 = FoodPanda.takeOrder("French Fries");
        System.out.println("French Fries price is: " + rate6);
        double rate7 = FoodPanda.takeOrder("Onion Rings");
        System.out.println("Onion Rings price is: " + rate7);
        double rate8 = FoodPanda.takeOrder("Caesar Salad");
        System.out.println("Caesar Salad price is: " + rate8);
        double rate9 = FoodPanda.takeOrder("Garden Salad");
        System.out.println("Garden Salad price is: " + rate9);
        double rate10 = FoodPanda.takeOrder("Chicken Salad");
        System.out.println("Chicken Salad price is: " + rate10);
        double rate11 = FoodPanda.takeOrder("Tomato Soup");
        System.out.println("Tomato Soup price is: " + rate11);
        double rate12 = FoodPanda.takeOrder("Chicken Noodle Soup");
        System.out.println("Chicken Noodle Soup price is: " + rate12);
        double rate13 = FoodPanda.takeOrder("Minestrone Soup");
        System.out.println("Minestrone Soup price is: " + rate13);
        double rate14 = FoodPanda.takeOrder("Clam Chowder");
        System.out.println("Clam Chowder price is: " + rate14);

        double rateQty1 = FoodPanda.takeOrder("Burger", 2);
        System.out.println("Price for 2 Burgers is: " + rateQty1);
        double rateQty2 = FoodPanda.takeOrder("Cheeseburger", 3);
        System.out.println("Price for 3 Cheeseburgers is: " + rateQty2);
        double rateQty3 = FoodPanda.takeOrder("Veggie Burger", 4);
        System.out.println("Price for 4 Veggie Burgers is: " + rateQty3);
        double rateQty4 = FoodPanda.takeOrder("Chicken Sandwich", 2);
        System.out.println("Price for 2 Chicken Sandwiches is: " + rateQty4);
        double rateQty5 = FoodPanda.takeOrder("Club Sandwich", 2);
        System.out.println("Price for 2 Club Sandwiches is: " + rateQty5);
        double rateQty6 = FoodPanda.takeOrder("Grilled Cheese Sandwich", 5);
        System.out.println("Price for 5 Grilled Cheese Sandwiches is: " + rateQty6);
        double rateQty7 = FoodPanda.takeOrder("French Fries", 3);
        System.out.println("Price for 3 French Fries is: " + rateQty7);
        double rateQty8 = FoodPanda.takeOrder("Onion Rings", 2);
        System.out.println("Price for 2 Onion Rings is: " + rateQty8);
        double rateQty9 = FoodPanda.takeOrder("Caesar Salad", 4);
        System.out.println("Price for 4 Caesar Salads is: " + rateQty9);
        double rateQty10 = FoodPanda.takeOrder("Garden Salad", 3);
        System.out.println("Price for 3 Garden Salads is: " + rateQty10);
        double rateQty11 = FoodPanda.takeOrder("Chicken Salad", 2);
        System.out.println("Price for 2 Chicken Salads is: " + rateQty11);
        double rateQty12 = FoodPanda.takeOrder("Tomato Soup", 5);
        System.out.println("Price for 5 Tomato Soups is: " + rateQty12);
        double rateQty13 = FoodPanda.takeOrder("Chicken Noodle Soup", 3);
        System.out.println("Price for 3 Chicken Noodle Soups is: " + rateQty13);
        double rateQty14 = FoodPanda.takeOrder("Minestrone Soup", 4);
        System.out.println("Price for 4 Minestrone Soups is: " + rateQty14);
        double rateQty15 = FoodPanda.takeOrder("Clam Chowder", 2);
        System.out.println("Price for 2 Clam Chowders is: " + rateQty15);
    }
}