class BlinkitRunner {

    public static void main(String[] delivery) {
        
        double rate = Blinkit.takeOrder("Plain Dosa");
        System.out.println("Plain Dosa price is : " + rate);
        double rate1 = Blinkit.takeOrder("Rava Dosa");
        System.out.println("Rava Dosa price is : " + rate1);
        double rate2 = Blinkit.takeOrder("Paper Dosa");
        System.out.println("Paper Dosa price is : " + rate2);
        double rate3 = Blinkit.takeOrder("Set Dosa");
        System.out.println("Set Dosa price is : " + rate3);
        double rate5 = Blinkit.takeOrder("Upma");
        System.out.println("Upma price is : " + rate5);
        double rate6 = Blinkit.takeOrder("Kesari Bath");
        System.out.println("Kesari Bath price is : " + rate6);
        double rate7 = Blinkit.takeOrder("Vada");
        System.out.println("Vada price is : " + rate7);
        double rate8 = Blinkit.takeOrder("Medu Vada");
        System.out.println("Medu Vada price is : " + rate8);
        double rate9 = Blinkit.takeOrder("Poori Bhaji");
        System.out.println("Poori Bhaji price is : " + rate9);
        double rate10 = Blinkit.takeOrder("Kara Bath");
        System.out.println("Kara Bath price is : " + rate10);
        double rate15 = Blinkit.takeOrder("Sambar Vada");
        System.out.println("Sambar Vada price is : " + rate15);
        double rate16 = Blinkit.takeOrder("Rasam Vada");
        System.out.println("Rasam Vada price is : " + rate16);
        double rate17 = Blinkit.takeOrder("Chow Chow Bath");
        System.out.println("Chow Chow Bath price is : " + rate17);
        double rate18 = Blinkit.takeOrder("Masala Puri");
        System.out.println("Masala Puri price is : " + rate18);
        double rate19 = Blinkit.takeOrder("Idli Vada Combo");
        System.out.println("Idli Vada Combo price is : " + rate19);

        double rateQty1 = Blinkit.takeOrder("Plain Dosa", 2);
        System.out.println("Price for 2 Plain Dosas is: " + rateQty1);
        double rateQty2 = Blinkit.takeOrder("Rava Dosa", 3);
        System.out.println("Price for 3 Rava Dosas is: " + rateQty2);
        double rateQty3 = Blinkit.takeOrder("Paper Dosa", 4);
        System.out.println("Price for 4 Paper Dosas is: " + rateQty3);
        double rateQty4 = Blinkit.takeOrder("Set Dosa", 2);
        System.out.println("Price for 2 Set Dosas is: " + rateQty4);
        double rateQty5 = Blinkit.takeOrder("Upma", 3);
        System.out.println("Price for 3 Upmas is: " + rateQty5);
        double rateQty6 = Blinkit.takeOrder("Kesari Bath", 4);
        System.out.println("Price for 4 Kesari Baths is: " + rateQty6);
        double rateQty7 = Blinkit.takeOrder("Vada", 2);
        System.out.println("Price for 2 Vadas is: " + rateQty7);
        double rateQty8 = Blinkit.takeOrder("Medu Vada", 3);
        System.out.println("Price for 3 Medu Vadas is: " + rateQty8);
        double rateQty9 = Blinkit.takeOrder("Poori Bhaji", 2);
        System.out.println("Price for 2 Poori Bhajis is: " + rateQty9);
        double rateQty10 = Blinkit.takeOrder("Kara Bath", 3);
        System.out.println("Price for 3 Kara Baths is: " + rateQty10);
        double rateQty11 = Blinkit.takeOrder("Sambar Vada", 2);
        System.out.println("Price for 2 Sambar Vadas is: " + rateQty11);
        double rateQty12 = Blinkit.takeOrder("Rasam Vada", 4);
        System.out.println("Price for 4 Rasam Vadas is: " + rateQty12);
        double rateQty13 = Blinkit.takeOrder("Chow Chow Bath", 2);
        System.out.println("Price for 2 Chow Chow Baths is: " + rateQty13);
        double rateQty14 = Blinkit.takeOrder("Masala Puri", 3);
        System.out.println("Price for 3 Masala Puris is: " + rateQty14);
        double rateQty15 = Blinkit.takeOrder("Idli Vada Combo", 2);
        System.out.println("Price for 2 Idli Vada Combos is: " + rateQty15);
    }
}
