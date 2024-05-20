package designPatterns.behavioural.mementoPattern;

public class MainApp {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.editText("Hello ");
        System.out.println("Current text " + textEditor.getTextArea().getText());
        textEditor.editText("Whats up?? ");
        System.out.println("Current text " + textEditor.getTextArea().getText());

        textEditor.editText("Nothing. Could you undo this");
        System.out.println("Current text " + textEditor.getTextArea().getText());
        System.out.println("Now undoing");

        textEditor.undo();

        System.out.println("Current text " + textEditor.getTextArea().getText());



    }
}
