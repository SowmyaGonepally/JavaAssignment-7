public abstract class Rodent {

    Rodent()
    {
        System.out.println("This is a rodent");
    }
    void growingTeeth()
    {
        System.out.println("All rodents possess constantly growing rootless incisors that have a hard enamel layer" +
                " on the front of each tooth and softer dentine behind. ");
    }
    void gnawFood()
    {
        System.out.println("All rodents have oversized front teeth for gnawing");
    }
    abstract void getBodyWeight();
    abstract void feedsOn();
}
