package DocumentManger;

public class Demo {

        public static void main(String[] args) {
            // Erstellen von Dokumenten
            TextDocument textDoc = new TextDocument("Test.png");
            ImageDocument imageDocument = new ImageDocument("Picture.png", 100, 100, "green");
            TextDocument pdfDoc = new TextDocument("document.pdf");

            // PrintManager verwenden
            PrintManager manager = new PrintManager();
            manager.addDocument(textDoc);
            manager.addDocument(pdfDoc);
            manager.addDocument(pdfDoc);

            // Alle Dokumente drucken
            System.out.println("Printing all documents:");
            manager.printDocument();
            manager.printDocument();

        }
    }

