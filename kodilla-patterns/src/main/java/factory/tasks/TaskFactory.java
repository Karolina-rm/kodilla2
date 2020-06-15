package factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public Task doTask (String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Going", "home", "bus", true);
            case PAINTING:
                return new PaintingTask("Drawing", "blue", "sky", true);
            case SHOPPING:
                return new ShoppingTask("Buying", "cheese", 1, true);

        }
        return null;
    }
}
