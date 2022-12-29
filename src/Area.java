public class Area {
    private double length;
    private double width;

    Area(double length, double width){
        this.length=length;
        this.width=width;
    }

    public void getArea(){
        double area=length*width;
        System.out.println("Area: "+area+"cm");
    }
}

class RunAre{
    public static void main(String[] args) {
        Area a=new Area(8.32,6.21);
        a.getArea();
    }
}
