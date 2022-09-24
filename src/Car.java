public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    @Override
    public String toString() {
        return "Автомбиль { " +
                "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя=" + engineVolume +
                ", цвет кузова='" + color + '\'' +
                ", год выпуска=" + productionYear +
                ", страна сборки='" + productionCountry + '\'' +
                '}';
    }
}
