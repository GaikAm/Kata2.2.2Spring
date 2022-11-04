package web.Model;

public class Car {

    private String model;
    private int series;
    private short age;

    public Car(String model, int series, short age) {
        this.model = model;
        this.series = series;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public short getAge() {
        return age;
    }
}
