package factory.tasks;

public class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean isExecuted) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        isExecuted = true;
    }


    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
