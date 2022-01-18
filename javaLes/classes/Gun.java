package classes;
public class Gun {
    private int  ammoCount;

    public Gun() {
        this.reload();
    }
    public void fire() {
        this.ammoCount-=1;
    }
    public void reload() {
        this.ammoCount = 10;
    }
    public int getAmmoCount() {
        return ammoCount;
    }
    public void setAmmoCount(int ammoCount) {
        this.ammoCount = ammoCount;
    }

}
