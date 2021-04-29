package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private final int damage;
    private final boolean armor;

    public MilitaryUnit(int hitPoints, int damage, boolean armor) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.armor = armor;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        if (armor) {
            hitPoints -= damage / 2;
        } else {
            hitPoints -= damage;
        }
    }
}
