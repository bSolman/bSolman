package solman.test.com.exercises;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PushUps implements IExercise {
    private final String EXERCISE_NAME = "push ups";
    private final String DESCRIPTION = "An exercise for improving chest strength";
    private final Path IMG_STRING = Paths.get("resources/sit-up-large.png");
    private int repetitions;

    public PushUps(){
        this.repetitions = 15;
    }
    public PushUps(int repetitions){
        this.repetitions = repetitions;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public Path getImgString() {
        return IMG_STRING;
    }

    @Override
    public String toString(){
        return "Exercise: " + EXERCISE_NAME + "\n\t Reps: " + repetitions;
    }
}
