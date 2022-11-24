public class Ticket {
    private Block[] blocks;
    public Ticket(int numBlocks) {
        blocks = new Block[numBlocks];
        for (int i = 0; i < numBlocks; i++) {
            blocks[i] = new Block(6);
        }
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < blocks.length; i++) {
            s = s + blocks[i].toString() + "\n";
        }
        return s;
    }
    public void printUsedNumbers() {
        boolean[] usedNumbers = new boolean[50];
        boolean firstOne = true;
        for (int i = 0; i < 50; i++) {
            usedNumbers[i] = false;
        }
        for (int numBlock = 0; numBlock < blocks.length; numBlock++) {
            int[] numbers = blocks[numBlock].getNumbers();
            for (int i = 0; i < numbers.length; i++) {
                int n = numbers[i];
                usedNumbers[n] = true;
            }
        }
        for (int i = 1; i <= 49; i++) {
            if (usedNumbers[i]) {
                if (firstOne){
                    System.out.print(i);
                    firstOne = false;
                } else {
                    System.out.print(", " + i);
                }
            }
        }
        System.out.println();
    }
}