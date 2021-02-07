package lesson6;

public class Main {
    public static void main(String[] args) {
        //Создаем одно дерево с высотой 1
//        TreesMaker treesMaker = new TreesMaker();

        //Создаем одинаковые деревья с высотой 6
        int numberOfTrees = 20;//количество деревьев
        int maxTreeHeight = 6;//заданная высота деревьев
        TreesMaker treesMaker = new TreesMaker(numberOfTrees, maxTreeHeight);

        //создаем деревья с разной высотой
//        int[] treesHeights = {5, 1, 3, 6, 10};//количество деревьев
//        TreesMaker treesMaker = new TreesMaker(treesHeights);

    }
}
