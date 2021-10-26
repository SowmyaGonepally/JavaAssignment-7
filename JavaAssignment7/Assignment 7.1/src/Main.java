public class Main
{
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[3];
        System.out.println("-----Mouse------");
        rodents[0]=new Mouse();
        rodents[0].growingTeeth();
        rodents[0].gnawFood();
        rodents[0].feedsOn();
        rodents[0].getBodyWeight();
        System.out.println("------Gerbil------");
        rodents[1]=new Gerbil();
        rodents[1].growingTeeth();
        rodents[1].gnawFood();
        rodents[1].feedsOn();
        rodents[1].getBodyWeight();
        System.out.println("-----Hamster------");
        rodents[2]=new Hamster();
        rodents[2].growingTeeth();
        rodents[2].gnawFood();
        rodents[2].feedsOn();
        rodents[2].getBodyWeight();
    }
}
