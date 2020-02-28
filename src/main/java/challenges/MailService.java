package challenges;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println(user.getName() + ", the order has been placed successfully, thank you.");
    }
}
