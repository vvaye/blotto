// package name should be unique, something like com.vivian.blotto
package main;
import java.util.*;

// class name should be up case
public class blotto {
    public static void main(String[] args) {
        System.out.println(findAnswer(8) + " total");
    }

    // is below comment still accurate?
    //generate dividing 50 people into 5 teams
    public static int findAnswer(int total) {
        int people = total;
        int counter = 0;
        String[][] finalScores = new String[2][92378];
        String[][] top5 = new String[2][5];
        for (int i = 0; i <= total; i++) {
            // team1 can be declared out of the for loop
            int[] team1 = new int[10];
            team1[0] = i;
            total = total- i;
            for (int j = 0; j <= total; j++) {
                team1[1] = j;
                total = total - j;
                for (int k = 0; k <= total; k++) {
                    team1[2] = k;
                    total = total - k;
                    for (int l = 0; l <= total; l++) {
                        team1[3] = l;
                        total = total - l;
                        for (int m = 0; m <= total; m++) {
                            team1[4] = m;
                            total = total - m;
                            for (int n = 0; n <= total; n++) {
                                team1[5] = n;
                                total = total - n;
                                for (int o = 0; o <= total; o++) {
                                    team1[6] = o;
                                    total = total - o;
                                    for (int p = 0; p <= total; p++) {
                                        team1[7] = p;
                                        total = total - p;
                                        for (int q = 0; q <= total; q++) {
                                            team1[8] = q;
                                            total = total - q;
                                            //code specifically for the last tower in the array
                                            team1[9] = total;
                                            // building string is very slow, should not build a string
                                            // instead use the counter(index) to remember the result (int)
                                            // so structure to store the score would be int[] scores[], with counter being the array index
                                            // after scroes[] is collected, loop through the scores to pick the top 5/10 indexes
                                            // then go through the same code again to print out the string/team setup for the top indexes
                                            String first = new String("Team: [");
                                            for (int r = 0; r < 10; r++) {
                                                if (r == 9) {
                                                    first += team1[r];
                                                } else {
                                                    first += (team1[r] + ",");
                                                }
                                            }
                                            //System.out.println(first + "]");
                                            finalScores[0][counter] = first;
                                            finalScores[1][counter] = String.valueOf(getTeam(people, team1));
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

        for (int i = 0; i < 15; i++) {

            System.out.println(finalScores[0][i] + "] Score: " + finalScores[1][i]);

        }
        return counter;
    }

    // should be called getScore and return int, avoid double for performance reason
    public static double getTeam(int total, int[] team1) {
        int counter = 0;
        double team1Score = 0;
        for (int i = 0; i <= total; i++) {
            int[] team2 = new int[10];
            team2[0] = i;
            total = total- i;
            for (int j = 0; j <= total; j++) {
                team2[1] = j;
                total = total - j;
                for (int k = 0; k <= total; k++) {
                    team2[2] = k;
                    total = total - k;
                    for (int l = 0; l <= total; l++) {
                        team2[3] = l;
                        total = total - l;
                        for (int m = 0; m <= total; m++) {
                            team2[4] = m;
                            total = total - m;
                            for (int n = 0; n <= total; n++) {
                                team2[5] = n;
                                total = total - n;
                                for (int o = 0; o <= total; o++) {
                                    team2[6] = o;
                                    total = total - o;
                                    for (int p = 0; p <= total; p++) {
                                        team2[7] = p;
                                        total = total - p;
                                        for (int q = 0; q <= total; q++) {
                                            team2[8] = q;
                                            total = total - q;
                                            //code specifically for the last tower in the array
                                            team2[9] = total;
                                            // comment out the string since it is not printed?
                                            String second = new String("\nTeam 2 is: [");
                                            for (int r = 0; r < 10; r++) {
                                                if (r == 9) {
                                                    second += team2[r];
                                                } else {
                                                    second += (team2[r] + ",");
                                                }
                                            }
                                            //System.out.println(second + "]");
                                            //System.out.println(getPoints(team1, team2));
                                            team1Score = team1Score + getPoints(team1, team2);
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
                                            // no need to have counter
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
        return team1Score;
    }

    // return int instead, 2 points for win, 1 for draw 
    public static double getPoints (int[] team1, int[] team2) {
        double points1 = 0;
        double points2 = 0;
        for (int i = 0; i < team1.length; i++) {
            if (team1[i] > team2[i]) {
                points1 = points1 + 1;
            } else if (team1[i] == team2[i]) {
                points1 = points1 + 0.5;
                points2 = points2 + 0.5;
            } else {
                points2 = points2 + 1;
            }
        }
        double pointsGained = 0;
        if (points1 > points2) {
            // can return 1 directly here, no need to have pointsGained variable
            pointsGained = 1;
        } else if (points1 == points2) {
            pointsGained = 0.5;
        } else {
            pointsGained = 0;
        }
        return pointsGained;
    }
}
