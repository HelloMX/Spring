package note_4.reflect;

/**
 * Created by 马昕 on 2018/10/5.
 */
public class Car {
    private String color;
    private String brand;
    private int maxSpeed;
    public Car(){
        System.out.println("init car");
    }
    public Car(String brand,String color,int maxSpeed){
        this.brand=brand;
        this.maxSpeed=maxSpeed;
        this.color=color;
    }

    public void introduce(){
        System.out.println("brand: "+brand+" color: "+color+" maxSpeed: "+maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
