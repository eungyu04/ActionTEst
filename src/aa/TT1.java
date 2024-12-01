package aa;

public class TT1 {
    private TT2 tt2;

    public TT1(TT2 tt2) {
        this.tt2 = tt2;
    }

    public int getnum() {
        return tt2.getA();
    }
}
