package Checkpoint1.MassOfRocket;

public class RocketComponent {
    private String name;
    private double weight;
    private final double accelerationDueToGravity;
    private String material;
    private double costOfProduction;
    public RocketComponent(String name, double weight, String material, double costOfProduction)
    {
        this.name=name;
        this.weight=weight;
        this.material=material;
        this.costOfProduction=costOfProduction;
        this.accelerationDueToGravity=9.8;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAccelerationDueToGravity() {
        return accelerationDueToGravity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCostOfProduction() {
        return costOfProduction;
    }

    public void setCostOfProduction(double costOfProduction) {
        this.costOfProduction = costOfProduction;
    }
    public double calculateMassOfRocketComponent(double weight)
    {
        double mass=0.0;
        if(weight<=0)
        {
            return -1;
        }
        mass=weight/accelerationDueToGravity;
        String a=String.format("%.2f",mass);
        double finalMass=Double.parseDouble(a);
        return finalMass;
    }
}
