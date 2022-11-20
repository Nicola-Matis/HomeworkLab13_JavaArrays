import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        LogicalOp logicalOp = new LogicalOp();
        System.out.println("================2================");
        int[]myArray= logicalOp.getArray(100);
        logicalOp.printArray(myArray);
        System.out.println("================3================");
        logicalOp.printEvenNumber(myArray);
        System.out.println("\n================4================");
        logicalOp.averageArrayValue(myArray);
        System.out.println("================5================");
        String[] arrString = {"Cappucino", "Frapuccino", "MilkShake", "Americano", "Italiano"};
        logicalOp.checkText(arrString, "Cappucino");
        System.out.println("================6================");
        int [] indexArray = new int [] {17, 150, 542, 30};
        logicalOp.getPosition(indexArray, 30);
        System.out.println("\n================7================");
        logicalOp.getGrid();
        System.out.println("================8================");
        logicalOp.returnArray(indexArray, 150);
        System.out.println("================9================");
        int [] micArray = new int [] {30, 58, 85, 754};
        logicalOp.returnLowerArrayNr(micArray);
        System.out.println("================10================");
        logicalOp.copyFirstArray();
    }
}