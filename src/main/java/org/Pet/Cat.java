package org.Pet;

public class Cat extends Pet{
    private String catBreed;
    private String speak;
    private int age;
    private String name;

    public Cat(String name, int age, String speak, String catBreed){
        super(name,age,speak);
        this.catBreed=catBreed;
    }
    @Override
    public String petInfo(){
        return "Your pet name is : "+super.getName()+"\nIt's a cat! The breed is : "+catBreed+"\nIts age is "+super.getAge()+"\nIt says : " + getSpeak();
    }
    public void setCatBreed(String catBreed){
        this.catBreed=catBreed;
    }
    @Override
    public String getSpeak(){
        return speak;
    }
    public String getCatBreed(){return catBreed;}
}
