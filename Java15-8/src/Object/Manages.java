package Object;
import java.util.*;
public interface Manages {


        public static boolean addStudent(Student p){
            return false;
        };

        public static boolean editStudent(Person p) {
            return false;
        }

        public static boolean delStudent(Person p) {
            return false;
        }

        public ArrayList<Student> searchStudent(Person[] list, String name);
        public  ArrayList<Student> searchStudent(Person[] list,Address address);
    }


