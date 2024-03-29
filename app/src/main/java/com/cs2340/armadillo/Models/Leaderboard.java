package com.cs2340.armadillo.Models;

public class Leaderboard {

    private long lowest;
    private int size;
    private String[] names = new String[5];
    private long[] scores = new long[5];
    private String[] dates = new String[5];
    private static Leaderboard leaderboard;

    /**
     * singleton constructor for leaderboard
     */
    private Leaderboard() {
        for (int i = 0; i < 5; i++) {
            names[i] = "-----";
            scores[i] = 0;
            dates[i] = "";
        }
        lowest = scores[4];
        size = 0;
    }

    /**
     * @return leaderboard singleton getter
     */
    public static Leaderboard getLeaderboard() {
        if (leaderboard == null) {
            leaderboard = new Leaderboard();
        }
        return leaderboard;
    }

    public String[] getNames() {
        return names;
    }

    public long[] getScores() {
        return scores;
    }

    public String[] getDates() {
        return dates;
    }

    /**
     * for adding score of each player to the leaderboard
     * @param playerName name of player
     * @param score score of player
     * @param date date player played game
     *
     */
    public void addScore(String playerName, long score, String date) {
        if (size < 5) {
            scores[size] = score;
            names[size] = playerName;
            dates[size] = date;

            for (int i = size; i > 0; i--) {
                if (scores[i - 1] < score) {
                    long tempScore = scores[i - 1];
                    String tempName = names[i-1];
                    String tempDate = dates[i - 1];

                    scores[i-1] = score;
                    names[i-1] = playerName;
                    dates[i - 1] = date;
                    scores[i] = tempScore;
                    names[i] = tempName;
                    dates[i] = tempDate;
                } else {
                    break;
                }
            }
            lowest = scores[size];
            size++;
        } else if (size >= 5) {
            if (score > lowest) {
                scores[4] = score;
                names[4] = playerName;
                dates[4] = date;
                for (int i = 4; i > 0; i--) {
                    if (scores[i - 1] < score) {
                        long tempScore = scores[i - 1];
                        String tempName = names[i-1];
                        String tempDate = dates[i - 1];

                        scores[i-1] = score;
                        names[i-1] = playerName;
                        dates[i - 1] = date;
                        scores[i] = tempScore;
                        names[i] = tempName;
                        dates[i] = tempDate;
                    } else {
                        break;
                    }
                }
                lowest = scores[4];
            }
        }
    }

}
