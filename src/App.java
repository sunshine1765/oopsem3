import java.util.*;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);
        Student s7 = new Student("Гриша", 24);
        Student s8 = new Student("Олег", 20);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);



        List<StudentGroup> listGroup = new ArrayList<>();
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);
        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        listGroup.add(group4580);
        listGroup.add(group4581);
        StudentSteam steam1 = new StudentSteam(listGroup, 1);
        System.out.println(group4580);

        for (Iterator<StudentGroup> it = steam1.iterator(); it.hasNext();) {
            StudentGroup std = it.next();
            for(Student stud: std){
                System.out.println(stud);
            }
        }

        System.out.println("=========================================================");
        for(StudentGroup std: steam1.getSteamGroup())
        {
            System.out.println(std);
        }

        System.out.println(steam1);

        Collections.sort(group4580.getGroup());
        Collections.sort(steam1.getSteamGroup(), new Comparator<StudentGroup>() {
            @Override
            public int compare(StudentGroup o1, StudentGroup o2) {
                if(o1.getGroup().size() > o2.getGroup().size()) return 1;
                if(o1.getGroup().size() < o2.getGroup().size()) return -1;
                return 0;
            }
        });

        for(StudentGroup std: steam1.getSteamGroup())
        {
            System.out.println(std);
        }
        System.out.println(steam1);
    }
}
