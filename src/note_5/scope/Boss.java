package note_5.scope;

/**
 * Created by 马昕 on 2018/10/9.
 */
public class Boss {
    private String name;
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return name+"'s "+ car.toString();
    }
}
