package BehaviouralPatterns.MementoPattern;


//Memento Class: Stores the internal state of the editor
public class EditorMemento {
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
