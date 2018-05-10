package healingTools;

public abstract class HealingTool {

    private String name;
    private int healingPower;

    public HealingTool(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    public String getName() {
        return name;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
