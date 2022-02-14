package DZ_3;

import java.util.ArrayList;

public class Box <E> {

    private double weightFruit = 0.0;
    ArrayList<E> fruits = new ArrayList();

    public <E> Box(double weightFruit) {
        this.weightFruit = weightFruit;
    }

    public void addFruit(E fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight() {
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;

    }

    public void addFruit(Box<E> box){
        System.out.println("До взвешивания коробка 1 " + fruits.size());
        System.out.println("До взвешивания коробка 2 " + box.fruits.size());
        fruits.addAll(box.fruits);
        box.fruits.clear();
        box.fruits.trimToSize();
        System.out.println("После взвешивания коробка 1" + fruits.size());
        System.out.println("После взвешивания коробка 2" + box.fruits.size());
    }

}
