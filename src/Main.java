public class Main {
    public static void main(String[] args) {

        // Task 1
        int length = 2;
        int weight = 4;
        int thirdVariable = 3;
        int area = (length * weight * thirdVariable);
        System.out.println("The area value is " + area);

        //Task 2
        double weightKilograms = 65.1;
        double heightMeters = 1.68;
        double bodyMassIndex = weightKilograms / (heightMeters * heightMeters);
        System.out.println("Body Mass Index equals " + bodyMassIndex);

        //Task 3
        double temperatureCelsius = 26;
        double temperatureFahrenheit;
        temperatureFahrenheit = (9.0 / 5.0) * temperatureCelsius + 32;
        System.out.println("Temperature in Fahrenheit is " + temperatureFahrenheit);

        //Task 4
        int largestPossibleValue = 2147483647;
        int newVariable = largestPossibleValue + 1;
        System.out.println(newVariable);

        //Task 5
        double variableFraction = 2.5;
        int variableInteger = (int) variableFraction;
        System.out.println(variableFraction);
        System.out.println(variableInteger);

        //Task 6
        int age = 25;
        boolean ageCheck = age >= 18;
        System.out.println(ageCheck);
    }
}