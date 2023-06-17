package sample;

public class userorder {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getOrderno() {
        return orderno;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    String orderno;

    public userorder(String name, String orderno, String paymentmethod, String email, String address) {
        this.name = name;
        this.orderno = orderno;
        this.paymentmethod = paymentmethod;
        this.email = email;
        this.address = address;
    }

    String paymentmethod;
    String email;
    String address ;
}
