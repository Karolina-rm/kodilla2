package Food2Door;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService,
                          OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = OrderService.order(orderRequest.getUser(), orderRequest.getOrder(), orderRequest.getOrderDate(), orderRequest.getCompanyName());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getOrder());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrder(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(), true);

        } else {
            return new OrderDto(orderRequest.getUser(), false);

        }
    }
}
