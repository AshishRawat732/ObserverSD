package ObservablePatternSD.Observable;

import ObservablePatternSD.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();

    public void setStockCount(int newStockAdd);

    public int getStockCount();

}
