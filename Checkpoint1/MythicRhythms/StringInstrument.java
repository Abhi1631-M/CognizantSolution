package Checkpoint1.MythicRhythms;

public class StringInstrument extends MusicalInstrument{
    private int numberOfString;
    private String stringMaterial;
    public StringInstrument(int instrumentId, String instrumentName, String instrumentType, double price, Customer customerObj,
                            int numberOfString, String stringMaterial)
    {
        super(instrumentId,instrumentName,instrumentType,price,customerObj);
        this.numberOfString=numberOfString;
        this.stringMaterial=stringMaterial;

    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public void setNumberOfString(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    public String getStringMaterial() {
        return stringMaterial;
    }

    public void setStringMaterial(String stringMaterial) {
        this.stringMaterial = stringMaterial;
    }

    @Override
    public double calculateTotalBill() {
        double pPs=0;
        double tb;
        String lString=stringMaterial.toLowerCase();
        if(lString.equals("nylon"))
        {
            pPs=15;

        }
        else if(lString.equals("steel"))
        {
            pPs=20;
        }else {
            return -1;
        }
        tb=price+(pPs*numberOfString);
        if(price>20000)
        {
            tb=tb-(tb*0.30);
        }
        setPrice(tb);
        return tb;

    }

}
