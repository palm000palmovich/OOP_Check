package pack;


public class Truck extends Car{


    //конструктор
    public Truck(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    //Внутренние методы
    public String updateTyre() {
        return "Меняем покрышку";
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    //////////////////////////////////

    @Override
    public String toString() {
        return "Модель: " + getModelName() + ", количество колес: " + getWheelsCount();
    }

    //Чекер
    public void Check(){
        if (getModelName() != null && getWheelsCount() != 0){
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                System.out.println(updateTyre() + " " + (i+1));
            }
            checkEngine();
            checkTrailer();
        }
    }

}