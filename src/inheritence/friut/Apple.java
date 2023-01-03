package inheritence.friut;

public class Apple {
    private int weight;
    private int price;

    public Apple(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public void getPrice(int weight) {
        int pay = weight * price;
        System.out.println(pay);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
