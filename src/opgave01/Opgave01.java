package opgave01;

import opgave01.models.*;
import opgave01.models.Character;

public class Opgave01 {
    public static void main(String[] args) {
        Character character = new Knight();
        character.setWeapon(new AxeBehavior());
        character.fight();

        King king = new King();
        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}
