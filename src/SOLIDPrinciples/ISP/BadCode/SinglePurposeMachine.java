package SOLIDPrinciples.ISP.BadCode;

public class SinglePurposeMachine implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Printing Document...");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scan not supported..."); // violation of ISP Principle
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("Copy not supported...");

    }
}
