package Checkpoint1.FitnessTracker;

public interface FitnessMonitor {

    String findFitnessLevel();
    static double calculateCaloriesBurnt(double weight, double distanceCovered, boolean runningStatus)
    {
        if(runningStatus)
        {
            return 0.75*weight*distanceCovered;
        }
        else{
            return 0.53*weight*distanceCovered;
        }
    }
}
