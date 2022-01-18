package classes;
public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone() {}

    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name, String number) {
        if(number == getNumber()) {
            System.out.println("Calling " + name + " number: " + number);
        }
        else {
            System.out.println("Unknown person calling - " + number);
        }
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name + ", number: " + getNumber());
    }


    // GETTER and SETTER number model weight
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "model: " + this.model
        +"\n number: " + this.number
        +"\n weight: " + this.weight;
    }

}
