import java.util.ArrayList;

public class GiftBox {
    private ArrayList<Biscuits> biscuits;
    private ArrayList<Chocolate> chocolates;
    private double weight;

    public GiftBox(double[] biscuitWeights, double[] chocolateWeights, String[] chocolateFlavors) {
        biscuits = new ArrayList<Biscuits>();
        chocolates = new ArrayList<Chocolate>();
        for (int i = 0; i < biscuitWeights.length; i++) {
            Biscuits pack = new Biscuits(biscuitWeights[i]);
            biscuits.add(pack);
            weight += pack.getWeight();
        }
        for (int i = 0; i < chocolateWeights.length; i++) {
            Chocolate pack = new Chocolate(chocolateWeights[i], chocolateFlavors[i]);
            chocolates.add(pack);
            weight += pack.getWeight();
        }
    }

    public int getNumBiscuits() {
        return biscuits.size();
    }

    public int getNumChocolates() {
        return chocolates.size();
    }

    public double getWeight() {
        return weight;
    }

    public void showBiscuitsWeights() {
        for (Biscuits biscuit: biscuits) {
            System.out.println(biscuit.getWeight() + " ");
        }
    }

    public void showChocolatesWeights() {
        for (Chocolate chocolate: chocolates) {
            System.out.println(chocolate.getWeight() + " ");
        }
    }

    public void showChocolatesFlavors() {
        for (Chocolate chocolate: chocolates) {
            System.out.println(chocolate.getFlavor() + " ");
        }
    }

}