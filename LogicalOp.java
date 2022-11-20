import java.util.Arrays;
public class LogicalOp {
    //2
    public int[] getArray(int positions){
        int[] myArray = new int[positions];
        for (int i = 0; i  < myArray.length; i++){
            myArray[i] = i + 1;
        }
        return myArray;
    }
    public void printArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]+ " ");
        }
    }
    //3
    public int[] printEvenNumber(int[] myArray) {
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                myArray[j] = i;
                System.out.print(myArray[j] + " ");
                j++;
            }
        }
        return myArray;
    }

    //4
    public void averageArrayValue(int[] myArray) {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        average = (double) sum / myArray.length;
        System.out.println(average);
    }

    //5
    public boolean checkText(String[] checkText, String input) {
        for (int i = 0; i < checkText.length; i++) {
            if (checkText[i].equals(input)) {
                System.out.println("FastTrackIT");
                return true;
            }
        }
        return false;
    }

    //6
    public int getPosition(int[]array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i]== value){
                System.out.println("\nPozitia pe care se afla numarul \"" + value + "\" este: " + i);
                return i;
            }
        }
        System.out.println("Valoarea nu exista in array");
        return -1;
    }

    //7
    public void getGrid() {
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
    }

    //8
    public int[] returnArray(int[] myArray, int nr) {
        int[] secondArray = new int[myArray.length];
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == nr)
                continue;
            secondArray[j++] = myArray[i];
        }
        int[] thirdArray = new int[j];
        for (int i = 0; i < j; i++)
            thirdArray[i] = secondArray[i];
        System.out.println(Arrays.toString(thirdArray));
        return thirdArray;
    }

    //9
    public int returnLowerArrayNr(int[] micArray) {
        int temporary = 0;
        for (int i = 0; i < micArray.length; i++) {
            for (int j = i + 1; j < micArray.length; j++) {
                if (micArray[i] > micArray[j]) {
                    temporary = micArray[j];
                    micArray[j] = micArray[i];
                    micArray[i] = temporary;
                }
            }
        }
        System.out.println(micArray[1]);
        return micArray[1];
    }

    //10
    public int[] copyFirstArray() {
        int[] firstArray = {13, 40, 79};
        int[] emptyArray = new int[firstArray.length];
        for (int i = 0, j = 0; i < firstArray.length; i++) {
            emptyArray[j] = firstArray[i];
            j++;
            System.out.print(emptyArray[i]+" ");
        }
        return emptyArray;
    }
}