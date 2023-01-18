import java.util.Scanner;

public class BMI {
    // Aufgabenstellung:
    // Eingabe:
    // - Name
    // - Geburtsjahr
    // - Gewicht
    // - Größe
    // Ausgabe (vielleicht ein bisschen netter formuliert):
    // - Alter
    // - BMI (Gewicht [kg] / Größe² [m])
    // - Einschätzung des BMI (Version 2)

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = eingabe.next();
        System.out.print("Bitte geben Sie Ihr Geburtsjahr ein: ");
        int jahr = eingabe.nextInt();
        System.out.print("Bitte geben Sie Ihr Gewicht in kg ein: ");
        double gewicht = eingabe.nextDouble();
        System.out.print("Bitte geben Sie Ihre Größe in Meter ein: ");
        double größe = eingabe.nextDouble();

        int alter = 2023 - jahr;
        double bmi = gewicht / ( größe * größe );

        System.out.println("Hallo " + name + ",");
        System.out.println("du bist " + alter + " Jahre alt und");
        System.out.println("wiegst " + gewicht + "kg bei einer");
        System.out.println("Körpergröße von " + (größe * 100) + " Centimeter");
        //System.out.printf("Dein BMI beträgt: %.2f%n", bmi);
        System.out.println("Dein BMI beträgt: " + bmi);
    }
}
