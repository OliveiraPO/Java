public class App{
    public static void main(String[] args) {
        Player P1 = new Player("Elon", 20, 2, 2);
        Player P2 = new Player("Steve", 10, 2, 1);
        Player P3 = new Player("Jeff", 20, 2, 2);
        Player P4 = new Player("Bill", 40, 8, 6);
        Player P5 = new Player("Joe", 30, 6, 3);

        P1.battle(P2);
        P3.battle(P4);
        P1.battle(P4);
        P4.battle(P5);
    }
}