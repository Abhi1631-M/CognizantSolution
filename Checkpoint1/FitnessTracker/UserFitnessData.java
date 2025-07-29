package Checkpoint1.FitnessTracker;

public class UserFitnessData implements FitnessMonitor {
    private String userName;
    private double weight;
    private int stepsTaken;
    private double distanceCovered;
    private boolean runningStatus;
    public UserFitnessData()
    {

    }
    public  UserFitnessData(String userName, double weight, int stepsTaken, double distanceCovered, boolean runningStatus)
    {
        this.userName=userName;
        this.weight=weight;
        this.stepsTaken=stepsTaken;
        this.distanceCovered=distanceCovered;
        this.runningStatus=runningStatus;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isRunningStatus() {
        return runningStatus;
    }

    public double getDistanceCovered() {
        return distanceCovered;
    }

    public String getUserName() {
        return userName;
    }

    public int getStepsTaken() {
        return stepsTaken;
    }

    public void setDistanceCovered(double distanceCovered) {
        this.distanceCovered = distanceCovered;
    }

    public void setRunningStatus(boolean runningStatus) {
        this.runningStatus = runningStatus;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setStepsTaken(int stepsTaken) {
        this.stepsTaken = stepsTaken;
    }
    public boolean getRunningStatus()
    {
        return runningStatus;
    }

    @Override
    public String findFitnessLevel() {
        double fitnessScore=((0.1*stepsTaken)+(1.8*distanceCovered))/weight;
        if(fitnessScore<=5)
        {
            return "Low";
        } else if (fitnessScore<=10) {
            return "Moderate";

        }else {
            return "High";
        }
    }
}
