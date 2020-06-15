package factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean isExecuted;

    public DrivingTask(String taskName, String where, String using, boolean isExecuted) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        isExecuted = false;
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
