public class Item {
    private String title;
    private String content;
    private boolean isCompleted;

    // Accept user input and save it to a todo list
    public Item(String title, String content, boolean isCompleted) {
        this.title = title;
        this.content = content;
        this.isCompleted = isCompleted;
    }

    // Retrieve user input
    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public boolean getIsCompleted() {
        return this.isCompleted;
    }

    // Change item in the list
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}


