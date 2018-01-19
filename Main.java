 private static Boots boots;
    private static Boots boots1;
    private static Dress dress;
    private static Shopsite shopsite;

    public static void main(String[] args) {

        // shopsite = new Shopsite();
        Boots anotherBoots = new Boots();
        initGoods(anotherBoots,dress);

        //System.out.println(boots.getBrend());

        addGoodsToTheShop(shopsite, boots, dress);

    }

    private static void addGoodsToTheShop(Shopsite shopsite, Boots boots, Dress dress) {
        if (shopsite != null) {
            if (boots != null && dress != null) {
                shopsite.setDress(dress);
                shopsite.setSportBoots(boots);
                System.out.println(shopsite.getSportBoots().getBrend());
            }
        }
    }

    private static void initGoods(Boots b, Dress d) {
        b.setBrend("csds");
        b.setPrice(18);
        b.setCount(45);
        boots = new Boots(23, "Nike", 100);
        dress = new Dress(15, "Bershka", 95);
    }


}
