import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Farm farm1 = new Farm("Karakol",2,5,6,"Edil");
        Farm farm2 = new Farm("Dolon",3,5,2,"Bany");

        System.out.println(farm1);
        System.out.println(farm2);

        Cow cow = new Cow(56,4,"man","Orbit","black");
        Cow cow1 = new Cow(23,5,"women","Bunny","black");
        Sheep sheep = new Sheep(23,6,"woman","Dirol","white");
        Sheep sheep1 = new Sheep(10,2,"women","Gimy","blue");
        Horse horse = new Horse(178,3,"man","Gufer","brown");
        Horse horse1 = new Horse(345,6,"man","Jack","black");


Animal [] animals = new Animal[]{cow1,cow,sheep1,sheep,horse,horse1};


        System.out.println(isThin(cow1));
        System.out.println(Arrays.toString(getWhiteAnimals(animals)));
        System.out.println(Arrays.toString(getCows(animals)));
        System.out.println(Arrays.toString(getAnimalByGender("women", animals)));


    }

    public  static boolean isThin(Animal animal){
        boolean Animal = false;
        if(animal.getWeight()<5){
            return !Animal;
        }
        return Animal;
    }
    public static Animal [] getWhiteAnimals(Animal [] animal){
        Animal [] animals = new Animal[animal.length];
        int counter = 0;
        for (int i = 0; i < animal.length; i++)

         {
            if(animal[i].getColor().equalsIgnoreCase("black")){
                animals[counter]=animal[i];
                counter++;
            }

        }
        return animal;


    }
    public  static  Cow [] getCows(Animal[] animal){
        Cow [] cows = new Cow[animal.length];
        Animal [] animals = new Animal[animal.length];
        int counter = 0;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Cow){
                cows [counter]=(Cow)animal[i];
                counter++;

            }
        }
cows = Arrays.copyOf(cows,counter);
        return cows;
    }
    public static Animal [] getAnimalByGender (String gender, Animal [] animal){
        Animal [] animals = new Animal[animal.length];
        int counter=0;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].getGender().equalsIgnoreCase(gender)) {
                animals[counter]=animal[i];
                counter++;

            }
        }
        return animals;
    }







}