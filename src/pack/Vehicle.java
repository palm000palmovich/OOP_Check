package pack;


public interface Vehicle {
    //геттеры
    String getModelName();

    int getWheelsCount();

    //сеттеры
    void setModelName(String modelName);

    void setWheelsCount(int wheelsCount);

    //Внутренние методы
    String updateTyre();

    void checkEngine();
    void checkTrailer();
    void Check();

    @Override
    String toString();
}
