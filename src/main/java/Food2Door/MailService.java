package Food2Door;

public class MailService implements InformationService {
    @Override
    public void inform(User user, Order order) {
                System.out.println(user.getName() + ", the order: " + order.getProduct()+ "\n" + "price: " + order.getPrice()
                        + "\n" + "quantity: " + order.getQuantity() + "\n" + " has been placed successfully, thank you.");
            }
        }

