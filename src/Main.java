public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myImt = service.calculate(52, 164);
        System.out.println(myImt);
    }
}
