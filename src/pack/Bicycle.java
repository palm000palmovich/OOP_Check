package pack;


public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount); // Устанавливаем количество колес для велосипеда
    }

    @Override
    public String updateTyre() {
        return "Меняем покрышку на велосипеде ";
    }

    @Override
    public void checkEngine() {
        throw new UnsupportedOperationException("У велосипеда нет двигателя");
    }

    //Чекер
    public void Check() {
        if (getModelName() != null && getWheelsCount() != 0) {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                System.out.println(updateTyre() + " " + (i + 1));
            }
        }
    }
}
