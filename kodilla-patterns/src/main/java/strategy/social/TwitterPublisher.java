package strategy.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "We use Twitter!";
    }
}
