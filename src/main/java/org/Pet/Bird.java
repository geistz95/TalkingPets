package org.Pet;

public class Bird extends Pet {
    private String birdBreed;

    public Bird(String name, int age, String speak, String birdBreed ){
        super(name,age,speak);
        this.birdBreed=birdBreed;
    }
    @Override
    public String petInfo(){
        return "Your pet name is : "+super.getName()+"\nIt's a birb! The breed is : "+birdBreed+"\nIts age is "+super.getAge()+"\nIt says : " + super.getSpeak();
    }
    public void setBirdBreed(String birdBreed){
        this.birdBreed=birdBreed;
    }
    public String getBirdBreed(){return birdBreed;}

}
