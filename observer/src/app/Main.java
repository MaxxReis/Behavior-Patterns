package app;

import interfaces.IObserver;
import interfaces.Subject;
import java.util.ArrayList;
import java.util.List;
import observer.Observer1;
import observer.Observer2;
import subject.Music;
import subject.News;

public class Main {
    public static void main(String[] args) {
        IObserver observer1 = new Observer1();
        IObserver observer2 = new Observer2();
        Subject bbcNews = new News();
        Subject mtv = new Music();
        List<IObserver> observerList1 = new ArrayList<IObserver>();
        List<IObserver> observerList2 = new ArrayList<IObserver>();
        
        //observerList1
        observerList1.add(observer1);
        observerList1.add(observer2);
        bbcNews.addSubject("BBC", observerList1);
        
        //observerList2
        observerList2.add(observer2);
        mtv.addSubject("MTV", observerList2);
        
        try {
            System.out.println("News Notification:");
            bbcNews.setState("News about trafic on BBC channel");
            System.out.println("Notification --> " + bbcNews.getState());
            System.out.println();
            System.out.println("Music notification:");
            mtv.setState("News Songs on your channel");
            System.out.println("Notification --> " + mtv.getState());
            System.out.println();
        } catch (Exception ex) {
            System.out.println("Fail to set state: " + ex.getMessage());
        }
    }
}
