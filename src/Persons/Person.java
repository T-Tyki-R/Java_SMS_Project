package Persons;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(){};

    public Person(String name, int age, String email){
        setName(name);
        setEmail(email);
        setAge(age);
    }

    public void setName(String newName){
        if(newName.length() != 0 && newName != null && newName.matches("[a-zA-Z\\s]+")){
            this.name = newName;
        }else{
            throw new IllegalArgumentException("Name must contain only alphabetical characters and spaces");
        } 
    }

    public void setEmail(String newEmail){
        if(newEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$") && newEmail != null && newEmail.length() != 0){
           this.email = newEmail; 
        }else{
            throw new IllegalArgumentException("Email must follow appropriate format and not be empty or null");
        }
    }

    public void setAge(int newAge){
        if(newAge > 0){
            this.age = newAge;
        }else{
            throw new IllegalArgumentException("Age must be greater than 0");
        }
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

}
