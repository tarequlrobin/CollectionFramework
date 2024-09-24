
    public class ReverseNumber {
        public static int reverse(int number) {

            String numString = Integer.toString(number);

            StringBuilder sb = new StringBuilder(numString);

            String reversedString = sb.reverse().toString();

            int reversedNumber = Integer.parseInt(reversedString);

            return reversedNumber;
        }

        public static void main(String[] args) {
            int number = 12345;
            int reversedNumber = reverse(number);
            System.out.println("Original number: " + number);
            System.out.println("Reversed number: " + reversedNumber);
        }
}
