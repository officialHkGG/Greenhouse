class Kaktus implements Växt {
    private static final double MINERALVATTEN_MÄNGD = 0.02; // 2 cl mineralvatten
//polymorfism
    @Override
    public double beräknaVätskemängd() {
        return MINERALVATTEN_MÄNGD;
    }

    @Override
    public Vätsketyp angeFöredragenVätska() {
        return Vätsketyp.MINERALVATTEN;
    }
}