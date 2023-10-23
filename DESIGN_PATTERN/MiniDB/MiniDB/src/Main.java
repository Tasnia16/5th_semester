public class Main {
    public static void main(String[] args) {
        
        ClientBuilder clientBuilder =new ClientBuilder();
        cli client=clientBuilder.buildCli();
        client.run();
    }
}
