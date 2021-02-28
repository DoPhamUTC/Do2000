package BTVN_B5;

public class Student  {
    public int msv ;
    public String hoten ;
    public float diemlythuyet;
    public float diemth;

    public Student() {
    }

    public Student(int msv, String hoten, float diemlythuyet, float diemth) {
        this.msv = msv;
        this.hoten = hoten;
        this.diemlythuyet = diemlythuyet;
        this.diemth = diemth;
    }
    
    public float DTB(){
        return (diemlythuyet+diemth)/2;
    }
    public void display(){
        System.out.println(msv+"\t"+hoten+"\t"+diemlythuyet+"\t"+diemth+"\t"+DTB());
    }
    
}
