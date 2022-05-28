public class BmiService {

    public int calculate(int weight, int growth) {
        int imt = weight/((growth*growth)/10000);
        return imt;
    }
}
