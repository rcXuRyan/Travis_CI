package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float v = (this.getValue()-32)*5/9;
        return new Celsius(v);
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue()+" F";
    }
}
