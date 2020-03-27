package java3_27_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Card{
    public  String rand;//扑克牌的数值
    public  String suit;//扑克牌的花色

    public Card(String rand,String suit){
        this.suit=suit;
        this.rand=rand;
    }

    @Override
    public String toString() {
        return String.format("[%s %s]",suit,rand);
    }
}
public class CardDemo {
    public static final String[] SUITS={"♣","♥","♠","♦"};
    public static void main(String[] args) {
        List<Card> deck=buyDeck();
        //打印一副新的扑克牌
        System.out.println(buyDeck());
        //将新的扑克牌打乱
        Collections.shuffle(deck);
        System.out.println("打乱的扑克牌");
        System.out.println(deck);
        //三个人在打扑克牌
        List<List<Card>> plays=new ArrayList<>();
        //创建三个人
        plays.add(new ArrayList<>());
        plays.add(new ArrayList<>());
        plays.add(new ArrayList<>());
        //三个人在打扑克牌,每个人手上各有三张牌
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                List<Card> play=plays.get(j);
                Card card=deck.remove(0);
                play.add(card);
            }

        }
        //获取三个玩家手中的牌
        for(int i=0;i<3;i++){
            System.out.println("第"+i+"玩家:"+plays.get(i));
        }

    }
    //创建一副新的扑克牌
    private static List<Card> buyDeck(){
        List<Card> cards=new ArrayList<>(52);
        for(int i=0;i<4;i++){
            for(int j=2;j<=10;j++){
                String suit=SUITS[i];
                String rand=j+"";
                Card card=new Card(SUITS[i],j+"");
                cards.add(card);


            }
            cards.add(new Card(SUITS[i],"A"));
            cards.add(new Card(SUITS[i],"J"));
            cards.add(new Card(SUITS[i],"Q"));
            cards.add(new Card(SUITS[i],"K"));
        }
        return cards;
    }

}
