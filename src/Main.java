public class Main {
    public static void main(String[] args) {
        // Задача 1
        Human max=new Human();
        Human anna=new Human();
        Human ket=new Human();
        Human artem=new Human();
        max.name = "Максим";
        max.yearOfBirth = 35;
        max.town = "Минск";
        anna.name = "Аня";
        anna.yearOfBirth = 29;
        anna.town = "Москва";
        ket.name = "Катя";
        ket.yearOfBirth = 28;
        ket.town = "Калининград";
        artem.name = "Артем";
        artem.yearOfBirth = 27;
        artem.town = "Москва";


        System.out.println(max.toString());
        System.out.println(anna.toString());
        System.out.println(ket.toString());
        System.out.println(artem.toString());
    }
}