package com.company;

public class Electric_Drive {
    private String Name;
    private float Power;
    private float  Radiation;
    public Electric_Drive(String Name,float Power,float Radiation){
        this.Name=Name;
        this.Power=Power;
        this.Radiation=Radiation;
    }
    public String getName(){
        return Name;
    }
    public float getPower(){
        return Power;
    }
    public float getRadiation(){
        return Radiation;
    }
    @Override
    public String toString() {
        String string = "Name of Electric Drive: " + getName() + "\nPower: " + getPower() + "\nRadiation: " + getRadiation();
        return string;
    }

}
