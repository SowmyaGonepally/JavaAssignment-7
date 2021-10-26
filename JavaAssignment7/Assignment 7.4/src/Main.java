public class Main {
    public static void main(String[] args) {
        UnicycleFactory unicycleFactory=new UnicycleFactory();
        Unicycle unicycle=unicycleFactory.createUnicycle();
        unicycle.balance();
        BicycleFactory bicycleFactory=new BicycleFactory();
        Bicycle bicycle=bicycleFactory.createBicycle();
        bicycle.balance();
        TricycleFactory tricycleFactory=new TricycleFactory();
        Tricycle tricycle=tricycleFactory.createTricycle();
        tricycle.balance();
    }
}
