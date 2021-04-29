package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> removed = new ArrayList<>();
        for (MilitaryUnit item : army) {
            item.sufferDamage(damage);
            if (item.getHitPoints() >= 25) {
                removed.add(item);
            }
        }
        army = new ArrayList<>(removed);
    }

    public int getArmyDamage() {
        int sum = 0;
        for (MilitaryUnit item : army) {
            sum += item.doDamage();
        }
        return sum;
    }

    public int getArmySize() {
        return army.size();
    }
}
