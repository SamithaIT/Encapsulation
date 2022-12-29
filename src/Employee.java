public class Employee {
    private int id;
    private String name;
    private int age;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
class RunEmp{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setId(1132);
        e.setName("Samitha");
        e.setAge(24);

        System.out.println("Id: "+e.getId()+"\nName: "+e.getName()+"\nAge: "+e.getAge());

    }
}
