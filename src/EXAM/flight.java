package EXAM;

/**
 *
 * @author caube
 */
public class flight {
   private int number;
   private String destination;

    public flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void display() {
        System.out.println(number + "," + destination);
    }

    public static void main(String[] args) {
        flight g1 = new flight(857, "Toronto");
        System.out.println("Output:");
        g1.display();
    }
 
}