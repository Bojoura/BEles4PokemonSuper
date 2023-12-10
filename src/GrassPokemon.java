public class GrassPokemon extends PokemonSuper {
    private int sunlight;

    private boolean solarbeam;

    public GrassPokemon(String name, String level, String type, String habitat, int sunlight, boolean solarbeam) {
        super(name, level, type, habitat);
        super.setType("Grass");
        this.setSunlight(sunlight);
        this.setSolarbeam(solarbeam);
    }

    public int getSunlight() {
        return sunlight;
    }

    public void setSunlight(int sunlight) {
        this.sunlight = sunlight;
    }

    public boolean getSolarbeam() {
        return solarbeam;
    }

    public void setSolarbeam(boolean solarbeam) {
        this.solarbeam = solarbeam;
    }

    public void sunlight () {
        if (sunlight >= 100) {
            System.out.println(getName() + "is ready to cast Solar Beam.");
        } else {
            System.out.println(getName() + "can't attack, did not gain enough sunlight.");
        }
    }

    public void solarbeam() {
        if (this.getSolarbeam()) {
            System.out.println("This pokemon can use Solar Beam.");
        } else {
            System.out.println("This pokemon can't use Solar Beam.");
        }
    }

    @Override
    public void scratch() {
        if (sunlight <= 25 ){
            System.out.println(getName() + " can't use the attack scratch.");
        } else {
            super.scratch();
        }

    }

}
