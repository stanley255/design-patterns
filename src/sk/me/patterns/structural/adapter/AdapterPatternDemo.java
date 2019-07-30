package sk.me.patterns.structural.adapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        // Wrap a bird in a birdAdapter so that it behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.print("Sparrow (fly): ");
        sparrow.fly();
        System.out.print("\n");
        System.out.print("Sparrow (makeSound): ");
        sparrow.makeSound();
        System.out.print("\n");

        System.out.print("ToyDuck (squeak): ");
        toyDuck.squeak();
        System.out.print("\n");

        // toy duck behaving like a bird
        System.out.print("BirdAdapter (squeak): ");
        birdAdapter.squeak();
        System.out.print("\n");
    }

}
