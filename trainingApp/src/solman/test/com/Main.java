package solman.test.com;

import solman.test.com.exercises.IExercise;
import solman.test.com.exercises.Intervals;
import solman.test.com.exercises.PushUps;
import solman.test.com.programs.CreateProgram;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] inputs = {1,2,1,3};
        CreateProgram p = new CreateProgram("My program");
        p.inputExercises(inputs);

        for (IExercise e : p.exerciseList()){
            System.out.println(e.getImgString());
        }
        Fuckers f = new Fuckers();
    }
}
