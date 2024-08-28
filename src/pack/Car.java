package pack;

public class Car {


    private String modelName;
    private int wheelsCount;

    //конструктор
    public Car(String modelName, int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    //геттеры
    public String getModelName(){
        return this.modelName;
    }
    public int getWheelsCount(){
        return this.wheelsCount;
    }

    //сеттеры
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    public void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}