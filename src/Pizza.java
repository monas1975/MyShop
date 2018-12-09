import java.util.ArrayList;
import java.util.List;
import enums.*;
import Products.*;

public class Pizza implements  ShopItem {

    private String name;
    private int price;
    private PizzaSos sos;
    private List<PizzaAddtive> additives;

    public Pizza(PizzaBuilder builder){
        this.name = builder.name;
        this.price = builder.price;
        this.sos = builder.sos;
        this.additives = builder.additives;


    }

   /* public Pizza(String name, int price) {
        this.name = name;
        this.price = price;
        this.additives = new ArrayList<>();
    }
*/
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PizzaSos getSos() {
        return sos;
    }

    public void setSos(PizzaSos sos) {
        this.sos = sos;
    }


    public List<PizzaAddtive> getAdditives() {
        return additives;
    }

    public void setAdditives(PizzaAddtive additive) {
        this.additives.add(additive);
        this.price = this.price+1;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean ifForadult() {
        return false;
    }

    public static class PizzaBuilder {
        private String name;
        private int price;
        private PizzaSos sos;
        private List<PizzaAddtive> additives;

        public PizzaBuilder(){
            this.additives = new ArrayList<>();

        }

       public PizzaBuilder setName(String name) {
            this.name = name;
            return this;
       }

       public PizzaBuilder setPrice(int price)
       {
           this.price = price;
           return this;
       }

       public PizzaBuilder setSos(PizzaSos sos){
            this.sos = sos;
            return this;
       }

       public PizzaBuilder setAdditives(PizzaAddtive additive){
            this.additives.add(additive);
            this.price++;
            return this;
       }

       public Pizza build() {
            return new Pizza(this);
       }

    }

}
