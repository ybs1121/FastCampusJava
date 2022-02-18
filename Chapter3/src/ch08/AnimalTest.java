package ch08;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");

    }

    public void speak(){

    }
}


class Human extends Animal{
    @Override
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }

}

class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이가 네 발로 걷습니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥합니다.");
    }
}

class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 날아 다닙니다.");
    }

    public void flying(){
        System.out.println("독수리가 양 날개를 폅니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();



        AnimalTest animalTest = new AnimalTest();
        //animalTest.moveAnimal(hAnimal);
        //animalTest.moveAnimal(eAnimal);
        //animalTest.moveAnimal(tAnimal);


        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(hAnimal);
        animalArrayList.add(eAnimal);
        animalArrayList.add(tAnimal);


        animalTest.testsDownCasting(animalArrayList);



    }

    public void testsDownCasting(ArrayList<Animal> animalArrayList){
        for(Animal animal: animalArrayList){
            if(animal instanceof Human){
                Human human =(Human)animal;
                human.readBook();
            }
        }

    }

    public void moveAnimal(Animal animal){
        animal.move();
    }

}
