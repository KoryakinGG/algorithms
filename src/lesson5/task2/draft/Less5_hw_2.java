package lesson5.task2.draft;

import java.util.Arrays;


public class Less5_hw_2 {
    public static void main(String[] args) {
        Box[] boxes = {
                new Box(1, 1),
                new Box(1, 2),
                new Box(2, 2),
                new Box(4, 10),
                new Box(12, 4),
        };

        Packer packer = new Packer(boxes, new Knapsack(15));
        System.out.println(Arrays.toString(packer.fillKnapsack()));
    }


}
