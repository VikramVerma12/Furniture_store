package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import model.Data;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class firstcontroller {
	@RequestMapping("/")
	public ModelAndView index1()
	{	
	ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	@RequestMapping("index")
	public ModelAndView index()
	{	
	ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/contactus")
	public ModelAndView contactus()
	{
	ModelAndView mv = new ModelAndView("contactus");
		return mv;
	}
	@RequestMapping("/register")
	public ModelAndView register()
	{
	ModelAndView mv = new ModelAndView("register");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{
	ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	@RequestMapping("/aboutus")
	public ModelAndView aboutus(){
	ModelAndView mv = new ModelAndView("aboutus");
		return mv;
	}
	@RequestMapping("/product")
	public ModelAndView product(){
		//hybernatetest h= new hybernatetest();
	ModelAndView mv = new ModelAndView("product");
     //mv.addObject("data",h.list_data());
		return mv;
	}

	@RequestMapping(value = "/product_registration", method = RequestMethod.GET)
	   public ModelAndView Data() {
	      return new ModelAndView("product_registration", "command", new Data());	      
	   }
	

	@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	   public String addproduct(@ModelAttribute("SpringWeb")Data data, ModelMap model) {
	      model.addAttribute("Product_Id",data.getProduct_Id());
	      model.addAttribute("Group_Name", data.getGroup_Name());
	      model.addAttribute("PRODUCT_PRICE", data.getPrice());
	      model.addAttribute("Qty", data.getQty());
	      model.addAttribute("Image_path", data.getImage_path());
	      return "result";
	   }	
}