package MD.heap;

import javafx.util.Pair;
import java.util.*;

class ScoreComparator implements Comparator<Pair<Integer,Integer>>{

    @Override
    public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        if(o1.getValue()>o2.getValue())
            return 1;
        else if(o1.getValue()<o2.getValue())
            return -1;
        return 0;
    }
}

public class ScoreBoard {
    Map<Integer,Integer> playerMap; // contains player id and score

    public ScoreBoard(){
        playerMap=new HashMap<>();
    }

    public void addScore(int playerId,int score){
        int latest=playerMap.getOrDefault(playerId,0)+score;
        playerMap.put(playerId,latest);
    }

    public void resetScore(int playerId){
        if(playerMap.get(playerId)!=null)
            playerMap.put(playerId,0);
    }

    public int getScore(int playerId){
        return playerMap.getOrDefault(playerId,0);
    }

    public int[] topKPlayers(int k){
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>(new ScoreComparator());
        int res=0;
        int[] topKPlayers=new int[k];

        Iterator itr=playerMap.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry entry= (Map.Entry) itr.next();
            pq.add(new Pair(entry.getKey(),entry.getValue()));

            if(pq.size()>k)
                pq.poll();
        }

        for(int i=0;i<k;i++)
            topKPlayers[i]=pq.poll().getKey();
        return topKPlayers;
    }

    public int sumOfTopKScores(int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int res=0;
        Iterator itr=playerMap.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry entry= (Map.Entry) itr.next();
            pq.add((Integer) entry.getValue());

            if(pq.size()>k)
                pq.poll();
        }
        int qs=pq.size();
        while (qs>0) {
            res = res + pq.poll().intValue();
            qs--;
        }
        return res;
    }

    public static void main(String[] args) {
        ScoreBoard s=new ScoreBoard();
        s.addScore(1,10);
        s.addScore(2,30);
        s.addScore(3,40);
        s.addScore(1,50);
        s.addScore(4,5);
        System.out.println("sumOfTopKScores "+s.sumOfTopKScores(2));
        System.out.println("topKPlayers "+Arrays.toString(s.topKPlayers(2))); // 1-60 3-40 2-30 4-5
        System.out.println("topKPlayers "+Arrays.toString(s.topKPlayers(3))); // 1-60 3-40 2-30 4-5
        System.out.println("getScore "+s.getScore(1));
        s.resetScore(1);
        System.out.println("sumOfTopKScores "+s.sumOfTopKScores(2));
        System.out.println("getScore "+s.getScore(1));
        System.out.println("getScore "+s.getScore(2));
        System.out.println("getScore "+s.getScore(3));
        System.out.println("getScore "+s.getScore(4));
    }
}
