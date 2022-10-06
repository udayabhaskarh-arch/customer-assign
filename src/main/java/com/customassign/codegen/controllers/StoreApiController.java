package com.customassign.codegen.controllers;

import com.customassign.codegen.model.Order;
import com.customassign.codegen.service.OrderService;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

import javax.validation.Valid;
 
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-04T16:23:50.827765800+05:30[Asia/Calcutta]")

@Controller
@RequestMapping("${openapi.swaggerStoreOpenAPI30.base-path:}")
public class StoreApiController implements StoreApi {

    private final NativeWebRequest request;

	@Autowired
    private OrderService orderService;

    @org.springframework.beans.factory.annotation.Autowired
    public StoreApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }


    public ResponseEntity<Order> getOrderById(Long orderId){
        Order order =  orderService.getOrderById(orderId);
        return new ResponseEntity<Order>(order, HttpStatus.OK);
    }

     public  ResponseEntity<Order> placeOrder( @RequestBody(required = false) Order requestOrder){
         orderService.saveOrder(requestOrder);
        return new ResponseEntity<Order>(requestOrder, HttpStatus.OK);
     }

     public ResponseEntity<Void> deleteOrder(@ApiParam(value = "ID of the order that needs to be deleted",required=true)
      @PathVariable("orderId") Long orderId) {
        orderService.deleteOrder(orderId);
        System.out.println("Deleted the record successfully");
        return new ResponseEntity<>(HttpStatus.OK);
     }


     public ResponseEntity<Order> updateOrder(@ApiParam(value = "ID of order that needs to be fetched",required=true) 
     @PathVariable("orderId") Long orderId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Order order) {
        Order response = orderService.updateOrder(orderId,order);
        return  new ResponseEntity<Order>(response,HttpStatus.OK);
     }
}
