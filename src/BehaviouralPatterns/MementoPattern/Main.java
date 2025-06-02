package BehaviouralPatterns.MementoPattern;

public class Main {

    public static void main(String[] args){
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker(); // manage history
        textEditor.write("Hello Everyone!!");
        caretaker.saveState(textEditor);
        textEditor.write("Content Updated!!");
        caretaker.saveState(textEditor);

        System.out.println(textEditor.getContent());

        //undo
        caretaker.undo(textEditor);
        System.out.println(textEditor.getContent());

        //redo
        caretaker.redo(textEditor);
        System.out.println(textEditor.getContent());
    }
}
