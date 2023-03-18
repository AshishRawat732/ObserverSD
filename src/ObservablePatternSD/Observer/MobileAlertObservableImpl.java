package ObservablePatternSD.Observer;

import ObservablePatternSD.Observable.StocksObservable;

public class MobileAlertObservableImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public  MobileAlertObservableImpl(String emailID, StocksObservable observable){
        this.userName = emailID;
        this.observable = observable;
    }

    private  void  sendMsgOnMobile(String userName,String msg){
        System.out.println("Msg sent to"+ userName);
    }

    @Override
    public void update() {
       sendMsgOnMobile(userName,"Product is in stock hurry up");
    }
}
