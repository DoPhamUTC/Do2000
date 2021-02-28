package BTVN_B6;

public class LapTrinhVien extends NhanVien {
    private int overtime;

    public LapTrinhVien() {
        super();
    }

    public LapTrinhVien(String id, String name, int age, String phone, String email, double basicsalary,
            int overtime) {
        super(id, name, age, phone, email, basicsalary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }
    public double Salary(){
        return super.getBasicsalary()+overtime*200000;
    }
    public int print(){
        return overtime;
    }

    
}
