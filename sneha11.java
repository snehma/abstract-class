abstract class Bus{
    int rate;
    Bus(int rate){
        this.rate = rate;
    }

    public void welcome(){
        System.out.println("Welcome from abstract class!!!");
    }

    public abstract void seatType();
    public abstract void acOrNonAc();
}

class PublicBus extends Bus{
    private String seatType;
    PublicBus(int rate, String s){
        super(rate);
        seatType = s;
    }

    public void seatType(){
        System.out.println("Public Bus:"+seatType);
    }

    public void acOrNonAc(){
        System.out.println("Public Bus: AC Bus");
    }
}

class PrivateBus extends Bus{
    private String seatType;
    PrivateBus(int rate, String s){
        super(rate);
        seatType = s;
    }public void seatType(){
        System.out.println("Public Bus:"+seatType);
    }

    public void acOrNonAc(){
        System.out.println("Public Bus: AC Bus");
    }
}public class Question1 {
    public static void main(String[] args) {
        PublicBus pb = new PublicBus(100, "Seater");
        PrivateBus pvt = new PrivateBus(500, "Non-Seater");

        pb.acOrNonAc();
        pb.seatType();
        System.out.println();

        pvt.acOrNonAc();
        pvt.seatType();
        System.out.println();

        pb.welcome();
        pvt.welcome();
    }
}