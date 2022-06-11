import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GiftBox> giftBoxes = new ArrayList<GiftBox>();
        double[] biscuitsWeights = {400.0, 150.0};
        double[] chocolateWeights = {300.0, 800.0};
        String[] chocolateFlavors = {"milk", "dark"};
        giftBoxes.add(new GiftBox(biscuitsWeights, chocolateWeights, chocolateFlavors));
        for (GiftBox box: giftBoxes) {
            if (box.getWeight() > 1000.0) {
                System.out.println("The box with " + box.getNumBiscuits() + " biscuits and "
                        + box.getNumChocolates() + " chocolates is overweight.");
            }
            System.out.println("The biscuit weights are: ");
            box.showBiscuitsWeights();
            System.out.println("The chocolate weights are: ");
            box.showChocolatesWeights();
            System.out.println("The chocolate flavors are: ");
            box.showChocolatesFlavors();
        }
    }

}