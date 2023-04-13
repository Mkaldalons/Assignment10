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

public class Calculator {

    private int num1;
    private int num2;
    private int operatorIndex;

    /**
     * Calculate[] fylkið heldur utan um
     * 4 mismunandi lambda föll fyrir virkjana 4
     */
    private static final Calculate[] operators = {
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
     * @param num1
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * Gettari fyrir tölu1
     * @return skilar fyrstu tölu sem er slegin inn svo hún birtist notenda þó þau noti aðra takka.
     */
    public int getNum1(){
        return num1;
    }

    /**
     * Settari fyrir seinni tölu sem er slegin inn af notenda
     * @param num2
     */
    public void setNum2(int num2){
        this.num2 = num2;
    }

    /**
     * Heldur utan um index á lambda falli virkjans sem hefur verið valinn
     * @param operatorIndex
     */
    public void setOperatorIndex(int operatorIndex) {
        this.operatorIndex = operatorIndex;
    }

    /**
     *
     * @return Skilar [virki](tala1, tala2)
     */
    public int calculate() {
        return operators[operatorIndex].calculate(num1, num2);
    }

    /**
     * Núllstillir allar upplýsingar svo hægt sé að byrja upp á nýtt í vasareikni
     */
    public void clear() {
        num1 = 0;
        num2 = 0;
        operatorIndex = 0;
    }

    /**
     *
     * @return niðurstöðu útreikninga
     */
    public int equals() {
        return calculate();
    }

}


