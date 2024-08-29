package pack;


public interface Vehicle {
    //геттеры
    String getModelName();

    int getWheelsCount();

    //сеттеры
    void setModelName(String modelName);

    void setWheelsCount(int wheelsCount);

    //Внутренние методы
    void updateTyre();

    void checkEngine();
    public void checkTrailer();

    @Override
    String toString();
}
