package designPatterns.behavioural.mementoPattern;

import java.util.Deque;
import java.util.LinkedList;


public class TextEditor {

    private final Deque<TextArea.Memento> editHistory;
    private final TextArea textArea;

    public TextEditor() {
        this.editHistory = new LinkedList<>();
        this.textArea = new TextArea();
    }

    public void editText(String text) {
        textArea.setText(textArea.getText().concat(text));
        editHistory.add(textArea.takeSnapshot(text));
    }

    public String undo() {
        TextArea.Memento memento = editHistory.pollLast();
        String mementoText = memento.restore();
        String original = textArea.getText();
        original = original.substring(0, original.length() - mementoText.length());
        textArea.setText(original);
        return textArea.getText();
    }

    public TextArea getTextArea() {
        return textArea;
    }
}
