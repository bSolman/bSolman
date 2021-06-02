package solman.test.com.programs;

import solman.test.com.exercises.IExercise;
import solman.test.com.exercises.Intervals;
import solman.test.com.exercises.PushUps;
import solman.test.com.exercises.SitUps;

public class CreateProgram implements IProgram{
    private String name;
    private IExercise[] exercises;

    public CreateProgram(String name){
        this.name = name;
    }
    @Override
    public void inputExercises(int[] inputs) {
        createExerciseList(inputs);
    }

    @Override
    public IExercise[] exerciseList() {
        return exercises;
    }

    private void createExerciseList(int[] input){
        exercises = new IExercise[input.length];
        int i = 0;
        for(int x : input){
            switch (x){
                case 1:
                    exercises[i] = new PushUps();
                    i++;
                    break;
                case 2:
                    exercises[i] = new Intervals();
                    i++;
                    break;
                case 3:
                    exercises[i] = new SitUps();
                    i++;
                    break;
            }
        }
    }
}
