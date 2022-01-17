public class Card {
    private String suit;
    private int rank;

    public Card() {
        // ジョーカー
        this("", -1);
    }

    public Card(String suit, int rank) {
        setSuit(suit);
        setRank(rank);
    }
    
    public String getSuit() {
        return this.suit;
    }

    public void setSuit(String suit) {
        switch (suit) {
            case "スペード":
            case "ハート":
            case "ダイヤ":
            case "クラブ":
            case "":
                this.suit = suit;
                return;

            default:
        }
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        if(rank < 1 || rank > 13) {
            this.rank = -1;
        } else {
            this.rank = rank;
        }
    }

    @Override
    public String toString() {
        String str = this.suit;
        switch (this.rank) {
            case 1:
                str += "A";
                break;

            case 11:
                str += "J";
                break;

            case 12:
                str += "Q";
                break;

            case 13:
                str += "K";
                break;

            default:
                str += this.rank;
        }

        return str;
    }
}
