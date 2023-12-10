public class WaterPokemon extends PokemonSuper {
    private boolean livesInWater;
    private boolean surf;

    public WaterPokemon(String name, String level, String type, String habitat, boolean livesInWater, boolean surf) {
        super(name, level, type, habitat);
        super.setType("Water");
        this.setlivesInWater(livesInWater);
        this.setsurf(surf);
    }

    public boolean getlivesInWater() {
        return livesInWater;
    }

    public void setlivesInWater(boolean livesInWater) {
        this.livesInWater = livesInWater;
    }

    public boolean getsurf() {
        return surf;
    }

    public void setsurf(boolean surf) {
        this.surf = surf;
    }

    public void surf() {
        if (this.getsurf()) {
            System.out.println("This pokemon can use Surf.");
        } else {
            System.out.println("This pokemon cannot use Surf.");
        }
    }

    public void BubbleBeam() {
        System.out.println(super.getName() + " uses the attack Bubble Beam.");
    }

    public void livesInWater() {
        if (this.getlivesInWater()) {
            System.out.println("This pokemon lives in water.");
        } else {
            System.out.println("This pokemon does not live in water.");
        }
    }

    @Override
    public void scratch() {
        if (this.getlivesInWater()) {
            System.out.println(getName() + " can't use the attack scratch.");
        } else {
            super.scratch();
        }

    }
}
