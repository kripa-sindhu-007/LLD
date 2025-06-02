package BehaviouralPatterns.MementoPattern;

import java.util.Stack;

//Caretaker Class: Manage Memento (snapshots of the Text Editor State)
public class Caretaker {
    private final Stack<EditorMemento> history_undo = new Stack<>();
    private final Stack<EditorMemento> history_redo = new Stack<>();


    public void saveState(TextEditor editor){
        history_undo.push(editor.save());
    }

    public void undo(TextEditor editor){
        if(!history_undo.empty()){
            history_redo.push(history_undo.peek());
            history_undo.pop();
            editor.restore(history_undo.peek());
        }
    }

    public void redo(TextEditor editor){
        if(!history_redo.empty()){
            editor.restore(history_redo.pop());
        }
    }
}
