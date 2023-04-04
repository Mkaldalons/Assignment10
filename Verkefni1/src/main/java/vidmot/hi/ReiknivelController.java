package vidmot.hi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import vinnsla.hi.Reiknivel;



public class ReiknivelController {
    /**
     * Hlutur reiknivél úr klasanum
     * Reiknivél
     */
    private Reiknivel reiknivel;
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
    private TextField uttak;

    public void initialize() {
        this.reiknivel = new Reiknivel();

    }


    /**
     * Sækir virkja sem er ýtt á, velur tölu til að
     * beita virkjanum á og sýnir notenda hvaða
     * virki er að verki í glugga reiknivélar
     *
     * @param actionEvent
     */
    @FXML
    /*
    public void virkiHandler(ActionEvent actionEvent) {
        int selectedOperator = Integer.parseInt(((Button) actionEvent.getSource()).getId());
        firstNumber = uttak.getText();
        reiknivel.setTala1(Integer.parseInt(firstNumber));
        reiknivel.setVirkiIndex(selectedOperator - 10);
        switch (selectedOperator) {
            case 10 -> uttak.setText(reiknivel.getTala1()+" + ");
            case 11 -> uttak.setText(reiknivel.getTala1()+" - ");
            case 12 -> uttak.setText(reiknivel.getTala1()+" / ");
            case 13 -> uttak.setText(reiknivel.getTala1()+" * ");
        }
    }

     */
    public void virkiHandler(ActionEvent actionEvent) {
        int selectedOperator = Integer.parseInt(((Button) actionEvent.getSource()).getId());
        firstNumber = uttak.getText();
        reiknivel.setTala1(Integer.parseInt(firstNumber));
        reiknivel.setVirkiIndex(selectedOperator - 10);
        switch (selectedOperator) {
            case 10 -> operator = " + ";
            case 11 -> operator = " - ";
            case 12 -> operator = " / ";
            case 13 -> operator = " * ";
        }
        uttak.setText(reiknivel.getTala1()+operator);
    }




    /**
     * Birtir jöfnuna sem notandi hefur slegið
     * inn ásamt því að skila niðurstöðu reikninga
     * Athugar einnig hvort sé deilt með 0 og skilar villuskilaboðum sé það gert
     *
     * @param actionEvent
     */
    @FXML
    /*
    public void jafntogHandler(ActionEvent actionEvent) {
        String textFieldText = uttak.getText();
        String[] operands = textFieldText.split("");
        int tala2 = Integer.parseInt(operands[operands.length-1]);
        reiknivel.setTala2(tala2);
        if (operator.equals("/") && tala2 == 0) {
            uttak.setText("Villa: Það er ekki hægt að deila með 0");
        } else {
            int answer = reiknivel.jafntOg();
            uttak.setText(textFieldText+" = "+answer);
        }
    }

     */
    public void jafntogHandler(ActionEvent actionEvent) {
        String textFieldText = uttak.getText();
        String[] operands = textFieldText.split(" ");
        int tala2 = Integer.parseInt(operands[operands.length-1]);
        reiknivel.setTala2(tala2);
        String operator = operands[operands.length-2];
        if (operator.equals("/") && tala2 == 0) {
            uttak.setText("Villa: Það er ekki hægt að deila með 0");
        } else {
            int answer = reiknivel.jafntOg();
            uttak.setText(textFieldText+" = "+answer);
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
        uttak.setText(uttak.getText() + tala);

    }

    /**
     * Hreinsar TextField og leyfir notenda að byrja upp á nýtt
     *
     * @param actionEvent
     */
    @FXML
    public void hreinsaHandler(ActionEvent actionEvent) {
        uttak.setText("");
        reiknivel.hreinsa();
    }

}



