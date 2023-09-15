package org.Pet;

public class OtherPet extends Pet{
    String petType;
    public OtherPet(String name, int age, String speak, String petType){
        super(name,age,speak);
        this.petType=petType;
    }
    @Override
    public String petInfo(){
        return "Your pet name is : "+super.getName()+" and it's a "+petType+"!\nIts age is : "+super.getAge()+"\nIt says : " + super.getSpeak();
    }
    public void setOtherBreed(String otherBreed){
        this.petType=otherBreed;
    }
    public String getOtherBreed(){return this.petType;}
}
