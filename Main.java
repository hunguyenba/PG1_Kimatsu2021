public class Main {
    public static final int DECK_MAX = (13 * 4) + (Joker.IS_EXTENDED ? 2 : 0);

    public static void main(String[] args) {
        Card[] deck = new Card[DECK_MAX];
        
        // deckにCardクラスのインスタンスを格納するときは、ここに書いてください。



        play(deck);
    }

    // 各種メソッドを実際に操作するための処理
    public static void play(Card[] deck) {
        Card[] hands = new Card[deck.length];

        System.out.println("【山札：" + count(deck) + "】");
        System.out.println("【手札：" + count(hands) + "】");

        
        System.out.println("\n--------------------------------------");
        System.out.println("山札を全てのカードを引きます。\n");
        while(true) {
            boolean hasDrawTarget = draw(hands, deck);
            if (!hasDrawTarget) { break; }
        }

        System.out.println("【山札：" + count(deck) + "】");
        System.out.println("【手札：" + count(hands) + "】");
        sort(hands);
        showAll(hands);

        System.out.println("\n--------------------------------------");
        System.out.println("山札を作り直します。\n");
        init(deck);

        System.out.println("【山札：" + count(deck) + "】");
        shuffle(deck);
        showAll(deck);
    }

    public static int count(Card[] cards) {
        // ここに「引数にしたCardの配列の要素のうちnullではない要素の個数を返す」コードを書いてください。

        

        return cards.length;
    }

    public static void init(Card[] deck) {
        // 以下のコードを「多重ループを使い効率的な処理」に変えてください。
        deck[0] = new Card("スペード", 1);
        deck[1] = new Card("スペード", 2);
        deck[2] = new Card("スペード", 3);
        deck[3] = new Card("スペード", 4);
        deck[4] = new Card("スペード", 5);
        deck[5] = new Card("スペード", 6);
        deck[6] = new Card("スペード", 7);
        deck[7] = new Card("スペード", 8);
        deck[8] = new Card("スペード", 9);
        deck[9] = new Card("スペード", 10);
        deck[10] = new Card("スペード", 11);
        deck[11] = new Card("スペード", 12);
        deck[12] = new Card("スペード", 13);
        deck[13] = new Card("ハート", 1);
        deck[14] = new Card("ハート", 2);
        deck[15] = new Card("ハート", 3);
        deck[16] = new Card("ハート", 4);
        deck[17] = new Card("ハート", 5);
        deck[18] = new Card("ハート", 6);
        deck[19] = new Card("ハート", 7);
        deck[20] = new Card("ハート", 8);
        deck[21] = new Card("ハート", 9);
        deck[22] = new Card("ハート", 10);
        deck[23] = new Card("ハート", 11);
        deck[24] = new Card("ハート", 12);
        deck[25] = new Card("ハート", 13);
        deck[26] = new Card("ダイヤ", 1);
        deck[27] = new Card("ダイヤ", 2);
        deck[28] = new Card("ダイヤ", 3);
        deck[29] = new Card("ダイヤ", 4);
        deck[30] = new Card("ダイヤ", 5);
        deck[31] = new Card("ダイヤ", 6);
        deck[32] = new Card("ダイヤ", 7);
        deck[33] = new Card("ダイヤ", 8);
        deck[34] = new Card("ダイヤ", 9);
        deck[35] = new Card("ダイヤ", 10);
        deck[36] = new Card("ダイヤ", 11);
        deck[37] = new Card("ダイヤ", 12);
        deck[38] = new Card("ダイヤ", 13);
        deck[39] = new Card("クラブ", 1);
        deck[40] = new Card("クラブ", 2);
        deck[41] = new Card("クラブ", 3);
        deck[42] = new Card("クラブ", 4);
        deck[43] = new Card("クラブ", 5);
        deck[44] = new Card("クラブ", 6);
        deck[45] = new Card("クラブ", 7);
        deck[46] = new Card("クラブ", 8);
        deck[47] = new Card("クラブ", 9);
        deck[48] = new Card("クラブ", 10);
        deck[49] = new Card("クラブ", 11);
        deck[50] = new Card("クラブ", 12);
        deck[51] = new Card("クラブ", 13);

        if (Joker.IS_EXTENDED) {
            deck[52] = (Card)(Object)new Joker();
            deck[53] = (Card)(Object)new Joker();
        }
    }

    public static void shuffle(Card[] cards) {
        // ここに「引数にしたCardの配列の並び順をバラバラにする」コードを書いてください。


    }

    public static void sort(Card[] cards) {
        // ここに「引数にしたCardの配列の並び順を整える」コードを書いてください。

        
    }

    // 引数にしたCardの配列の全てを表示するメソッド
    public static void showAll(Card[] cards) {
        int count = 0;
        for (Card card : cards) {
            if (card == null) { break; }
            System.out.printf("%-10s", card);
            if(++count % 8 == 0) { System.out.println(); }
        }
        System.out.println();
    }

    // 引数にしたdeckの先頭をhandsの最後に移動するメソッド
    public static boolean draw(Card[] hands, Card[] deck) {
        if (deck[0] == null) { return false; }
        
        int handsIndex;
        for (handsIndex = 0; handsIndex < hands.length; handsIndex++) {
            if(hands[handsIndex] == null) { break; }
        }
        if (handsIndex == hands.length) { return false; }

        Card target = deck[0];
        for (int i = 1; i < deck.length; i++) {
            deck[i - 1] = deck[i];
        }

        hands[handsIndex] = target;
        return true;
    }

}