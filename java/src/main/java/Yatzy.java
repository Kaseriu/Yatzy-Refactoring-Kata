import java.util.Arrays;

public class Yatzy {

    public static int chance(int... dice) {
        return Arrays.stream(dice).sum();
    }

    public static int yatzy(int... dice) {
        return Arrays.stream(dice).distinct().count() == 1 ? 50 : 0;
    }

    public static int placed_on(int numberPlacedOn, int... dice) {
        int sum = 0;

        for (int die : dice) {
            if (die == numberPlacedOn) {
                sum += numberPlacedOn;
            }
        }

        return sum;
    }

    public static int score_pair(int... dice) {
        int[] counts = new int[6];
        int highest = 0;

        for (int die : dice) {
            counts[die - 1]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 2) {
                highest = i;
            }
        }

        return highest == 0 ? 0 : (highest + 1) * 2;
    }

    public static int score_two_pairs(int... dice) {
        int[] counts = new int[6];
        int n = 0;
        int score = 0;

        for (int die : dice) {
            counts[die - 1]++;
        }

        for (int i = 0; i < counts.length; i++)
            if (counts[i] >= 2) {
                n++;
                score += (i + 1);
            }

        return n == 2 ? score * 2 : 0;
    }

    public static int three_of_a_kind(int... dice) {
        int[] counts = new int[6];

        for (int die : dice) {
            counts[die - 1]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 3) {
                return (i + 1) * 3;
            }
        }

        return 0;
    }

    public static int four_of_a_kind(int... dice) {
        int[] counts = new int[dice.length];

        for (int die : dice) {
            counts[die - 1]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 4) {
                return (i + 1) * 4;
            }
        }

        return 0;
    }

    public static int smallStraight(int... dice) {
        int[] counts = new int[6];

        for (int die : dice) {
            if (die == 6) {
                return 0;
            }
            counts[die - 1]++;
        }

        for (int i = 0; i < counts.length - 1; i++) {
            if (counts[i] != 1) {
                return 0;
            }
        }

        return 15;
    }

    public static int largeStraight(int... dice) {
        int[] counts = new int[6];

        for (int die : dice) {
            if (die == 1) {
                return 0;
            }
            counts[die - 1]++;
        }

        for (int i = 1; i < counts.length; i++) {
            if (counts[i] != 1) {
                return 0;
            }
        }

        return 20;
    }

    public static int fullHouse(int... dice) {

        if (three_of_a_kind(dice) == 0 || score_two_pairs(dice) == 0) {
            return 0;
        }

        return Arrays.stream(dice).sum();
    }
}



