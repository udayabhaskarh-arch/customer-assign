/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.customassign.codegen.controllers;

import com.customassign.codegen.model.Order;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
 

import javax.validation.Valid;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-04T16:23:50.827765800+05:30[Asia/Calcutta]")

@Validated
@Api(value = "store", description = "the store API")
public interface StoreApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /store/order/{orderId} : Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted (required)
     * @return Invalid ID supplied (status code 400)
     *         or Order not found (status code 404)
     */
    @ApiOperation(value = "Delete purchase order by ID", nickname = "deleteOrder", notes = "For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors", tags={ "store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Order not found") })
    @RequestMapping(value = "/store/order/{orderId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteOrder(@ApiParam(value = "ID of the order that needs to be deleted",required=true) @PathVariable("orderId") Long orderId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /store/update-order/{orderId} : Returns order by status
     * Returns a map of status codes to quantities
     *
     * @param orderId ID of order that needs to be fetched (required)
     * @param order  (optional)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Returns order by status", nickname = "updateOrder", notes = "Returns a map of status codes to quantities", response = Order.class, tags={ "store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class) })
    @RequestMapping(value = "/store/update-order/{orderId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Order> updateOrder(@ApiParam(value = "ID of order that needs to be fetched",required=true) @PathVariable("orderId") Long orderId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Order order) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"petId\" : 198772, \"quantity\" : 7, \"id\" : 10, \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\", \"complete\" : true, \"status\" : \"approved\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /store/order/{orderId} : Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions.
     *
     * @param orderId ID of order that needs to be fetched (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Order not found (status code 404)
     */
    @ApiOperation(value = "Find purchase order by ID", nickname = "getOrderById", notes = "For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions.", response = Order.class, tags={ "store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Order not found") })
    @RequestMapping(value = "/store/order/{orderId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Order> getOrderById(@ApiParam(value = "ID of order that needs to be fetched",required=true) @PathVariable("orderId") Long orderId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"petId\" : 198772, \"quantity\" : 7, \"id\" : 10, \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\", \"complete\" : true, \"status\" : \"approved\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<order> <id>10</id> <petId>198772</petId> <quantity>7</quantity> <shipDate>2000-01-23T04:56:07.000Z</shipDate> <status>approved</status> <complete>true</complete> </order>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /store/order : Place an order for a pet
     * Place a new order in the store
     *
     * @param order  (optional)
     * @return successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @ApiOperation(value = "Place an order for a pet", nickname = "placeOrder", notes = "Place a new order in the store", response = Order.class, tags={ "store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/store/order",
        produces = { "application/json" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    default ResponseEntity<Order> placeOrder(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Order order) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"petId\" : 198772, \"quantity\" : 7, \"id\" : 10, \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\", \"complete\" : true, \"status\" : \"approved\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}