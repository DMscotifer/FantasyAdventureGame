package weapons;

public abstract class Weapon {

    private int dmgValue;

    public Weapon(int dmgValue) {
        this.dmgValue = dmgValue;
    }

    public int getDmgValue() {
        return dmgValue;
    }
}
