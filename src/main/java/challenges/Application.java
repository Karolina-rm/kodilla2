package challenges;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new SandboxOrder(), new SandboxRepository());
        orderProcessor.process(orderRequest);
    }
}