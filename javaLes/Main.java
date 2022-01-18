import classes.Avtobot;
import classes.Decepticon;
//import classes.Gun;
//import classes.Transformer;

public class Main {
    public static void main(String[] args) {
        


        //Gun gun1 = new Gun(); 
        //Gun gun2 = new Gun();

        //gun1.reload();
        //gun2.reload();

        //Transformer optimus = new Transformer(gun1,gun2);

        Avtobot optimus = new Avtobot();
        optimus.transform();
        Decepticon megatron = new Decepticon();
        megatron.transform();
        //optimus.fire();

        //optimus.toString();

        //System.out.println(optimus.toString());
        //System.out.println(optimus.transform());
    }
}
