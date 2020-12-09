package Object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student extends Person {
    //constants
    public static final String ID="(2020)0123600000";
    public static final String SPECIALTY = "NONE";

    //Student's propertise
    private String id;
    private String specialy;
    private static List<Student> list;


    //Constructor medthod
    public Student(){
        this(Student.FIRSTNAME,Student.LASTNAME,Student.AGE,Student.address,Student.ID,Student.SPECIALTY);
    }

    public Student(String firstName,String lastName,byte age,Address address,String id, String specialy){
        //Khởi tạo đối tượng cha Person
        super(firstName,lastName,age,address);
        //gán giá trị cho đối tượng con Student
        this.id = id;
        this.specialy = specialy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpecialy() {
        return specialy;
    }

    public void setSpecialy(String specialy) {
        this.specialy = specialy;
    }
    public static boolean addStudent(Student p)
    {
        list.add(p);
        return true;
    }
    public static boolean delStudent(Student s) {
         for (int i = 0; i < list.size(); i++) {
            Student t = list.get(i);
             if (t.getId() == s.getId()) {
                list.remove(i);
            }
        }
        return true;
    }
    @Override
    public String toString(){
        return "Student [" + super.toString() + " - ID= "+ id+", SPECIALTY = " + specialy+" ]";
    }

    public static void main(String[] args) {
        list = new ArrayList<Student>();
        Address address = new Address("Hải Phòng","Ngô Quyền","Đà Nẵng");
        Student st = new Student("Duy","Nguyễn Khánh",(byte)21,address,"(2017)601219","Khoa học máy tính");
        Student st1 = new Student("Duy","Nguyễn Khánh",(byte)21,address,"(2017)601219","Khoa học máy tính");
        Student st2 = new Student("Duy","Nguyễn",(byte)21,address,"(2017)601219","Khoa học máy tính");
        addStudent(st);
        addStudent(st1);
        delStudent(st);
        for (Student s:list) {
            System.out.println(s);
        }

    }

}
