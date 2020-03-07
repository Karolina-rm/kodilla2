package factory.tasks;

public class PaintingTask implements Task {

    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean isExecuted) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
