public class FirePokemon extends PokemonSuper {
    private int temperature;

    private boolean inferno;

    public FirePokemon(String name, String level, String type, String habitat, int temperature, boolean inferno) {
        super(name, level, type, habitat);
        super.setType("Fire");
        this.setTemperature(temperature);
        this.setInferno(inferno);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean getInferno() {
        return inferno;
    }

    public void setInferno(boolean inferno) {
        this.inferno = inferno;
    }

    public void temperature () {
        if (temperature >= 70) {
            System.out.println("The temperature is high enough to attack.");
        } else {
            System.out.println("This temperature is not high enough to attack.");
        }
    }

    public void inferno() {
        if (this.getInferno()) {
            System.out.println("This pokemon can use Inferno.");
        } else {
            System.out.println("This pokemon cannot use Inferno.");
        }
    }

    @Override
    public void scratch() {
        if (temperature <= 70 ){
            System.out.println(getName() + " can't use the attack scratch.");
        } else {
            super.scratch();
        }

    }

}