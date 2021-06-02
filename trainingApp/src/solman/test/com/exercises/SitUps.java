package solman.test.com.exercises;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SitUps implements IExercise {
    private final String EXERCISE_NAME = "sit-ups";
    private final String DESCRIPTION = "An exercise for improving core strength";
    private final Path IMG_STRING = Paths.get("resources/sit-up-large.png");
    private int repetitions;

    public SitUps(){
        this.repetitions = 15;
    }
    public SitUps(int repetitions){
        this.repetitions = repetitions;
    }

    @Override
    public String getDescription() {
        return null;
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
