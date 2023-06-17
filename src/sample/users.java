package sample;

public class users {
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    String password,salary;
    String firstName;
    String lastName;
    String street;
    String email;
    String position;
    String city;
    public users(String firstName, String lastName, String email, String password, String position, String salary, String city, String street) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.position=position;
        this.city=city;
        this.street=street;
        this.password=password;
        this.salary=salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }




    public String getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }



    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public void setCity(String city) {
        this.city = city;
    }


    public void setStreet(String street) {
        this.street = street;
    }



}
