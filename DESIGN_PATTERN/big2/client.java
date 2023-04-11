package big2;


public class client {
    public static void main(String[] args) {

        Platform platform=new Platform();



        while(true){
            System.out.println("Login: ");
            OnlineStore onlineStore=new ConcreteOnlineStore(platform.getMediator());
            onlineStore.purchase();
        }


    }
}