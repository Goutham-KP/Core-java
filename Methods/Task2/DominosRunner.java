class DominosRunner {

    public static void main(String[] delivery) {
        
        double rate = Dominos.takeOrder("Margherita Pizza");
        System.out.println("Margherita Pizza price is : " + rate);
        double rate1 = Dominos.takeOrder("Farmhouse Pizza");
        System.out.println("Farmhouse Pizza price is : " + rate1);
        double rate2 = Dominos.takeOrder("Pepperoni Pizza");
        System.out.println("Pepperoni Pizza price is : " + rate2);
        double rate3 = Dominos.takeOrder("Cheese Burst Pizza");
        System.out.println("Cheese Burst Pizza price is : " + rate3);
        double rate4 = Dominos.takeOrder("Veggie Paradise Pizza");
        System.out.println("Veggie Paradise Pizza price is : " + rate4);
        double rate5 = Dominos.takeOrder("Chicken Supreme Pizza");
        System.out.println("Chicken Supreme Pizza price is : " + rate5);
        double rate6 = Dominos.takeOrder("Extravaganzza Pizza");
        System.out.println("Extravaganzza Pizza price is : " + rate6);
        double rate7 = Dominos.takeOrder("Burger Pizza");
        System.out.println("Burger Pizza price is : " + rate7);
        double rate8 = Dominos.takeOrder("Paneer Makhani Pizza");
        System.out.println("Paneer Makhani Pizza price is : " + rate8);
        double rate9 = Dominos.takeOrder("Mexican Green Wave Pizza");
        System.out.println("Mexican Green Wave Pizza price is : " + rate9);
        double rate10 = Dominos.takeOrder("Garlic Breadsticks");
        System.out.println("Garlic Breadsticks price is : " + rate10);
        double rate11 = Dominos.takeOrder("Cheese Garlic Bread");
        System.out.println("Cheese Garlic Bread price is : " + rate11);
        double rate12 = Dominos.takeOrder("Potato Wedges");
        System.out.println("Potato Wedges price is : " + rate12);
        double rate13 = Dominos.takeOrder("Taco Mexicana");
        System.out.println("Taco Mexicana price is : " + rate13);
        double rate14 = Dominos.takeOrder("Choco Lava Cake");
        System.out.println("Choco Lava Cake price is : " + rate14);

        double rateQty1 = Dominos.takeOrder("Margherita Pizza", 2);
        System.out.println("Price for 2 Margherita Pizzas is: " + rateQty1);
        double rateQty2 = Dominos.takeOrder("Farmhouse Pizza", 3);
        System.out.println("Price for 3 Farmhouse Pizzas is: " + rateQty2);
        double rateQty3 = Dominos.takeOrder("Pepperoni Pizza", 4);
        System.out.println("Price for 4 Pepperoni Pizzas is: " + rateQty3);
        double rateQty4 = Dominos.takeOrder("Cheese Burst Pizza", 2);
        System.out.println("Price for 2 Cheese Burst Pizzas is: " + rateQty4);
        double rateQty5 = Dominos.takeOrder("Veggie Paradise Pizza", 3);
        System.out.println("Price for 3 Veggie Paradise Pizzas is: " + rateQty5);
        double rateQty6 = Dominos.takeOrder("Chicken Supreme Pizza", 4);
        System.out.println("Price for 4 Chicken Supreme Pizzas is: " + rateQty6);
        double rateQty7 = Dominos.takeOrder("Extravaganzza Pizza", 2);
        System.out.println("Price for 2 Extravaganzza Pizzas is: " + rateQty7);
        double rateQty8 = Dominos.takeOrder("Burger Pizza", 3);
        System.out.println("Price for 3 Burger Pizzas is: " + rateQty8);
        double rateQty9 = Dominos.takeOrder("Paneer Makhani Pizza", 4);
        System.out.println("Price for 4 Paneer Makhani Pizzas is: " + rateQty9);
        double rateQty10 = Dominos.takeOrder("Mexican Green Wave Pizza", 2);
        System.out.println("Price for 2 Mexican Green Wave Pizzas is: " + rateQty10);
        double rateQty11 = Dominos.takeOrder("Garlic Breadsticks", 3);
        System.out.println("Price for 3 Garlic Breadsticks is: " + rateQty11);
        double rateQty12 = Dominos.takeOrder("Cheese Garlic Bread", 4);
        System.out.println("Price for 4 Cheese Garlic Breads is: " + rateQty12);
        double rateQty13 = Dominos.takeOrder("Potato Wedges", 2);
        System.out.println("Price for 2 Potato Wedges is: " + rateQty13);
        double rateQty14 = Dominos.takeOrder("Taco Mexicana", 3);
        System.out.println("Price for 3 Taco Mexicanas is: " + rateQty14);
        double rateQty15 = Dominos.takeOrder("Choco Lava Cake", 4);
        System.out.println("Price for 4 Choco Lava Cakes is: " + rateQty15);
    }
}