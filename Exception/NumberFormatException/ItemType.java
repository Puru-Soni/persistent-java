package NumberFormatException;

public class ItemType {
    String name;
    Double deposit, costPerDay;

    public ItemType(String name, Double deposit, Double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() {
        return "The details of the item type are:\nName:" + this.getName()
                + "\nDeposit:" + this.getDeposit()
                + "\nCost Per Day:" + this.getCostPerDay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

}
