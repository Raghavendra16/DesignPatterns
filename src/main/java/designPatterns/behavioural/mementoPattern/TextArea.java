package designPatterns.behavioural.mementoPattern;

public class TextArea {

    private String text;

    public TextArea() {
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento takeSnapshot(String text) {
        return new Memento(text);
    }

    public static class Memento {
        private final String savedText;
        public Memento(String text) {
            this.savedText = text;
        }

        public String restore() {
            return savedText;
        }


    }
}
