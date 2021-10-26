public class Mouse extends Rodent{
    Mouse()
    {
        System.out.println("This is a mouse");
    }
    @Override
    void feedsOn() {
        System.out.println("Mouse feeds on fruits or grains from plants");
    }

    @Override
    void getBodyWeight() {
        System.out.println("Mouse has a weight of 1 Kg");
    }
}
