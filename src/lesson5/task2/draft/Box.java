package lesson5.task2.draft;

class Box {
    private int weight; //вес коробки
    private int value;//ценность коробки

    Box(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
}
