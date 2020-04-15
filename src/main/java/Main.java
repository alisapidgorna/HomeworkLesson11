public class Main {
    public static void main(String[] args) {

        Woman woman = new Woman("Mariya","Ukrainian", "QA", "Green", "Brown", 2, 41);
        Man man = new Man("Ivan","Ukrainian","Java developer","Blue",2,44,2300,340);

        woman.study("Java");
        man.study("Java");
        woman.talk("English and Ukrainian");
        man.talk("French and Ukrainian");
        woman.move(4);
        man.move(6);
        woman.run(10);
        man.run(9);
        woman.mood("Good, perfect, super!!!");
        woman.hobby("Gym, sewing, improving English, learning to code");
        man.hobby("Football, learning to code");
        System.out.println();
        man.earnMoney();
        man.buyHouse();
        man.marryAWoman("Mariya");
    }
}
