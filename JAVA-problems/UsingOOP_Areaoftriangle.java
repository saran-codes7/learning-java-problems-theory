public class UsingOOP_Areaoftriangle {
    private double base;
    private double height;
    UsingOOP_Areaoftriangle(double base, double height){
        this.base=base;
        this.height=height;
    }
    public double calculateArea(){
         return 0.5*base*height;
    }
    public static void main(String[] args) {
        UsingOOP_Areaoftriangle triangle=new UsingOOP_Areaoftriangle(10,20);
        System.out.println("Area of the triangle is: "+triangle.calculateArea());
    }
}
