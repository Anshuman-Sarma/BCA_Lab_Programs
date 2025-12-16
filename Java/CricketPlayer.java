// AnshumanSarma_WAP to calculate and sort cricket players based on batting average


class CricketPlayer {
    String name;
    int no_of_innings;
    int no_times_notout;
    int total_runs;
    double bat_avg;

    public CricketPlayer(String name, int no_of_innings, int no_times_notout, int total_runs) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_times_notout = no_times_notout;
        this.total_runs = total_runs;
        this.bat_avg = 0.0;
    }

    public void calculateBattingAverage() {
        if (no_of_innings - no_times_notout > 0) {
            this.bat_avg = (double) total_runs / (no_of_innings - no_times_notout);
        } else {
            this.bat_avg = total_runs;
        }
    }

    public static void sortPlayers(CricketPlayer[] players) {
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = i + 1; j < players.length; j++) {
                if (players[i].bat_avg < players[j].bat_avg) {
                    CricketPlayer temp = players[i];
                    players[i] = players[j];
                    players[j] = temp;
                }
            }
        }
    }

    public void displayPlayerDetails() {
        System.out.println("Name: " + name + ", Batting Average: " + bat_avg);
    }

    public static void main(String[] args) {
        CricketPlayer[] players = new CricketPlayer[3];
        players[0] = new CricketPlayer("Player1", 10, 2, 500);
        players[1] = new CricketPlayer("Player2", 8, 0, 300);
        players[2] = new CricketPlayer("Player3", 12, 5, 600);

        for (CricketPlayer player : players) {
            player.calculateBattingAverage();
        }

        sortPlayers(players);

        System.out.println("Players sorted by batting average:");
        for (CricketPlayer player : players) {
            player.displayPlayerDetails();
        }
    }
}
