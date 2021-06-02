package solman.test.com.programs;

import solman.test.com.exercises.IExercise;

public interface IProgram {
    void inputExercises(int[] inputs);
    IExercise[] exerciseList();
}
