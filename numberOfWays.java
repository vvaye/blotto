package main;

public class blotto2 {
    public static void main(String[] args) {
        int counter = 0;
        int total = 8;
        for (int i = 0; i <= total; i++) {
            int[] array = new int[10];
            total = total- i;
            for (int j = 0; j <= total; j++) {
                total = total - j;
                for (int k = 0; k <= total; k++) {
                    total = total - k;
                    for (int l = 0; l <= total; l++) {
                        total = total - l;
                        for (int m = 0; m <= total; m++) {
                            total = total - m;
                            for (int n = 0; n <= total; n++) {
                                total = total - n;
                                for (int o = 0; o <= total; o++) {
                                    total = total - o;
                                    for (int p = 0; p <= total; p++) {
                                        total = total - p;
                                        for (int q = 0; q <= total; q++) {
                                            total = total - q;
                                            //code specifically for the last tower in the array
                                            array[0] = i;
                                            array[1] = j;
                                            array[2] = k;
                                            array[3] = l;
                                            array[4] = m;
                                            array[5] = n;
                                            array[6] = o;
                                            array[7] = p;
                                            array[8] = q;
                                            array[9] = total;
                                            //prints array
                                            /*System.out.print("\n[");
                                            for (int r = 0; r < 10; r++) {
                                                if (r == 9) {
                                                    System.out.print(array[r]);
                                                } else {
                                                    System.out.print(array[r] + ", ");
                                                }
                                            }
                                            System.out.print("]");*/
                                            counter++;
                                            total = total + q;
                                        }
                                        total = total + p;
                                    }
                                    total = total + o;
                                }
                                total = total + n;
                            }
                            total = total + m;
                        }
                        total = total + l;
                    }
                    total = total + k;
                }
                total = total + j;
            }
            total = total + i;
        }
        System.out.println(counter + " number of ways for " + total + " people and 10 groups");
    }
    //generate dividing 50 people into 5 teams

}
