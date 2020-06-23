public class ConveteTemperaturas {
    public static void main(String[] args) {
        System.out.println(celsiusParaFahrenheit(100));
        System.out.println(celsiusParaFahrenheit(0));
    }

    public static double celsiusParaFahrenheit(double grauCelsius) {
        double fahrenheit;
        return fahrenheit = (grauCelsius * 1.8 + 32);
    }
}
