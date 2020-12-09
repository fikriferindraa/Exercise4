abstract class Bank{
    abstract  void bank();
    void getBalance() {
        System.out.println("free deposited");
    }
}

class BankA extends Bank {
    void bank(){
        System.out.println("$100 deposited");
    }
}

class BankB extends Bank{
    void bank(){
        System.out.println("$150 deposited");
    }
}

class BankC extends Bank{
    void bank(){
        System.out.println("$200 deposited");
    }
}
public class MainBank{
    public static void main(String[] args){

        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        a.bank();
        b.bank();
        c.getBalance();

    }
}
