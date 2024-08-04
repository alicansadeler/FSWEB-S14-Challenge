package org.example;

public class HealthyBurger extends Hamburger {

  private String healthyExtra1Name;
  private double healthyExtra1Price;
  private String healthyExtra2Name;
  private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);

    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public String getHealthyExtra() {
        return healthyExtra1Name + healthyExtra2Name;
    }



    @Override
    public double getMalzemelerPrice() {
        return getHealthyExtra1Price() + getHealthyExtra2Price();
    }

    @Override
    public String itemizeHamburger() {
        return "Hamburger{" +
                "name='" + getName() + '\'' +
                ", meat='" + getMeat() + '\'' +
                ", price=" + getPrice() +
                ", breadRollType='" + getBreadRollType() + '\'' +
                ", Sağlıklı ekMalzemeler=" + getHealthyExtra() +
                ", Total price=" + (getMalzemelerPrice() + getPrice()) +
                '}';
    }
}
