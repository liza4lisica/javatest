public class RandomJava {

    public static void main(String[] args) {
        // Випадковий цілий
        int randomInteger = (int) (Math.random() * 100);
        System.out.println("Випадковий цілий: " + randomInteger);

        // Випадковий дійсний
        double randomDouble = Math.random();
        System.out.println("Випадковий дійсний: " + randomDouble);

        // Випадковий рядок
        String randomString = "abcdefghijklmnopqrstuvwxy";
        int randomIndex = (int) (Math.random() * randomString.length());
        System.out.println("Випадковий рядок: " + randomString.charAt(randomIndex));

        // Випадковий логічний
        boolean randomBoolean = Math.random() > 0.5;
        System.out.println("Випадковий логічний: " + randomBoolean);
    }
}
