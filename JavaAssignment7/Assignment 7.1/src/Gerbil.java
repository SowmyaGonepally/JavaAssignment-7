public class Gerbil extends Rodent{
    Gerbil()
    {
        System.out.println("This is a gerbil");
    }
    @Override
    void feedsOn() {
        System.out.println("Gerbil feeds on bananas, apples, carrots");
    }

    @Override
    void getBodyWeight() {
        System.out.println("Gerbil has a weight of 1.5 Kg");
    }
}
