package Week2;

public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    //Constructor 1
    Student(String nguyen_van_an, String s, String k62CC, String s1) {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    //Constructor 2
     Student(String name, String id, String email) {
         this.name = name;
         this.id = id;
         this.email = email;
         group = "K62CB";
    }

    //Constructor 3
    Student(Student s) {
        id = s.getId();
        name = s.getName();
        email = s.getEmail();
        group = s.getGroup();
   }

    String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}