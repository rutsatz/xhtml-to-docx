import org.apache.commons.io.FileUtils;
import org.docx4j.convert.in.xhtml.XHTMLImporterImpl;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class XhtmlToDocxAndBack {

    private static final Logger log = LoggerFactory.getLogger(XhtmlToDocxAndBack.class);

    public static void main(String[] args) throws Exception {

        String input = null;
        String output = null;

        if (args.length == 0) {
            input = "/home/rafael.rutsatz/Downloads/input.html";
            output = "/home/rafael.rutsatz/Downloads/output.docx";
        } else if (args.length == 2) {
            input = args[0];
            output = args[1];
        } else {
            log.error("Parâmetros incorretos. Exemplo: java -jar conversor.jar <input.html> <output.docx>");
            System.exit(-1);
        }
        convertAndSave(input, output);
    }

    private static void convertAndSave(String input, String output) throws Docx4JException, IOException {
        WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();
        wordMLPackage
                .getMainDocumentPart()
                .getContent()
                .addAll(new XHTMLImporterImpl(wordMLPackage)
                        .convert(FileUtils.readFileToString(new File(input), "UTF-8"), null)
                );
        wordMLPackage.save(new File(output));
    }

}
