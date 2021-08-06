package test.BKD07;

public class Product {
	  protected String idProduct;
	  protected String nameProduct;
	  protected float price;
	  protected float tax;
	  
	  
	  
	public Product(String idProduct, String nameProduct, float price, float tax) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.price = price;
		this.tax = tax;
	}
	
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Product [ID Product =" + idProduct + ", Name Product=" + nameProduct + ", Price=" + price + ", Tax=" + tax
				+ "]";
	}
}
	  

