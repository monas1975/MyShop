public class AdultObserver extends AlkoObserver {



    public AdultObserver(ShoppingBasket subject) {

        this.subject = subject;

        this.subject.subscribeAdultObserver(this);

    }



    @Override

    void upDate(User user) {

        if(user.getAge() > 18){

            System.out.println("Adult observer: Osoba pelnoletnia kupila piwo");

        }else {

            System.out.println("Adult observer: UWAGA nieletni!!!!");

        }



    }

}
