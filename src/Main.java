class average {
    public static void main(String[] args) {
        double numbers[] = {-3.5, 4.5,-7.3, 9.3,-3.1, 8.3,
                9.6,-8.3, 9.9, 1.2,-6.7, 0.4, 0.9, 1.2, 4.1};
        double sam = 0;
        int f =0;
       boolean c = false;
for (double j:numbers){
    if (j < 0){
        c = true;
    }
    if (j > 0 && c ){
      sam = sam + j;
      f++;
    }
}
        System.out.println(sam/f);

    }

}