class Palm implements Växt {
    private double längd;
    private static final double VATTEN_FAKTOR = 0.5;

    public Palm(double längd) {
        this.längd = längd;
    }

    @Override
    public double beräknaVätskemängd() {
        return VATTEN_FAKTOR * längd;
    }

    @Override
    public Vätsketyp angeFöredragenVätska() {
        return Vätsketyp.KRANVATTEN;
    }
}