import javafx.stage.Stage;

public class Controller {


    private Card card = new Card();
    private Money money = new Money();
    private Paper paper = new Paper();
    private Bill bill = new Bill();

    public void language_choice(String lang){  }

    public void card_insert(Card card){  }

    public boolean pincode_insert(int pin){ return true;}

    public Bill view_bill(){ return this.bill;}

    public boolean cash_withdrawal(double amount){ return  true;}

    public boolean money_transfer(int receiverCardNumber, double amount){ return true;}

    public boolean services(String providerName, String accountNumber, String somethingName, double amount){ return true;}

    public void return_card(){ }

    public void fill_money(double amount){ }

    public void fill_paper(int amount){ }



    public Card getCard() {return this.card;}

    public void setCard(Card card) { }

    public Money getMoney() {return this.money;}

    public void setMoney(Money money) { }

    public Paper getPaper() {return this.paper;}

    public void setPaper(Paper paper) { }

}
