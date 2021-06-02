package solman.test.com.exercises;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Intervals implements IExercise{
    private final String EXERCISE_NAME = "Intervals";
    private final String DESCRIPTION = "An exercise for improving cardio";
    private final Path IMG_STRING = Paths.get("resources/sit-up-large.png");
    private int time;
    private int repetitions;

    public Intervals(){
        this.repetitions = 15;
        this.time = 10;
    }
    public Intervals(int repetitions, int time){
        this.repetitions = repetitions;
        this.time = time;
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
        return "Exercise: " + EXERCISE_NAME + "\n\t Reps: " + repetitions + "\n\t Time: " + time;
    }
}
