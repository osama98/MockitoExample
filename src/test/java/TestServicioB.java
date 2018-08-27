import org.junit.Assert;
import org.junit.Test;

import com.arquitecturajava.servicios.ServicioA;
import com.arquitecturajava.servicios.ServicioAImpl;
import com.arquitecturajava.servicios.ServicioB;
import com.arquitecturajava.servicios.ServicioBImpl;

public class TestServicioB {

	@Test
	public void testMultiplicacion() {
		  
		 ServicioB servicioB= new ServicioBImpl();
		 Assert.assertEquals(servicioB.multiplicar(2, 3),6);
		  
	}
	
	@Test
	 public void testmultiplicarSumar() {
	  
	 ServicioA servicioA=new ServicioAImpl();
	  
	 ServicioB servicioB= new ServicioBImpl();
	  
	  
	 servicioB.setServicioA(servicioA);
	 Assert.assertEquals(servicioB.multiplicarSumar(2, 3, 2),10);
	  
	 }

}
