/*******************************************************
 * Nafn: María Rós Kaldalóns
 * T-póstur: mrk9@hi.is
 *
 * Lýsing: Klasi sem býr til reiknivél sem hefur aðferðir
 * til að sinna öllum helstu hlutverkum reiknivélar
 *
 *
 *********************************************************/
package vinnsla.hi;

public class Reiknivel {

    private int tala1;
    private int tala2;
    private int virkiIndex;

    /**
     * Reikna[] fylkið heldur utan um
     * 4 mismunandi lambda föll fyrir virkjana 4
     */
    private static final Reikna[] virkjar = {
            Integer::sum,
            (x, y) -> x - y,
            (x, y) -> {
                if (y == 0) {
                    throw new IllegalArgumentException("Ekki hægt að deila með núlli!");
                } else if (x == 0) {
                    return 0;
                }else
                return (x / y);
            },
            (x, y) -> x * y,
    };

    /**
     * Settari fyrri tölu1 sem er slegin inn af notenda
     *
     * @param tala1
     */
    public void setTala1(int tala1) {
        this.tala1 = tala1;
    }

    /**
     * Gettari fyrir tölu1
     * @return skilar fyrstu tölu sem er slegin inn svo hún birtist notenda þó þau noti aðra takka.
     */
    public int getTala1(){
        return tala1;
    }

    /**
     * Settari fyrir seinni tölu sem er slegin inn af notenda
     * @param tala2
     */
    public void setTala2(int tala2){
        this.tala2 = tala2;
    }

    /**
     * Heldur utan um index á lambda falli virkjans sem hefur verið valinn
     * @param virkiIndex
     */
    public void setVirkiIndex(int virkiIndex) {
        this.virkiIndex = virkiIndex;
    }

    /**
     *
     * @return Skilar [virki](tala1, tala2)
     */
    public int reikna() {
        return virkjar[virkiIndex].reikna(tala1, tala2);
    }

    /**
     * Núllstillir allar upplýsingar svo hægt sé að byrja upp á nýtt í vasareikni
     */
    public void hreinsa() {
        tala1 = 0;
        tala2 = 0;
        virkiIndex = 0;
    }

    /**
     *
     * @return niðurstöðu útreikninga
     */
    public int jafntOg() {
        return reikna();
    }

}


