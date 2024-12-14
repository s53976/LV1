package DocumentManger;

import java.util.ArrayList;

public class PrintManager {
        private ArrayList<Document> documents = new ArrayList<>();

        public PrintManager() {
            this.documents = new ArrayList<>();
        }

        public void addDocument(Document d) {
            documents.add(d);
        }

        public void printDocument() {
            for (Document doc : documents) {
                doc.printDocument();
            }
        }

        public Document findDocument(String fileName) {
            for (Document doc : documents) {
                if (doc.fileName.equals(fileName)) {
                    return doc;
                }
            }
            return null;
        }

}
