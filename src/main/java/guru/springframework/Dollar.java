package guru.springframework;

public class Dollar extends Money {


    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int mulitplier) {
        return new Dollar(amount * mulitplier);
    }


}
