package vidmot.hi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import vinnsla.hi.Calculator;


public class CalculatorController {
    /**
     * Hlutur reiknivél úr klasanum
     * Reiknivél
     */
    private Calculator calculator;
    /**
     * Heldur utan um hvaða virki
     * er valinn í vasareikni til
     * að sýna í textField
     */
    private String operator = "";
    /**
     * Heldur utan um fyrstu tölu sem er valin
     * svo hægt sé að birta "jöfnu" í heild
     * sinni fyrir notenda í TextField
     */
    private String firstNumber = "";
    /**
     * Breytan uttak heldur utan um TextField gluggann og það sem birtist þar
     */
    @FXML
    private TextField result;

    public void initialize() {
        this.calculator = new Calculator();

    }


    /**
     * Sækir virkja sem er ýtt á, velur tölu til að
     * beita virkjanum á og sýnir notenda hvaða
     * virki er að verki í glugga reiknivélar
     *
     * @param actionEvent
     */
    @FXML

    public void operatorHandler(ActionEvent actionEvent) {
        int selectedOperator = Integer.parseInt(((Button) actionEvent.getSource()).getId());
        firstNumber = result.getText();
        calculator.setTala1(Integer.parseInt(firstNumber));
        calculator.setVirkiIndex(selectedOperator - 10);
        switch (selectedOperator) {
            case 10 -> operator = " + ";
            case 11 -> operator = " - ";
            case 12 -> operator = " / ";
            case 13 -> operator = " * ";
        }
        result.setText(calculator.getTala1()+operator);
    }




    /**
     * Birtir jöfnuna sem notandi hefur slegið
     * inn ásamt því að skila niðurstöðu reikninga
     * Athugar einnig hvort sé deilt með 0 og skilar villuskilaboðum sé það gert
     *
     * @param actionEvent
     */
    @FXML

    public void jafntogHandler(ActionEvent actionEvent) {
        String textFieldText = result.getText();
        String[] operands = textFieldText.split(" ");
        int num2 = Integer.parseInt(operands[operands.length-1]);
        calculator.setTala2(num2);
        String operator = operands[operands.length-2];
        if (operator.equals("/") && num2 == 0) {
            result.setText("Villa: Það er ekki hægt að deila með 0");
        } else {
            int answer = calculator.jafntOg();
            result.setText(textFieldText+" = "+answer);
        }
    }


    /**
     * Sækir tölu sem ýtt er á og birtir í TextField glugga
     *
     * @param actionEvent
     */
    @FXML
    public void inntakTalaActionPerformed(ActionEvent actionEvent) {
        int tala = Integer.parseInt(((Button) actionEvent.getSource()).getId());
        result.setText(result.getText() + tala);

    }

    /**
     * Hreinsar TextField og leyfir notenda að byrja upp á nýtt
     *
     * @param actionEvent
     */
    @FXML
    public void clearHandler(ActionEvent actionEvent) {
        result.setText("");
        calculator.hreinsa();
    }

}



