package sample;

public class users2 {
    public void setDoor(String door) {
        this.door = door;
    }

    public void setMirror(String mirror) {
        this.mirror = mirror;
    }

    public void setCarbit(String carbit) {
        this.carbit = carbit;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setChandelier(String chandelier) {
        this.chandelier = chandelier;
    }

    public String getDoor() {
        return door;
    }

    public String getMirror() {
        return mirror;
    }

    public String getCarbit() {
        return carbit;
    }

    public String getPrice() {
        return price;
    }

    public String getHight() {
        return hight;
    }

    public String getWidth() {
        return width;
    }

    public String getChandelier() {
        return chandelier;
    }

    String door;
    String mirror;
    String carbit;
    String price;
    String hight;
    String width;

    public String getNumfranes() {
        return numfranes;
    }

    String chandelier;

    public void setNumfranes(String numfranes) {
        this.numfranes = numfranes;
    }

    String numfranes;
    public users2(String door, String mirror, String carbit,String price,String hight, String width, String numfranes, String chandelier ) {
        this.door = door;
        this.mirror = mirror;
        this.carbit = carbit;
        this.price = price;
        this.hight = hight;
        this.width = width;
        this.chandelier = chandelier;
        this.numfranes=numfranes;
    }






}
