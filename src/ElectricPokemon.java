public class ElectricPokemon extends PokemonSuper {
    private boolean thundershock;

    private boolean thunderbolt;

    public ElectricPokemon(String name, String level, String type, String habitat, boolean thundershock, boolean thunderbolt) {
        super(name, level, type, habitat);
        super.setType("Electric");
        this.setThundershock(thundershock);
        this.setThunderbolt(thunderbolt);
    }

    public boolean getThundershock() {
        return thundershock;
    }

    public void setThundershock(boolean thundershock) {
        this.thundershock = thundershock;
    }

    public boolean getThunderbolt() {
        return thunderbolt;
    }

    public void setThunderbolt(boolean thunderbolt) {
        this.thunderbolt = thunderbolt;
    }

    public void thundershock () {
        if (this.getThundershock()) {
            System.out.println(getName() + "This pokemon can use Thunder Shock.");
        } else {
            System.out.println(getName() + "This pokemon can't use Thunder Shock");
        }
    }

    public void thunderbolt() {
        if (this.getThunderbolt()) {
            System.out.println("This pokemon can use Thunder Bolt.");
        } else {
            System.out.println("This pokemon can't use Thunder Bolt.");
        }
    }

    @Override
    public void tailwhip() {
        if (Integer.parseInt(this.getLevel()) >= 6) {
            System.out.println(getName() + " reached level " + getLevel() + " and learned Tail Whip.") ;
        } else {
            System.out.println("This pokemon hasn't learned that attack yet.");
        }

    }

}