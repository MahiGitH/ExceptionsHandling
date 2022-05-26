package ValidatingParameters;

public class Person {
    private String name;
    private int age;

    public Person (String name, int age)
    {
        if(name == null || name.isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("Name can't be null, or can't have over 40 characters in length");
        }
        this.name = name;
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Age should be between 0 and 120");
        }
        this.age =age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return getName() + ", " + getAge();
    }
}