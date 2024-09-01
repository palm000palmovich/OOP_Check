package pack;


public  class Car implements Vehicle {


    private String modelName;
    private int wheelsCount;

    //конструктор
    public Car(String modelName, int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    //геттеры
    @Override
    public String getModelName(){
        return this.modelName;
    }
    @Override
    public int getWheelsCount(){
        return this.wheelsCount;
    }

    //сеттеры
    @Override
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    @Override
    public void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    //Внутренние методы
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {}
    ////////////////////////////////////////


    @Override
    public String toString() {
        return "Модель: " + modelName + ", количество колес: " + wheelsCount;
    }
}