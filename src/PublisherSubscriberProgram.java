import java.util.*;
class Publisher {
    int ID;
    String publisherName;
    Queue queue = new PriorityQueue();
    Publisher(){};
    Publisher(int ID, String publisherName){
        this.ID = ID;
        this.publisherName = publisherName;
    }
    void addContent(String msg){
        queue.add(msg);
    }

    Queue getContent(){
        return queue;
    }

//    void addSubscribers(Subscriber subscriber){
//        subscribers.add(subscriber);
//    }
//    void showSubscribers(){
//        System.out.println(subscribers);
//    }
}

class Subscriber extends Publisher{

    public void showNotification(Queue q){
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }

}

public class PublisherSubscriberProgram {
    public static void main(String[] args) {
        Publisher publisher = new Publisher(1,"Channel1");
        publisher.addContent("Content1");
        publisher.addContent("Content2");

        Subscriber s1 = new Subscriber();
        s1.showNotification(publisher.getContent());




//        Subscriber sub1 = new Subscriber(1,"Subscriber1");
//        Subscriber sub2 = new Subscriber(2,"Subscriber2");
//
//        publisher.addSubscribers(sub1);
//        publisher.addSubscribers(sub2);
//        publisher.showSubscribers();

    }
}
