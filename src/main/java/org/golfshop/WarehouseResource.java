package org.golfshop;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.golfshop.entities.Category;
import org.golfshop.entities.ImmutableObjectProduct;
import org.golfshop.interceptor.Log;
import org.golfshop.service.IWarehouse;

import java.util.Collections;
import java.util.List;


@Path("")
@Log
public class WarehouseResource {

    private IWarehouse iWarehouse;

    public WarehouseResource(){}

    @Inject
    public WarehouseResource(IWarehouse iWarehouse){
        this.iWarehouse = iWarehouse;
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/dba/addmock")
    public String addMockProducts() {
        iWarehouse.addMockDateToWarehouse();
        return "The mock products is added.";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/products")
    public List<ImmutableObjectProduct> getAllProducts() {
       return iWarehouse.getAllProduct();

    }

  @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/products/{id}")
    public List<ImmutableObjectProduct> getProductById(@PathParam("id") int id) {
        return iWarehouse.getProductById(id);

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/products/category/{cg}")
    public List<ImmutableObjectProduct> getProductsByCategory(@PathParam("cg") String cg) {
        try {
            Category category = Category.valueOf(cg.toUpperCase());
            return iWarehouse.getProductByCategorySortAfterName(category);
        } catch (IllegalArgumentException e) {
            return Collections.emptyList();
        }
    }



}