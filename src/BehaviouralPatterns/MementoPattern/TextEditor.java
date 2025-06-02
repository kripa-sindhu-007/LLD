package BehaviouralPatterns.MementoPattern;


/* A text editor where the user can undo changes, such as text addition and formatting.
* The editor stores the snapshot of its state after each change, enabling the user to revert to
* the previous state. */

public class TextEditor {

    private String content;      // can use stack to implement the functionality, but it will violate the SRP principle

    public void write(String text){
        this.content = text;
    }

    public String getContent(){
        return content;
    }

    public EditorMemento save(){
        return new EditorMemento(content);  // if multiple (content,headline,.....)
    }

    public void restore(EditorMemento memento){
        content = memento.getContent();
    }
}
