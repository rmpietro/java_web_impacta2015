package controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
@Path("home")
public class HomeController {
	
	@Inject
	private Result result;
	
	@Get("impacta/{id}")
	public void hello(String id) {
		result.include("mensagem", "Mensagem encaminhada por meio do controller! Id: " + id);
	}
	
}
