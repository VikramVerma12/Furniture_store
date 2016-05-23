package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_DATA")
public class Data implements Serializable
{
	
	         
	private static final long serialVersionUID = 1L;
		@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name = "PRODUCT_ID")
	    private int Product_Id;
	  @Column(name = "PRODUCT_GROUP_Name")
	    private String  Group_Name;	
	    @Column(name = "PRODUCT_NAME")
	    private String Name;
	     @Column(name = "PRODUCT_PRICE")
	    private int Price;
	   @Column(name = "PRODUCT_QTY")
	    private int  Qty;
	   @Column(name = "IMAGE")
	    private String Image_path;
	     
	   /* Data(String Group_Name ,int Product_Id ,String Name , int Price , int Qty , String Image_path){
			this.Group_Name=Group_Name;
			this.Name=Name;
			this.Price=Price;
			this.Product_Id=Product_Id;
			this.Qty=Qty;
			this.Image_path=Image_path;
		}*/
	  
	     public Data() {
		// TODO Auto-generated constructor stub
	}

		public int getProduct_Id() {
			return Product_Id;
		}

		public void setProduct_Id(int product_Id) {
			Product_Id = product_Id;
		}

		public String getGroup_Name() {
			return Group_Name;
		}

		public void setGroup_Name(String group_Name) {
			Group_Name = group_Name;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getPrice() {
			return Price;
		}

		public void setPrice(int price) {
			Price = price;
		}

		public int getQty() {
			return Qty;
		}

		public void setQty(int qty) {
			Qty = qty;
		}

		public String getImage_path() {
			return Image_path;
		}

		public void setImage_path(String image_path) {
			Image_path = image_path;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

			
	/*public String toString()
	{
		//return "{"+"Group_Name:"+"\""+ this.Group_Name+"\""+","+"Product_Id:"+this.Product_Id+","+"Name:"+"\""+this.Name+"\""+","+"Price:"+this.Price+","+"Qty:"+this.Qty+","+"Image:"+"\""+this.Image_path+"\""+"}";
		 return this.Product_Id+this.Group_Name+this.Name+this.Qty+this.Image_path;
	}*/
	// { Group_Name: "Guitar", Product_Id: "001",Name:"Long Guitar " ,Price:"5000",Qty:"20",Image:"resources/images/image1.jpg" },
}

