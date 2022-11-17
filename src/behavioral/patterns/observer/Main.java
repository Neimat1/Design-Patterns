package behavioral.patterns.observer;

public class Main {
    public static void  main(String [] args){
        EmailTopic emailTopic = new EmailTopic();

        //observers
        Observer firstObserver = new EmailTopicSubscriber("First Observer");
        Observer secondObserver = new EmailTopicSubscriber("Second Observer");
        Observer thirdObserver = new EmailTopicSubscriber("Third Observer");
        Observer forthObserver = new EmailTopicSubscriber("Forth Observer");

        //register ..
        emailTopic.register(firstObserver);
        emailTopic.register(secondObserver);
        emailTopic.register(thirdObserver);
        emailTopic.register(forthObserver);

        //Attaching observer to subject
        firstObserver.setSubject(emailTopic);
        secondObserver.setSubject(emailTopic);
        thirdObserver.setSubject(emailTopic);
        forthObserver.setSubject(emailTopic);

        //check for updates
        firstObserver.update();

        //provider / subject
        emailTopic.postMessage("Hello subscribers");

        emailTopic.unRegister(secondObserver);
        //provider / subject
        emailTopic.postMessage("Hello subscribers again");
    }
}
