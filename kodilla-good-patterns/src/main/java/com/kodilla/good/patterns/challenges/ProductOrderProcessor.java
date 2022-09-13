package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(InformationService informationService,
                                 ProductOrderService productOrderService,
                                 ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDTO process(ProductOrderRequest productOrderRequest) {
        boolean isSold = productOrderService.sold(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), productOrderRequest.getQuantity());

        /*System.out.println(productOrderRequest.getUser());
        System.out.println(productOrderRequest.getOrderDate());
        System.out.println(productOrderRequest.getProduct());
        System.out.println(productOrderRequest.getQuantity());

        System.out.println(isSold);*/
        if (isSold) {
            informationService.sendMessage(productOrderRequest.getUser());
            productOrderRepository.prepProductOrder(productOrderRequest.getUser(),
                    productOrderRequest.getOrderDate(),
                    productOrderRequest.getProduct(),
                    productOrderRequest.getQuantity());
        }else{
            System.out.println("Order not possible at this moment");
        }
        return new ProductOrderDTO(productOrderRequest.getUser(),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity(),
                isSold);
    }
}