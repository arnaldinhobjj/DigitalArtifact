public class Main {

    public static void main(String[] args) {

        TodoList todo = new TodoList();

        // Add tasks
        todo.setItem("Shopping", "Buy Jacket", false);
        todo.setItem("Work", "Finish project", false);
        todo.setItem("Groceries", "Buy eggs and milk", false);

        // Display tasks
        todo.displayList();
    }
}
