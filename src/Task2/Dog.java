package Task2;

import java.util.Scanner;

//Создайте свой класс исключения для проверки выгула животного.
//        Программа должна содержать несколько методов, проверяющий экипировку животного (например: ошейник, поводок и тд.) и
//        результирующий метод «выгул». Если одно из требований хотя бы не выполнено, то выбросить свое исключение или же отработать нормально
public class Dog {
    boolean hasCollar;
    boolean hasLeash;
    boolean ownerHasTreats;
    public Dog(boolean hasCollar, boolean hasLeash, boolean ownerHasTreats){
        this.hasCollar = hasCollar;
        this.hasLeash = hasLeash;
        this.ownerHasTreats = ownerHasTreats;
    }
    boolean collarChecker(){
        return this.hasCollar;
    }
    boolean leashChecker(){
        return this.hasLeash;
    }
    boolean treatsChecker(){
        return this.ownerHasTreats;
    }
    void dogChecker() throws MyException{
        if (collarChecker() && leashChecker() && treatsChecker()){
            System.out.println("It's safe to go for a walk");
        }
        else {
            System.out.println("Something is missing");
            throw new MyException("Pick missing part!");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Did you pick a collar? type true or false: ");
        boolean collar = sc.nextBoolean();
        System.out.println("Did you pick a leash? type true or false: ");
        boolean leash = sc.nextBoolean();
        System.out.println("Did you pick some treats? type true or false: ");
        boolean treats = sc.nextBoolean();
        Dog myDog = new Dog(collar, leash, treats);
        try {
            myDog.dogChecker();
        } catch (MyException a) {
            System.out.println(a.getMessage());
        }
    }
}
