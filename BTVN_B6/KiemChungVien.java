package BTVN_B6;

public class KiemChungVien extends NhanVien{
    private int error;

    public KiemChungVien() {
        super();
    }

    public KiemChungVien(String id, String name, int age, String phone, String email, double basicsalary, int error) {
        super(id, name, age, phone, email, basicsalary);
        this.error = error;
    }
    

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
    
    public double Salary(){
        return super.getBasicsalary()+error*50000;
    }
    public int print(){
        return error;
    }
}
