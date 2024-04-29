//Evan Drake And Jacob Massee

import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    static Scanner scanner=new Scanner(System.in);
    Pokedex pokedex=new Pokedex();

    public void displayMenu(){
        while (true){
            System.out.println("1. Add a Pokemon");
            System.out.println("2. Kill a Pokemon");
            System.out.println("3. Display Pokemon info");
            System.out.println("4. Display all Pokemon Info");
            System.out.println("5. Exit");
            String question=scanner.nextLine();
            if (question.equals("1")){
            createPokemon();
            }
            else if (question.equals("2")){
            deletePokemon();
            }
            else if (question.equals("3")){
            displayPokemon();
            }
            else if (question.equals("4")){
            displayAllPokemon();
            }
            else if (question.equals("5")){
            break;
            }
            else{
                System.out.println("Please input a correct number. :(");
            }
        }
    }

private void createPokemon(){
System.out.println("Please insert Pokemon name");
String name=scanner.nextLine();
System.out.println("Please insert Pokemon hp");
int hp= Integer.parseInt(scanner.nextLine());
Pokemon pokemon=new Pokemon(name, hp);
pokedex.addPokemon(pokemon);
while(true) {
    System.out.println("Enter move name or enter q to quit:");
    String moveName=scanner.nextLine();
    if (moveName.equals("q")){
        break;
    }
    System.out.println("Enter move name:");
    int power=Integer.parseInt(scanner.nextLine());
    System.out.println("Enter moves speed");
    int speed=Integer.parseInt(scanner.nextLine());

}
}

private void deletePokemon(){
    System.out.print("Enter the name of the Pokemon to delete: ");
    String name = scanner.nextLine();

    Pokemon pokemon = pokedex.getPokemon(name);

    if (pokemon == null) {
        System.out.println("Pokemon not found.");
    } else {
        pokedex.removePokemon(pokemon);
    }

}
private void displayPokemon() {
    System.out.println("Enter the name of the Pokemon to display info: ");
    String name = scanner.nextLine();

    Pokemon pokemon = pokedex.getPokemon(name);

    if (pokemon == null) {
        System.out.println("Pokemon not found.");
    } else {
        System.out.println(pokemon);
    }
}
private void displayAllPokemon(){
    ArrayList<Pokemon> allPokemon = pokedex.getPokemonArrayList();

    for (Pokemon pokemon : allPokemon) {
        System.out.println(pokemon);
    }
}
    }

