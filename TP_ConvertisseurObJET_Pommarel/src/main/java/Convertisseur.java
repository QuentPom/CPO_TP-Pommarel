

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quent
 */
public class Convertisseur {
    double nbConversions = 0;
    @Override
    public String toString () {
 return "nb de conversions"+ nbConversions;
    }



    public double CelciusVersKelvin(double celcius){

        double Kelvin = celcius + 273.15;

        return Kelvin;

    }


    public double KelvinVersCelcius(double kelvin){

        double celcius = kelvin - 273.15;

        return celcius;

    }


    public double FarenheitVersCelcius(double farenheit){

        double celcius = (farenheit - 32) / 1.8;

        return celcius;

    }


    public double CelciusVersFarenheit(double celcius){

        double farenheit = (celcius * 1.8) + 32;

        return farenheit;

    }


    public double KelvinVersFarenheit(double kelvin){

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));

        return farenheit;

    }


    public double FarenheitVersKelvin(double farenheit){

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));

        return kelvin;

    }

}
    

