package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int count;

    public HeavyCavalry() {
        super(150, 20, true);
        this.count = 0;
    }

    @Override
    public int doDamage() {
        count += 1;
        if (count == 1) {
            return 3 * super.doDamage();
        }
        return super.doDamage();
    }
}
