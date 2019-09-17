package ru.bia.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "uuid")
	private java.lang.String id;
	@org.kie.api.definition.type.Label(value = "Заказанные продукты")
	private java.util.List<ru.bia.model.Product> products;

	public Order() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.util.List<ru.bia.model.Product> getProducts() {
		return this.products;
	}

	public void setProducts(java.util.List<ru.bia.model.Product> products) {
		this.products = products;
	}

	public Order(java.lang.String id,
			java.util.List<ru.bia.model.Product> products) {
		this.id = id;
		this.products = products;
	}

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products != null ? Arrays.toString(products.toArray()) : "[]" +
                '}';
    }
}