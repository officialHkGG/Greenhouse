class KöttätandeVäxt implements Växt {
    private double längd; // Längd i meter
    private static final double PROTEIN_FAKTOR = 0.1;
    private static final double TILLSKOTT_PROTEIN_FAKTOR = 0.2;

    public KöttätandeVäxt(double längd) {
        this.längd = längd;
    }

    @Override
    public double beräknaVätskemängd() {
        return PROTEIN_FAKTOR + (TILLSKOTT_PROTEIN_FAKTOR * längd);
    }

    @Override
    public Vätsketyp angeFöredragenVätska() {
        return Vätsketyp.PROTEINDRYCK;
    }
}