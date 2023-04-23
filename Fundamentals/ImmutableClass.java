package Fundamentals;

public final class ImmutableClass {
    private final String currency;
    private final Integer amount;

    public ImmutableClass(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer getCalculatedAmount(String incomingCurrency, Integer amount){
        if(incomingCurrency==this.currency){
            return this.amount+amount;
        }else
            return 0;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        ImmutableClass immutableClass =new ImmutableClass("USD",20);
        System.out.println(immutableClass.getCalculatedAmount("USD",30));
        //System.out.println(practice.toString());
    }

}
