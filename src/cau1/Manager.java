package cau1;

import java.util.*;

public class Manager {
    List<Double> list = new ArrayList<>();
    public void addScore(double score) {
        list.add(score);
    }
    public void findMaxMin(){
        double min=list.get(0);
        double max=list.get(0);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i)>max){
                max=list.get(i);
            }if(list.get(i)<min){
                min=list.get(i);
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
    public void sumAvg(){
        double avg=0;
        double sum=0;
        for(int i = 0; i < list.size(); i++){
            sum+=list.get(i);
        }
        avg=sum/list.size();
        System.out.println("Average: "+avg);
        System.out.println("Sum: "+sum);
    }

  public void unique(){
      Set<Double> set = new TreeSet<>(list);
      System.out.println("Unique (Asc): "+set);
  }
  public void countExcellent(){
        int count=0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)>=8.0){
                count++;
            }
        }
      System.out.println("Excellent (>=8.0) : "+count);
  }

    @Override
    public String toString() {
        return "Manager{" +
                "list=" + list +
                '}';
    }
}
