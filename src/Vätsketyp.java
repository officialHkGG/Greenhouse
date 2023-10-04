public enum Vätsketyp {
    KRANVATTEN,
    MINERALVATTEN,
    PROTEINDRYCK
}
interface Växt {
    double beräknaVätskemängd();
    Vätsketyp angeFöredragenVätska();
}