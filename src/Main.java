public class Main {
    public static void main(String[] args) {
        // Задача 1
        Human max=new Human();
             max.name = "Максим";
             max.yearOfBirth = 35;
             max.town = "Минск";
        Human anna=new Human();
            anna.name = "Аня";
            anna.yearOfBirth = 29;
            anna.town = "Москва";
        Human ket=new Human();
            ket.name = "Катя";
            ket.yearOfBirth = 28;
            ket.town = "Калининград";
        Human artem=new Human();
            artem.name = "Артем";
            artem.yearOfBirth = 27;
            artem.town = "Москва";

        max.job = "бренд-менеджер";
        anna.job = "методист образовательных программ";
        ket.job = "продакт-менеджер";
        artem.job = "директор по развитию бизнеса";


        System.out.println(max.toString());
        System.out.println(anna.toString());
        System.out.println(ket.toString());
        System.out.println(artem.toString());
        // Задание 3
        Car lada=new Car();
            lada.brand = "Lada";
            lada.model = "Lada Grande";
            lada.engineVolume = 1.7f;
            lada.color = "Желтый";
            lada.productionYear=2015;
            lada.productionCountry = "Россия";
        Car audi=new Car();
            audi.brand = "Audi";
            audi.model = "Audi A8 50 L TDI quattro";
            audi.engineVolume = 3.0f;
            audi.color = "Черный";
            audi.productionYear=2020;
            audi.productionCountry = "Германия";
        Car bmw=new Car();
            bmw.brand = "BMW";
            bmw.model = "BMW Z8";
            bmw.engineVolume = 3.0f;
            bmw.color = "Черный";
            bmw.productionYear=2021;
            bmw.productionCountry = "Германия";
        Car kia=new Car();
            kia.brand = "Kia";
            kia.model = "Kia Sportage 4";
            kia.engineVolume = 2.4f;
            kia.color = "Красный";
            kia.productionYear=2018;
            kia.productionCountry = "Южная корея";
        Car hyundai=new Car();
            hyundai.brand = "Hyundai";
            hyundai.model = "Hyundai Avante";
            hyundai.engineVolume = 1.6f;
            hyundai.color = "Оранжевый";
            hyundai.productionYear=2016;
            hyundai.productionCountry = "Южная корея";

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());






    }
}