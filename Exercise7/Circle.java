package Exercise7;

public class Circle extends Geometry implements Icircle{
    private Double r;

    public static void main(String[] args) {
       
    }

    public Circle(Double r) {
        this.r = r;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }
    @Override
    public Double Diameter(Double r) {
        return r*2;
    }
    @Override
    public Double Perimeter(){
        return 2*Math.PI*r;
    }
    @Override
    public Double Acreage(){
        return Math.PI*r*r;
    }
    @Override
    void Display() {
        System.out.println("Chu vi : "+Perimeter()+"\nDien tich : "+Acreage()+"\nDuong kinh : "+Diameter(r));
    }
}
