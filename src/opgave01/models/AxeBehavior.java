package opgave01.models;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("swings their axe");
    }
}
