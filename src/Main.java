public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(8);
        System.out.println(ticket.toString());
        System.out.print("Used numbers:");
        ticket.printUsedNumbers();
        Block block = new Block(new int[] {5,10,15,20,25,30,35,40,45});
        System.out.println(block.toString());
    }
}
