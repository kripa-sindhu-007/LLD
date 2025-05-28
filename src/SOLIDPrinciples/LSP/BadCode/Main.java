package SOLIDPrinciples.LSP.BadCode;

public class Main {

    public static void main(String[] args){
        File file = new ReadOnlyFile();
        file.read(); // works correct
        file.write(); // throws an exception
    }
}
