package strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "We use Snapchat!";
    }
}
