package Week2;

public class StudentManagement {
    Student [] list = new Student[100];
    int index = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent){
        list[index] = newStudent;
        this.index++;
        System.out.println();
    }

    public String studentsByGroup() {
        String listStudent = "";
        for (int i = 0; i < index - 1; i++)
            for (int j = 0; j < index - 1; j++) {
                if (list[j].getGroup().compareTo(list[j+1].getGroup()) < 0){
                    Student temp = list[j];
                    list[j] = list [j+1];
                    list[j+1] = temp;
                }
            }
        for (int i = 0; i < index; i++){
            if (i==0||!sameGroup(list[i],list[i-1])){
                listStudent +=  list[i].getGroup() + "\n";
            }
            listStudent += list[i].getInfo() + "\n";
        }
        return listStudent;
    }

    public void removeStudent(String id) {
        for (int i = 0; i < index; i++){
            if (list[i].getId().equals(id)){
                for (int j = i; j < index - 1; j++) {
                    list[j] = list[j + 1];
                }
                index--;
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student ("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        s1.setGroup("K62CC");
        Student s2 = new Student ("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        s2.setGroup("K62CC");
        Student s3 = new Student ("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
       s3.setGroup("K62CB");
        Student s4 = new Student ("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        s3.setGroup("K62CB");
        StudentManagement sm = new StudentManagement();
        sm.addStudent(s1);
       sm.addStudent(s2);
        sm.addStudent(s3);
       sm.addStudent(s4);
       System.out.println(sm.studentsByGroup());
        sm.removeStudent("17020004");
        System.out.println(sm.studentsByGroup());
    }
}