package hangman;
public class Players implements Comparable<Players>  {
    String name;
    int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Players(String name, int score) {
        this.name = name;
        this.score = score;
    }


    @Override
    public int compareTo(Players otherPlayers) {
        return Integer.compare(otherPlayers.score, this.score);
    } 
} 