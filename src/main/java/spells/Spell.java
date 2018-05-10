package spells;

public class Spell {

    private String name;
    private int dmgValue;

    public Spell(String name, int dmgValue) {
        this.name = name;
        this.dmgValue = dmgValue;
    }

    public String getName() {
        return name;
    }

    public int getDmgValue() {
        return dmgValue;
    }
}
