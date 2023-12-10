public class PokemonSuper {
        private String name;

        private String level;
        private String type;

        private String habitat;


    public PokemonSuper(String name, String level, String type, String habitat){
        this.setName(name);
        this.setLevel(level);
        this.setType(type);
        this.setHabitat(habitat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //if (name != null){
        this.name = name;
    }

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void scratch(){

        System.out.println(getName() + " uses the attack scratch.");
    }

    public void tailwhip(){
        System.out.println(getName() + " learns new attack Tail Whip.");
    }
}

