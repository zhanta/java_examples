package classes.professions;

public class Driver {
    private int experience;

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "Experience: " + this.experience;
    }
}
