package sample;

public class userssalon {
    public String getWoodtype() {
        return woodtype;
    }

    public String getFabrictype() {
        return fabrictype;
    }

    public String getFurniturecolor() {
        return furniturecolor;
    }

    public int getNumofseats() {
        return numofseats;
    }

    public String getTablesize() {
        return tablesize;
    }

    public String getCarbitcolor() {
        return carbitcolor;
    }

    public int getNumofaccessorizing() {
        return numofaccessorizing;
    }

    public void setWoodtype(String woodtype) {
        this.woodtype = woodtype;
    }

    public void setFabrictype(String fabrictype) {
        this.fabrictype = fabrictype;
    }

    public void setFurniturecolor(String furniturecolor) {
        this.furniturecolor = furniturecolor;
    }

    public void setNumofseats(int numofseats) {
        this.numofseats = numofseats;
    }

    public void setTablesize(String tablesize) {
        this.tablesize = tablesize;
    }

    public void setCarbitcolor(String carbitcolor) {
        this.carbitcolor = carbitcolor;
    }

    public void setNumofaccessorizing(int numofaccessorizing) {
        this.numofaccessorizing = numofaccessorizing;
    }

    public void setCurtainscolor(String curtainscolor) {
        this.curtainscolor = curtainscolor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCurtainscolor() {
        return curtainscolor;
    }

    public int getPrice() {
        return price;
    }

    String woodtype;
    String fabrictype;
    String furniturecolor;

    public userssalon(String woodtype, String fabrictype, String furniturecolor, int numofseats, String tablesize, String carbitcolor, int numofaccessorizing, String curtainscolor, int price) {
        this.woodtype = woodtype;
        this.fabrictype = fabrictype;
        this.furniturecolor = furniturecolor;
        this.numofseats = numofseats;
        this.tablesize = tablesize;
        this.carbitcolor = carbitcolor;
        this.numofaccessorizing = numofaccessorizing;
        this.curtainscolor = curtainscolor;
        this.price = price;
    }

    int numofseats;
    String tablesize;
    String carbitcolor;
    int numofaccessorizing;
    String curtainscolor;
    int price ;








}
