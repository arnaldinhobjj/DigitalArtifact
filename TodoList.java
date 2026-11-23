
import java.util.ArrayList;

public class TodoList {
    public ArrayList<Item> todoList = new ArrayList<Item>();

    // Displays list
    public ArrayList<Item> getList() {
        return todoList;
    }

    public void displayList() {
        for (Item item : todoList) {

            System.out.println("Title: " + item.getTitle());
            System.out.println("Content: " + item.getContent());
            System.out.println("Completed: " + item.getIsCompleted());

            System.out.println("----------------");
        }
    }

    public void setItem(String type, String content, boolean isCompleted) {
        Item item = new Item(type, content, false);
        todoList.add(item);
    }

    // todo
    public ArrayList<Item> getByType(String type) {
        return todoList;
    }

    // todo
    public ArrayList<Item> getCompleted() {
        return todoList;
    }
}
