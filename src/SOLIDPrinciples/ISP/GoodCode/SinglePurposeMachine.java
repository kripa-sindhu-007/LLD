package SOLIDPrinciples.ISP.GoodCode;

import SOLIDPrinciples.ISP.BadCode.Document;

public class SinglePurposeMachine implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing Document...");

    }
}
