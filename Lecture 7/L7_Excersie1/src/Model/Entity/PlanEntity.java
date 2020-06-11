package Model.Entity;

public class PlanEntity {
    private int size;
    private int price;

    public PlanEntity() {}
    public PlanEntity(int size, int price) {
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public PlanEntity setSize(int size) {
        this.size = size;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public PlanEntity setPrice(int price) {
        this.price = price;
        return this;
    }
}
