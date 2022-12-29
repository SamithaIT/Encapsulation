public class SoftwareEngineer {
    private String name;
    private int contact_no;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getContact_no() {
        return contact_no;
    }
    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }
}

class RunSE{
    public static void main(String[] args) {
        SoftwareEngineer s=new SoftwareEngineer();
        s.setName("Samitha");
        s.setContact_no(776991601);
        s.setAge(24);

        System.out.println("Name: "+s.getName()+"\nContact No: "+s.getContact_no()+"\nAge: "+s.getAge());
    }
}
