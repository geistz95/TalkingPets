package org.Pet;

public class Pet {
    private String name;
    private int age;
    private String speak;
    public Pet(String name, int age, String speak){
        this.name=name;
        this.age=age;
        this.speak=speak;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("Invalid age");
        }else {
            this.age = age;
        }
    }
    public void setSpeak(String speak){
        this.speak=speak;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSpeak(){
        return this.speak;
    }
    public String petInfo(){
        return "Your pet name is : "+name+"\n its age is : "+age+"\n It says :" + speak;
    }

}
