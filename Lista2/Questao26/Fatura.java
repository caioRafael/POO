public class Fatura {
    private int idNumber;
    private String description;
    private int amount;
    private float unitPrice;

    Fatura(int idNumber, String description, int amount, float unitPrice){
        this.idNumber = idNumber;
        this.description = description;
        if(amount <= 0){
            this.amount = 0;
        }else{
            this.amount = amount;
        }
        if(unitPrice <= 0){
            this.unitPrice = 0;
        }else{
            this.unitPrice = unitPrice;
        }
    }

    public float calculaTotal(){
        return this.unitPrice*this.amount;
    }
}
