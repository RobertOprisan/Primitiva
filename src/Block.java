public class Block {
    private int[] numbers;
    public Block(int numNumbers) {
        if (numNumbers < 6) {
            numNumbers = 6;
        } else {
            if (numNumbers > 49) {
                numNumbers = 49;
            }
        }
        numbers = new int[numNumbers];
        int counter = 0;
        while (counter < numNumbers) {
            int randomN = (int) (Math.random() * 49) + 1;
            boolean repeated = false;
            for (int i = 0; i < counter; i++) {
                if (numbers[i] == randomN) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                numbers[counter] = randomN;
                counter ++;
            }
        }
    }
    public Block(int[] setOfNumbers) {
        numbers = setOfNumbers;
    }
    @Override
    public String toString() {
        String s;
        int numElements = numbers.length;
        if (numElements < 1) {
            return "";
        }
        s = numbers[0] + "";
        for (int i = 1; i < numElements; i++) {
            s = s + ", "+ numbers[i];
        }
        return s;
    }
    public int[] getNumbers() {
        return numbers;
    }
}