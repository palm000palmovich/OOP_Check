package pack;

public class Bicycle extends Car{

    //конструктор
    public Bicycle(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}