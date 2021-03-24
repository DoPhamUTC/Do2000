package Exercise7;

public class Rectange extends Geometry implements Irectangle {
    private Double cd ;
    private Double cr;
    public Rectange(Double cd, Double cr) {
        this.cd = cd;
        this.cr = cr;
    }
    public Double getCd() {
        return cd;
    }
    public void setCd(Double cd) {
        this.cd = cd;
    }
    public Double getCr() {
        return cr;
    }
    public void setCr(Double cr) {
        this.cr = cr;
    }
    @Override
    public Double Diagonalline(Double cd, Double cr) {
        return Math.sqrt(cd*cd+cr*cr);
    }
    @Override
    public Double Perimeter(){
        return 2*(cd+cr);
    }
    @Override
    public Double Acreage(){
        return cd*cr;
    }
    @Override
    void Display() {
       System.out.println("Chu vi : "+Perimeter()+"\nDien tich : "+Acreage()+"\nDuong cheo : "+Diagonalline(cd, cr));
    }
}
