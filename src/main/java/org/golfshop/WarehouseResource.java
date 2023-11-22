package org.golfshop;

import org.golfshop.service.IWarehouse;
import org.golfshop.service.Warehouse;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;


@Path("/hello-world")
public class WarehouseResource {


    private IWarehouse iWarehouse;

    public WarehouseResource(){}

    @Inject
    public WarehouseResource(IWarehouse iWarehouse){
        this.iWarehouse = iWarehouse;
    }

    @GET
    @Produces("text/plain")
    public String hello() {
      return "Hello, World!";

    }


}