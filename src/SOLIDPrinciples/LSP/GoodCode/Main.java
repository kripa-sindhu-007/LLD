package SOLIDPrinciples.LSP.GoodCode;

public class Main {

    public static void ReadAnyFile(ReadableFile file){
        file.read();
    }

    public static void main(String[] args){
        ReadableFile readableFile = new ReadableFile();
        readableFile.read();

        WritableFile writableFile = new WritableFile();
        writableFile.read();
        writableFile.write();

        ReadAnyFile(readableFile);
        ReadAnyFile(writableFile);  // can pass both parent and child to the method as it
                                    // is implementing LSP correctly

    }
}
