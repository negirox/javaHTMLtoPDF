package com.negirox.samples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.html2pdf.HtmlConverter;

public class App 
{
	
    public static void main( String[] args ) throws FileNotFoundException, IOException  
    {
    	// HTML file to PDF
    	HtmlConverter.convertToPdf(new FileInputStream("index.html"), 
    			new FileOutputStream("PDFwithHTMLandCSS.pdf"));
        System.out.println( "PDF Created! Success fully" );
    }
}
