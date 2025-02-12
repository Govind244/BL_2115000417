class TextState {
    String text;
    TextState prev, next;

    public TextState(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    private TextState current;
    private int maxHistory;
    private int size;

    public TextEditor(int maxHistory) {
        this.current = null;
        this.maxHistory = maxHistory;
        this.size = 0;
    }

    public void type(String newText) {
        TextState newState = new TextState(newText);
        if (current == null) {
            current = newState;
        } else {
            newState.prev = current;
            current.next = newState;
            current = newState;
        }
        size++;
        if (size > maxHistory) {
            removeOldest();
        }
    }

    private void removeOldest() {
        TextState temp = current;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        if (temp.next != null) {
            temp.next.prev = null;
        }
        size--;
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Undo not possible.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Redo not possible.");
        }
    }

    public void display() {
        if (current != null) {
            System.out.println("Current State: " + current.text);
        } else {
            System.out.println("No text available.");
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.type("Hello");
        editor.type("Hello, World!");
        editor.type("Hello, World! This is a text editor.");

        System.out.println("\nCurrent Text:");
        editor.display();

        System.out.println("\nUndo:");
        editor.undo();
        editor.display();

        System.out.println("\nUndo:");
        editor.undo();
        editor.display();

        System.out.println("\nRedo:");
        editor.redo();
        editor.display();
    }
}
