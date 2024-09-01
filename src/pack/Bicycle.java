package pack;


public class Bicycle extends Car{


    //конструктор
    public Bicycle(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    //Внутренние методы
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {}

    @Override
    public void checkTrailer(){}
    ////////////////////////////

    @Override
    public String toString() {
        return "Модель: " + getModelName() + ", количество колес: " + getWheelsCount();
    }
}