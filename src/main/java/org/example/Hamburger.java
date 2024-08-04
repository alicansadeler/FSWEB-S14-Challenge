package org.example;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String name, String meat, double price, String breadRollType, String addition1Name,
                     double addition1Price, String addition2Name, double addition2Price, String addition3Name,
                     double addition3Price, String addition4Name, double addition4Price) {
        this(name, meat, price, breadRollType);
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public String getEkstralar() {
        return getAddition1Name() + getAddition2Name() + getAddition3Name() + getAddition4Name();
    }

    public double getMalzemelerPrice() {
        return getAddition1Price() + getAddition2Price() + getAddition3Price() + getAddition4Price();
    }



    public double getPrice() {
        return getMalzemelerPrice() + price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String itemizeHamburger() {
        String malzemeResult = getEkstralar() == null ? "Ekstra Malzeme Seçilmedi" : getEkstralar();

        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRollType='" + breadRollType + '\'' +
                ", ekMalzemeler=" + malzemeResult +
                ", Total price=" + getPrice() +
                '}';
    }


}
