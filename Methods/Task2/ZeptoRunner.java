class ZeptoRunner {
    public static void main(String[] delivery) {
        
        double rate = Zepto.takeOrder("Idli");
        System.out.println("Idli price is: " + rate);
        double rate1 = Zepto.takeOrder("Dosa");
        System.out.println("Dosa price is: " + rate1);
        double rate2 = Zepto.takeOrder("Masala Dosa");
        System.out.println("Masala Dosa price is: " + rate2);
        double rate3 = Zepto.takeOrder("Upma");
        System.out.println("Upma price is: " + rate3);
        double rate4 = Zepto.takeOrder("Vada");
        System.out.println("Vada price is: " + rate4);
        double rate5 = Zepto.takeOrder("Pongal");
        System.out.println("Pongal price is: " + rate5);
        double rate6 = Zepto.takeOrder("Bisi Bele Bath");
        System.out.println("Bisi Bele Bath price is: " + rate6);
        double rate7 = Zepto.takeOrder("Rava Kesari");
        System.out.println("Rava Kesari price is: " + rate7);
        double rate8 = Zepto.takeOrder("Mysore Pak");
        System.out.println("Mysore Pak price is: " + rate8);
        double rate9 = Zepto.takeOrder("Sambar Rice");
        System.out.println("Sambar Rice price is: " + rate9);
        double rate10 = Zepto.takeOrder("Rasam Rice");
        System.out.println("Rasam Rice price is: " + rate10);
        double rate11 = Zepto.takeOrder("Curd Rice");
        System.out.println("Curd Rice price is: " + rate11);
        double rate12 = Zepto.takeOrder("Lemon Rice");
        System.out.println("Lemon Rice price is: " + rate12);
        double rate13 = Zepto.takeOrder("Tamarind Rice");
        System.out.println("Tamarind Rice price is: " + rate13);
        double rate14 = Zepto.takeOrder("Akki Rotti");
        System.out.println("Akki Rotti price is: " + rate14);

        double rateQty1 = Zepto.takeOrder("Idli", 2);
        System.out.println("Price for 2 Idlis is: " + rateQty1);
        double rateQty2 = Zepto.takeOrder("Dosa", 3);
        System.out.println("Price for 3 Dosas is: " + rateQty2);
        double rateQty3 = Zepto.takeOrder("Masala Dosa", 4);
        System.out.println("Price for 4 Masala Dosas is: " + rateQty3);
        double rateQty4 = Zepto.takeOrder("Upma", 2);
        System.out.println("Price for 2 Upmas is: " + rateQty4);
        double rateQty5 = Zepto.takeOrder("Vada", 2);
        System.out.println("Price for 2 Vadas is: " + rateQty5);
        double rateQty6 = Zepto.takeOrder("Pongal", 5);
        System.out.println("Price for 5 Pongals is: " + rateQty6);
        double rateQty7 = Zepto.takeOrder("Bisi Bele Bath", 3);
        System.out.println("Price for 3 Bisi Bele Baths is: " + rateQty7);
        double rateQty8 = Zepto.takeOrder("Rava Kesari", 2);
        System.out.println("Price for 2 Rava Kesaris is: " + rateQty8);
        double rateQty9 = Zepto.takeOrder("Mysore Pak", 4);
        System.out.println("Price for 4 Mysore Paks is: " + rateQty9);
        double rateQty10 = Zepto.takeOrder("Sambar Rice", 3);
        System.out.println("Price for 3 Sambar Rices is: " + rateQty10);
        double rateQty11 = Zepto.takeOrder("Rasam Rice", 2);
        System.out.println("Price for 2 Rasam Rices is: " + rateQty11);
        double rateQty12 = Zepto.takeOrder("Curd Rice", 5);
        System.out.println("Price for 5 Curd Rices is: " + rateQty12);
        double rateQty13 = Zepto.takeOrder("Lemon Rice", 3);
        System.out.println("Price for 3 Lemon Rices is: " + rateQty13);
        double rateQty14 = Zepto.takeOrder("Tamarind Rice", 4);
        System.out.println("Price for 4 Tamarind Rices is: " + rateQty14);
        double rateQty15 = Zepto.takeOrder("Akki Rotti", 2);
        System.out.println("Price for 2 Akki Rottis is: " + rateQty15);
    }
}

