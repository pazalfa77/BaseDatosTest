package tata.bd.base;

import java.util.ArrayList;
import java.util.Iterator;

import tata.bd.dato.Dato;

public class BaseDeDatos {
       ArrayList<Dato> base;
       
       public BaseDeDatos() {
    	   this.base=new ArrayList<Dato>();
       }
       
       
       public boolean agregar(Dato nuevo) {
    	    return this.base.add(nuevo);
       }
       
       
       public boolean delete(String id) {
   		Iterator<Dato> ite = this.base.iterator(); 
   		while(ite.hasNext()){
   			 ite.next().getId().equalsIgnoreCase(id);
   			  	ite.remove();
   				return true;}
   			              
   		        return false;}
   	                                  
       
       public ArrayList<Dato> listar(){
    	   return this.base;
       }
       
       
       public boolean modificar(Dato d) {
    	   Iterator<Dato> ite=this.base.iterator();
    	   while(ite.hasNext()) {
    		   Dato temp = ite.next();
    		   if(temp.getId().equalsIgnoreCase(d.getId())) {
    		    	temp.setData(d.getData());	   
    		   	    return true;}
    	   }
    	   return false;}   
    	
     
       
}
