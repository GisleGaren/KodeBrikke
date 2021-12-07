package com.example.kodebrikke;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

class KodeGenerator {
    private int[] kodeArray;
    private Random r = new Random();
    private int nyKodeIndeks = 0;

    public KodeGenerator(int antall) {
        /* opprett array
           kall genererKoder for å legge kodene inn i arrayet */
        kodeArray = new int[antall];
        genererKoder();
    }

    private void genererKoder() {
        /* Fyller  kodeArray med tilfeldige, 6-sifrede tall.
           NB! Det laveste mulige tallet skal være 100000, og det høyeste 999999. */
        int i = 0;
        while(i < kodeArray.length){
            int randomTall = r.nextInt(900000) + 100000;
            kodeArray[i] = randomTall;
            i++;
        }
    }

    public String nyKode(int maksAntall) {
        // returnerer ny kode fra arrayet eller en feilmelding ved array-slutt
        if(nyKodeIndeks < maksAntall){
            return Integer.toString(kodeArray[nyKodeIndeks++]);
        }
        return "Maks antall!";
    }

    public String formaterBrukteKoder() {
        /* løp igjennom arrayet og formater kodene med \n i mellom
            kodene fra og med 0 til nyKodeIndeks er "brukte" koder */
    }
}

public class HelloController {

    // opprett KodeGeneratoren her
    KodeGenerator kode = new KodeGenerator()

    @FXML
    private Label lblGamleKoder;

    @FXML
    private Label lblNyKode;

    @FXML
    void gamleKoder(ActionEvent event) {
        // kall til formaterBrukteKoder og legg resultatet i lblGamleKoder
    }

    @FXML
    void nyKode(ActionEvent event) {
        // kall til nyKode og legg resultat i lblNykode
    }

}
