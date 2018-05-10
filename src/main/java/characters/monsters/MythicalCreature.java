package characters.monsters;

import behaviours.IDefend;
import characters.Character;

public abstract class MythicalCreature extends Character implements IDefend{

    public MythicalCreature(String name, int healthPoints) {
        super(name, healthPoints);
    }


}
