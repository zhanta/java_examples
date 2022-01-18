package classes.details;

public class Engine {
    private int power;
    private String company;

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "power: "+ this.power + ", company: " + this.company;
    }

}
