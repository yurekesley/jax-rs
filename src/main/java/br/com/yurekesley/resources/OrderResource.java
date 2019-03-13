package br.com.yurekesley.resources;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.yurekesley.model.Order;


@Path("/")
public class OrderResource {

    @Path("/orders")
    @Produces(MediaType.APPLICATION_XML)
    @GET
    public Response handle() {
        List<Order> orders = getOrders();
        Response r = Response.ok(orders)
                             .header("someHeader", "someHeaderValue")
                             .build();
        return r;
    }

    public List<Order> getOrders() {
        Order o1 = new Order(1, new BigDecimal(15));
        Order o2 = new Order(2, new BigDecimal(20));
        return Arrays.asList(o1, o2);
    }

    @Path("/orders2")
    @Produces(MediaType.APPLICATION_XML)
    @GET
    public Response handle2() {
        List<Order> orders = getOrders();
        GenericEntity<List<Order>> genericEntity = new GenericEntity<List<Order>>(orders) {
        };//needs empty body to preserve generic type
        Response r = Response.ok(genericEntity)
                             .header("someHeader", "someHeaderValue")
                             .build();
        return r;
    }


}