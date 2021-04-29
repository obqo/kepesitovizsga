package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int attack;

    public HeavyCavalry() {
        super(150, 20, true);
        this.attack = 0;
    }

    @Override
    public int doDamage() {
        attack += 1;
        if (attack == 1) {
            return 3 * super.doDamage();
        }
        return super.doDamage();
    }
}
