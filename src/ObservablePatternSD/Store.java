package ObservablePatternSD;

import ObservablePatternSD.Observable.IphoneObservableImpl;
import ObservablePatternSD.Observable.StocksObservable;
import ObservablePatternSD.Observer.EmailAlertObserverImpl;
import ObservablePatternSD.Observer.MobileAlertObservableImpl;
import ObservablePatternSD.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args){

        StocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com",iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@yahoo.com",iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObservableImpl("mn@redddit.com",iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);

    }
}
