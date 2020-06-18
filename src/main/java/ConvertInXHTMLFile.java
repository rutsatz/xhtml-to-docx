//import org.apache.commons.io.FileUtils;
//import org.docx4j.convert.in.xhtml.XHTMLImporterImpl;
//import org.docx4j.jaxb.Context;
//import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
//import org.docx4j.wml.RFonts;
//
//import java.io.File;
//
//public class ConvertInXHTMLFile {
//
//    public static void main(String[] args) throws Exception {
//
//        String inputfilepath = "/home/rafael.rutsatz/Downloads/input.html";
//        String output = "/home/rafael.rutsatz/Downloads/output.docx";
//        String stringFromFile = FileUtils.readFileToString(new File(inputfilepath), "UTF-8");
//
////        XHTMLImporter.setTableFormatting(FormattingOption.IGNORE_CLASS);
////        XHTMLImporter.setParagraphFormatting(FormattingOption.IGNORE_CLASS);
//
//        // Setup font mapping
//        RFonts rfonts = Context.getWmlObjectFactory().createRFonts();
//        rfonts.setAscii("Century Gothic");
//        XHTMLImporterImpl.addFontMapping("Century Gothic", rfonts);
//
//        // Create an empty docx package
//        WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();
////
////        NumberingDefinitionsPart ndp = new NumberingDefinitionsPart();
////        wordMLPackage.getMainDocumentPart().addTargetPart(ndp);
////        ndp.unmarshalDefaultNumbering();
//
//        // Convert the XHTML, and add it into the empty docx we made
//        XHTMLImporterImpl XHTMLImporter = new XHTMLImporterImpl(wordMLPackage);
//
////        XHTMLImporter.setHyperlinkStyle("Hyperlink");
//        wordMLPackage.getMainDocumentPart().getContent().addAll(
//                XHTMLImporter.convert(stringFromFile, null));
//
//        wordMLPackage.save(new java.io.File(output));
//
//    }
//}
