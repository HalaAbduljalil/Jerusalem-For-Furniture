package sample;

public class userbedroom {
    String carbit;
    String closet;
    String curtains;

    public userbedroom(String carbitcolor, String closetsize, String curtainscolor, String bedcolor, String bedsize, String price, int numoflights, String roomarea, String numofframes, String id) {
        this.carbit = carbitcolor;
        this.closet = closetsize;
        this.curtains = curtainscolor;
        this.bidcolor = bedcolor;
        this.bedsize = bedsize;
        this.price = price;
        this.lights = numoflights;
        this.area = roomarea;
        this.frames = numofframes;
        this.id = id;
    }

    public void setCarbit(String carbit) {
        this.carbit = carbit;
    }

    public void setCloset(String closet) {
        this.closet = closet;
    }

    public void setCurtains(String curtains) {
        this.curtains = curtains;
    }

    public void setBidcolor(String bidcolor) {
        this.bidcolor = bidcolor;
    }

    public void setBedsize(String bedsize) {
        this.bedsize = bedsize;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setFrames(String frames) {
        this.frames = frames;
    }

    String bidcolor;

    public String getCarbit() {
        return carbit;
    }

    public String getCloset() {
        return closet;
    }

    public String getCurtains() {
        return curtains;
    }

    public String getBidcolor() {
        return bidcolor;
    }

    public String getBedsize() {
        return bedsize;
    }

    public String getPrice() {
        return price;
    }

    public int getLights() {
        return lights;
    }

    public String getArea() {
        return area;
    }

    public String getFrames() {
        return frames;
    }

    String bedsize;

    public void setId(String id) {
        this.id = id;
    }

    String price;

    public String getId() {
        return id;
    }

    String id ;

 /*   public userbedroom(String carbit, String closet, String curtains, String bidcolor, String bedsize, String price, int lights, String area, String frames,String id) {
        this.carbit = carbit;
        this.closet = closet;
        this.curtains = curtains;
        this.bidcolor = bidcolor;
        this.bedsize = bedsize;
        this.price = price;
        this.lights = lights;
        this.area = area;
        this.frames = frames;
        this.id = id;
    }*/

    int lights;
    String area;
    String frames;
}