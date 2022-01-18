package classes;
public class Transformer {

    private Gun gun_left = new Gun();
    private Gun gun_right = new Gun();
    public Transformer() {}

    public Transformer(Gun gun_left, Gun gun_right) {
        this.gun_left = gun_left;
        this.gun_right = gun_right;
    }

    public void fire() {
        this.gun_left.fire();
        this.gun_right.fire();
    }

    @Override
    public String toString() {
        return "gun_left: " + gun_left.getAmmoCount() + ", gun_right: " + gun_right.getAmmoCount();
    }


}