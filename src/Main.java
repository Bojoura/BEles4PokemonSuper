import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        PokemonSuper pokemon = new PokemonSuper("name", "level" );
        WaterPokemon squirtle = new WaterPokemon("Squirtle", "8", "waterpokemon", "lives under water.", true, true);
        FirePokemon charmander = new FirePokemon("Charmander", "6", "firepokemon","lives in the wilderness", 80, true);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur","5", "grasspokemon", "lives in the wilderness",100, true);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu","7", "electricpokemon", "lives in the wilderness",true,true);

        System.out.println();
        System.out.println("The first pokemon is " + squirtle.getName()+ ".");
        squirtle.livesInWater();
        squirtle.surf();
        squirtle.BubbleBeam();
        squirtle.scratch();

        System.out.println();
        System.out.println("The second pokemon is " + charmander.getName()+ ".");
        charmander.temperature();
        charmander.inferno();
        charmander.scratch();

        System.out.println();
        System.out.println("The third pokemon is " + bulbasaur.getName()+ ".");
        bulbasaur.sunlight();
        bulbasaur.solarbeam();
        bulbasaur.scratch();

        System.out.println();
        System.out.println("We saved the best pokemon for last. Here is " + pikachu.getName()+ ".");
        pikachu.thundershock();
        pikachu.thunderbolt();
        pikachu.tailwhip();
    }

}
