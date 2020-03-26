package java3_26_1;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;

class Card{
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "[" +
                 rank + '\'' +
                  suit + '\'' +
                "]";
    }
}


public class CardDemo {
    //创建扑克牌的四种花色
    public static final String[] SUITS={"♣","♥","♠","♦"};
//一副新的扑克牌
    public static List<Card> buyDeck(){
        List<Card> deck=new ArrayList<>();
        for(int i=0;i<4;i++){
            for(int j=2;j<=10;j++){
                Card card=new Card(SUITS[i],j+"");
                deck.add(card);
            }
            deck.add(new Card (SUITS[i],"A"));
            deck.add(new Card(SUITS[i],"J"));
            deck.add(new Card(SUITS[i],"Q"));
            deck.add(new Card(SUITS[i],"K"));
        }
        return deck;
    }



    public static void main(String[] args) {
        List<Card> deck=buyDeck();
        //创建一副新的扑克牌
        System.out.println(buyDeck());
        //将新的扑克牌随机打乱
        shuffle(deck);
        System.out.println(deck);
        //三个人在打牌每个人按照顺序各自那五张牌
        List<List<Card>> hands=new ArrayList<>();
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                hands.get(j).add(deck.remove(0));
            }
        }
        System.out.println("剩余的牌");
        System.out.println(deck);
        System.out.println("A的牌");
        System.out.println(hands.get(0));
        System.out.println("B的牌:");
        System.out.println(hands.get(1));
        System.out.println("C的牌");
        System.out.println(hands.get(2));
    }
}
