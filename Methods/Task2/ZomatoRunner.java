class ZomatoRunner {
    public static void main(String[] delivery) {
        
        double rate = Zomato.takeOrder("Soup");
        System.out.println("Soup price is: " + rate);
        double rate1 = Zomato.takeOrder("MuttonSoup");
        System.out.println("Mutton Soup price is: " + rate1);
        double rate2 = Zomato.takeOrder("Mutton Fry");
        System.out.println("Mutton Fry price is: " + rate2);
        double rate3 = Zomato.takeOrder("Mutton Biryani");
        System.out.println("Mutton Biryani price is: " + rate3);
        double rate4 = Zomato.takeOrder("Mutton Donne Biryani");
        System.out.println("Mutton Donne Biryani price is: " + rate4);
        double rate5 = Zomato.takeOrder("Egg Biryani");
        System.out.println("Egg Biryani price is: " + rate5);
        double rate6 = Zomato.takeOrder("Andhra Chilli Chicken");
        System.out.println("Andhra Chilli Chicken price is: " + rate6);
        double rate7 = Zomato.takeOrder("Malenadu Pepper Chicken");
        System.out.println("Malenadu Pepper Chicken price is: " + rate7);
        double rate8 = Zomato.takeOrder("Guntur Chicken");
        System.out.println("Guntur Chicken price is: " + rate8);
        double rate9 = Zomato.takeOrder("Mutton Pepper dry");
        System.out.println("Mutton Pepper dry price is: " + rate9);
        double rate10 = Zomato.takeOrder("Mutton Boti Fry");
        System.out.println("Mutton Boti Fry price is: " + rate10);
        double rate11 = Zomato.takeOrder("Mutton chops");
        System.out.println("Mutton chops price is: " + rate11);
        double rate12 = Zomato.takeOrder("Donne Biryani Rice");
        System.out.println("Donne Biryani Rice price is: " + rate12);
        double rate13 = Zomato.takeOrder("Chicken Biryani");
        System.out.println("Chicken Biryani price is: " + rate13);
        double rate14 = Zomato.takeOrder("Chicken Fry");
        System.out.println("Chicken Fry price is: " + rate14);

        double rateQty1 = Zomato.takeOrder("Soup", 2);
        System.out.println("Price for 2 Soups is: " + rateQty1);
        double rateQty2 = Zomato.takeOrder("MuttonSoup", 3);
        System.out.println("Price for 3 Mutton Soups is: " + rateQty2);
        double rateQty3 = Zomato.takeOrder("Mutton Fry", 4);
        System.out.println("Price for 4 Mutton Fries is: " + rateQty3);
        double rateQty4 = Zomato.takeOrder("Mutton Biryani", 2);
        System.out.println("Price for 2 Mutton Biryanis is: " + rateQty4);
        double rateQty5 = Zomato.takeOrder("Mutton Donne Biryani", 2);
        System.out.println("Price for 2 Mutton Donne Biryanis is: " + rateQty5);
        double rateQty6 = Zomato.takeOrder("Egg Biryani", 5);
        System.out.println("Price for 5 Egg Biryanis is: " + rateQty6);
        double rateQty7 = Zomato.takeOrder("Andhra Chilli Chicken", 3);
        System.out.println("Price for 3 Andhra Chilli Chickens is: " + rateQty7);
        double rateQty8 = Zomato.takeOrder("Malenadu Pepper Chicken", 2);
        System.out.println("Price for 2 Malenadu Pepper Chickens is: " + rateQty8);
        double rateQty9 = Zomato.takeOrder("Guntur Chicken", 4);
        System.out.println("Price for 4 Guntur Chickens is: " + rateQty9);
        double rateQty10 = Zomato.takeOrder("Mutton Pepper dry", 3);
        System.out.println("Price for 3 Mutton Pepper dry is: " + rateQty10);
        double rateQty11 = Zomato.takeOrder("Mutton Boti Fry", 2);
        System.out.println("Price for 2 Mutton Boti Fries is: " + rateQty11);
        double rateQty12 = Zomato.takeOrder("Mutton chops", 3);
        System.out.println("Price for 3 Mutton chops is: " + rateQty12);
        double rateQty13 = Zomato.takeOrder("Donne Biryani Rice", 4);
        System.out.println("Price for 4 Donne Biryani Rice is: " + rateQty13);
        double rateQty14 = Zomato.takeOrder("Chicken Biryani", 2);
        System.out.println("Price for 2 Chicken Biryanis is: " + rateQty14);
        double rateQty15 = Zomato.takeOrder("Chicken Fry", 5);
        System.out.println("Price for 5 Chicken Fries is: " + rateQty15);
    }
}