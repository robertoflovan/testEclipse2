package docpdf4j;

import org.docx4j.Docx4J;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class DocToPDF {

    public static void main(String[] args) {
        
    	
    	
        try {
            InputStream templateInputStream = new FileInputStream("C:\\Users\\Hexaware\\Documents\\Test word pdf\\tst.docx");
            WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(templateInputStream);
            MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();

            String outputfilepath = "C:\\Users\\Hexaware\\Documents\\Test word pdf\\tst.pdf";
            FileOutputStream os = new FileOutputStream(outputfilepath);
            Docx4J.toPDF(wordMLPackage,os);
            os.flush();
            os.close();
        } catch (Throwable e) {

            e.printStackTrace();
        } 
    }

}