package com.dbl;

import org.apache.tika.Tika;

import java.io.File;
import java.io.IOException;

public class NumerosMagicosSec {

    public static void main(String[] args) throws Exception {
        Tika tika = new Tika();
        File supostoPDF = new File("C:\\Users\\vitor\\Documents\\digitalbricklayer\\numeros-magicos-sec\\src\\main\\resources\\pdf_padrao.docx.pdf");
        File supostoCSV = new File("C:\\Users\\vitor\\Documents\\digitalbricklayer\\numeros-magicos-sec\\src\\main\\resources\\helllo.csv");
        if (!supostoPDF.getName().endsWith(".pdf")){
            throw new Exception("aruqivo nao  extensao de formato de pdf");
        }

        String mimeType =  tika.detect(
                supostoPDF
        );
        String mimeType2 =  tika.detect(
                supostoCSV
        );

        System.out.println(mimeType);
        System.out.println(mimeType2);
    }
}
