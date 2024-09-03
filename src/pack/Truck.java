package pack;


public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount); // Устанавливаем количество колес для грузовика
    }

    @Override
    public String updateTyre() {
        return "Меняем покрышку грузовика";
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика " + modelName);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика " + modelName);
    }

    //Чекер
    public void Check() {
        if (getModelName() != null && getWheelsCount() != 0) {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                System.out.println(updateTyre() + " " + (i + 1));
            }
            checkEngine();
            checkTrailer();
        }
    }
}

