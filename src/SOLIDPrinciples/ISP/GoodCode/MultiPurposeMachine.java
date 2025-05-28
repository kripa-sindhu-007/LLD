package SOLIDPrinciples.ISP.GoodCode;

import SOLIDPrinciples.ISP.BadCode.Document;

public class MultiPurposeMachine implements Printer,Scanner,Copier {

    @Override
    public void print(Document doc) {
        System.out.println("Printing Document...");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning Document...");

    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copying Document...");

    }
}
