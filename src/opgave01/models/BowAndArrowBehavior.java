package opgave01.models;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("shoots with their bow and arrow");
    }
}
