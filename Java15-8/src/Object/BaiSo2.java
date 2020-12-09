package Object;

import process.MyArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public abstract class BaiSo2 implements Manages {
    //Khởi tạo một List danh sách sinh viên
    private static List<Student> list;
    //dùng hàm add(Object o) có sẵn để thêm đối tượng
    public static boolean addStudent(Student p)
    {
        list.add(p);
        return true;
    }

    //Sửa bằng cách duyệt mảng Student, sau đó gán đối tượng cần thay thế vào vị trí i

    public boolean editStudent(Student s) {
        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
                   return true;
            }
        return false;
    }

    //Tìm kiếm: đầu tiên ta tạo một ArrayList để lưu kết quả tìm được
//sau đó ta duyệt mảng để tìm các sinh viên có tên trùng với kết quả được đưa vào rồi lưu vào mảng ArrayList đã tạo

    public static ArrayList<Student> searchPerson(Student[] list, String id){
        //Khai báo mảng kết quả
        ArrayList<Student> results = new ArrayList<>();
        //Ghi nhận
        for (Student p:list){
            if(p.getFirstName().contains(id)){
                results.add(p);
            }
        }
        return results;
    }
    //Phần này em vẫn chưa hoàn thiện ạ .
    public static ArrayList<Student> searchPersonAddress(Student[] list, Address address){
        //Khai bao mảng
        ArrayList<Student> results = new ArrayList<>();
        //Ghi nhận
        for (Student p:list){
            if(p.getAddress().getCityName().contains(address.getCityName())){
                results.add(p);
            }
        }
        return results;
    }
    public static void main(String[] args) {
        list = new ArrayList<Student>();
        ArrayList<Student> list1 = new ArrayList<Student>();
        Student[] students = new Student[3];

        Address address = new Address("Hải Phòng","Ngô Quyền","Đà Nẵng");
        Address address1 = new Address("Hải Dương","Lai Cách","Thôn Ngọ");
        Student st = new Student("Du","Nguyễn Khánh",(byte)21,address,"(2017)601219","Khoa học máy tính");
        Student st1 = new Student("Duy","Nguyễn Khánh D",(byte)21,address,"(2017)601219","Khoa học máy tính");
        Student st2 = new Student("Du","Nguyễn",(byte)21,address1,"(2017)601219","Khoa học máy tính");
        addStudent(st);
        addStudent(st1);
        addStudent(st2);

        students = list.toArray(students);
        list1 = searchPerson(students,"Du");

        for (Student s:list1) {
            System.out.println(s);
        }
    }
}
