package challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService,
                          OrderService orderService,
                          OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isSold = OrderService.sold(orderRequest.getUser(),
                orderRequest.getOrderTime(),
                orderRequest.getProduct(),
                orderRequest.getQuantity());
        if(isSold) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrderTime(), orderRequest.getProduct(), orderRequest.getQuantity());
            return new OrderDTO(orderRequest.getUser(), orderRequest.getOrderTime(), orderRequest.getProduct(), orderRequest.getQuantity(), true);

        } else {
            return new OrderDTO(orderRequest.getUser(), orderRequest.getOrderTime(), orderRequest.getProduct(), orderRequest.getQuantity(), false);

        }
    }
}


