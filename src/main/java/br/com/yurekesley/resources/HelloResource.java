package br.com.yurekesley.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello Jersey";
	}

	@GET
	@Path("soma/{a}/{b}")
	@Produces(MediaType.TEXT_PLAIN)
	public String soma(@PathParam("a") int a, @PathParam("b") int b) {
		return String.valueOf(a + b);
	}

	@PUT
	@Path("/enviar")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String criaRegistroCorpo(String registro) {

		return "Registro: \''" + registro + "\'' criado com sucesso!";
	}

	@POST
	@Path("enviar")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String atualizaRegistroCorpo(String registro) {
		return "Registro: \''" + registro + "\'' atualizado com sucesso!";
	}
}