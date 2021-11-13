package com.pineapple.pineapplemarket.Controller;
import com.pineapple.Clases.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/product")
@CrossOrigin(origins = "http://localhost")
public class productRest {

    @Autowired
    private IProduct iproduct;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Product crearAlumno(@RequestBody Product product) {
        return iproduct.save(product);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Iterable<Product> obtenerTodos() {
        return iproduct.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean eliminar(@PathVariable() Long id) {
        iproduct.deleteById(id);
        return true;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Product editar(@RequestBody Product product) {
        return iproduct.save(product);
    }
}
