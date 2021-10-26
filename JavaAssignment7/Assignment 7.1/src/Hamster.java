public class Hamster extends Rodent{
    Hamster()
    {
        System.out.println("This is a hamster");
    }
    @Override
    void feedsOn() {
        System.out.println("Hamster feeds on broccoli,kale,cauliflower");
    }

    @Override
    void getBodyWeight() {
        System.out.println("Hamster has a weight of 2 Kg");
    }
}
