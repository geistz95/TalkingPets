package org.Pet;

public class Dog extends Pet{
    private String speak;
    private int age;
    private String name;
    private String dogBreed;
    public Dog(String name, int age, String speak, String dogBreed  ){
        super(name,age,speak);
        this.dogBreed=dogBreed;
    }
    public void setDogBreed(String dogBreed){
        this.dogBreed=dogBreed;
    }
    public String getDogBreed(){
        return this.dogBreed;
    }

    @Override
    public String getSpeak() {
        return speak;
    }

    @Override
    public String petInfo(){
        return "Your pet name is : "+super.getName()+"\nIt's a doggo! The breed is : "+dogBreed+"\nIts age is "+super.getAge()+"\nIt says : " + super.getSpeak();
    }

}
