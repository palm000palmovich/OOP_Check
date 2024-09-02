package pack;


public  class Car extends Vehicle {


    //конструктор
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    //геттеры

    public String getModelName() {
        return this.modelName;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }

    //сеттеры
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    //Внутренние методы
    @Override
    public String updateTyre() {
        return "Меняем покрышку";
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {}
    ////////////////////////////////////////


    @Override
    public String toString() {
        return "Модель: " + modelName + ", количество колес: " + wheelsCount;
    }

    //Чекер
    public void Check() {
        if (this.modelName != null && this.wheelsCount!= 0) {
            System.out.println("Обслуживаем " + this.modelName);
            for (int i = 0; i < this.wheelsCount; i++) {
                System.out.println(updateTyre() + " " + (i+1));
            }
            checkEngine();
        }
    }

}