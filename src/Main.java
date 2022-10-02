class average {
    public static void main(String[] args) {
        double[] numbers = new double[15];
        numbers[0] = 1.2;
        numbers[1] = -2.4;
        numbers[2] = 6.2;
        numbers[3] = -8.9;
        numbers[4] = 8.2;
        numbers[5] = -2.6;
        numbers[6] = 2.9;
        numbers[7] = -7.5;
        numbers[8] = 5.5;
        numbers[9] = -3.9;
        numbers[10] = 0.3;
        numbers[11] = -1.7;
        numbers[12] = 0.8;
        numbers[14] = 9.3;
        double sum =0;
        System.out.println(numbers[2] + numbers[4] + numbers[6] + numbers[8] + numbers[10] + numbers[12] + numbers[14]);
        for (double num : numbers){
           sum +=num;
        }
        System.out.println("реднее арифметическое число равно  "   + sum/ numbers.length);
    }
}
