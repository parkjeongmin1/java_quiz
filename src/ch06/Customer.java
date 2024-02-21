package ch06;

public class Customer {
    private  String name;
    private  String phone;
    private  String juso;
    private  int point;

    public Customer(String name, String phone, String juso, int point){
        this.name = name;
        this.phone = phone;
        this.juso = juso;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJuso() {
        return juso;
    }

    public void setJuso(String juso) {
        this.juso = juso;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
