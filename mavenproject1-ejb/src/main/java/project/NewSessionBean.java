/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class NewSessionBean {

public List<Product>findAll(){
    	List<Product> ListProduct=new ArrayList<Product>();
    	ListProduct.add(new Product("Dinesh",12));
    	ListProduct.add(new Product("Ganesh",14));
    	ListProduct.add(new Product("Raj",16));
    	return ListProduct;
    }
}
