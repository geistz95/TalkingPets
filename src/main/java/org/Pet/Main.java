package org.Pet;
import java.util.ArrayList;
import java.util.Scanner;
/* Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
then press Enter. You can now see whitespace characters in your code.
I tried using e.nextInt(); But it skipped over some prompts for some reason, I haven't figured it out yet.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello there!\nDo you have any pets?\nEnter 1 for Yes and anything else for No");
        Scanner e = new Scanner(System.in);
        int answer=Integer.parseInt(e.nextLine());
        if(answer==1) {
            ArrayList<Pet> petList= new ArrayList<>();
            boolean hasMorePet=true;
            String petName;
            String sound;
            int age;
            String breed;
            while (hasMorePet) {
                System.out.println("Ok, what is your  pet's name?");
                petName = e.nextLine();
                System.out.print("How old is your pet?\n");
                age = Integer.parseInt(e.nextLine());
                System.out.println("Press 1 for dog, Press 2 for Cat, Press 3 for Bird, Press 4 for Other");
                int petType = Integer.parseInt(e.nextLine());
                if (petType == 1) {
                    System.out.println("Its a dog!\nWhat breed is it?");
                    breed = e.nextLine();
                    System.out.println("What sound does it make?");
                    sound = e.nextLine();
                    petList.add(new Dog(petName, age, sound, breed));
                    System.out.println("Ok added to the list!");
                } else if (petType == 2) {
                    System.out.println("Its a Cat!\nWhat breed is it?");
                    breed = e.nextLine();
                    System.out.println("What sound does it make?");
                    sound = e.nextLine();
                    petList.add(new Cat(petName, age, sound, breed));
                    System.out.println("Ok added to the list!");
                } else if (petType == 3) {
                    System.out.println("Its a bird!\nWhat breed is it?");
                    breed = e.nextLine();
                    System.out.println("What sound does it make?");
                    sound = e.nextLine();
                    petList.add(new Bird(petName, age, sound, breed));
                    System.out.println("Ok added to the list!");
                } else if (petType == 4) {
                    System.out.println("What kind of pet is it?");
                    breed = e.nextLine();
                    System.out.println("What sound does it make?");
                    sound = e.nextLine();
                    petList.add(new Dog(petName, age, sound, breed));
                    System.out.println("Ok added to the list!");
                } else {
                    System.out.println("Invalid selection!");
                }
                System.out.println("Do you have anymore pets?\nEnter 1 for Yes and anything else for No");
                if(Integer.parseInt(e.nextLine())!=1){
                    hasMorePet=false;
                }
            }
            System.out.println("Do you want to edit anything? 1 For Yes, Anything for No");
            answer=Integer.parseInt(e.nextLine());
            boolean edit = (answer==1);
            int selection;
            while(edit) {
                System.out.println("Here's the pet list");
                int counter = 0;
                for (Pet i : petList) {
                    System.out.println("Option " + (counter + 1) + " " + i.getName());
                    counter++;
                }
                selection=Integer.parseInt(e.nextLine());
                System.out.println("Select what you wanna change\n1.Name\n2.Age\n3.Breed\n4.Sound");
                answer = Integer.parseInt(e.nextLine());
                if (answer == 1) {
                    System.out.println("What do you want to change it to?");
                    petList.get(selection-1).setName(e.nextLine());
                    System.out.println("Currently : "+ petList.get(selection-1).getName());
                } else if (answer == 2) {
                    System.out.println("What do you want to change it to?");
                    System.out.println("Currently : "+ petList.get(selection-1).getAge());
                    petList.get(selection-1).setAge(Integer.parseInt(e.nextLine()));
                } else if (answer == 3) {
                    System.out.println("What do you want to change it to?");
                    if(petList.get(selection-1) instanceof Dog){
                        System.out.println("Currently : "+ ((Dog) petList.get(selection-1)).getDogBreed());
                        ((Dog) petList.get(selection-1)).setDogBreed(e.nextLine());
                    }else if(petList.get(selection-1) instanceof Cat){
                        System.out.println("Currently : "+ ((Cat) petList.get(selection-1)).getCatBreed());
                        ((Cat) petList.get(selection-1)).setCatBreed(e.nextLine());
                    }else if(petList.get(selection-1) instanceof Bird){
                        System.out.println("Currently : " + ((Bird) petList.get(selection - 1)).getBirdBreed());
                        ((Bird) petList.get(selection-1)).setBirdBreed(e.nextLine());
                    }else if(petList.get(selection-1)instanceof OtherPet){
                        System.out.println("Currently : "+ ((OtherPet) petList.get(selection-1)).getOtherBreed());
                        ((OtherPet) petList.get(selection-1)).setOtherBreed(e.nextLine());
                    }else{
                        System.out.println("Invalid");
                    }
                } else if (answer == 4) {
                    System.out.println("What do you want to change it to?");
                    petList.get(selection-1).setSpeak(e.nextLine());
                } else {
                    System.out.println("Invalid option");
                }
                System.out.println("Do you want to still edit stuff? Press 1 to continue editing");
                if(Integer.parseInt(e.nextLine())!=1){
                    edit=false;
                }
            }
            System.out.println("You have " + petList.size() + " and this is the list of your pets ");
            for (Pet i : petList) {
                System.out.println(i.petInfo());
            }
        }else{
            System.out.println("Oh O.K. you should get some pets!");
        }
    }
}