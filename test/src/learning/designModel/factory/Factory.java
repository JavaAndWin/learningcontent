package learning.designModel.factory;

public class Factory {
    public static Car getCar(String car) {
        if (car.equals("比亚迪")) {
            return new Byd();
        } else if (car.equals("特斯拉")) {
            return new Tesla();
        }else {
            System.out.println("没有这种车");
            return null;
        }
    }
    public static Car getByd(){
        return new Byd();
    }
    public static Car getTesla(){
        return new Tesla();
    }
}
