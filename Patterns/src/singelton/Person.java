package singelton;

public class Person {
    //normal
    // private static Person instance=new Person("test",1);

    private static Person instance =null;

    private String name;
    private int age;

    private Person(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }

    //normal
    public static Person getInstance() {
        return instance;
    }

    public static void setInstance(Person instance) {
        Person.instance = instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //lazy initialization
    public static Person getLazyInstance(){
        if(instance ==null){
            instance =new Person("test",1);
        }
        return instance;
    }

}
