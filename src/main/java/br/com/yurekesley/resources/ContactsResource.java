package br.com.yurekesley.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.yurekesley.service.ContactService;

@Path("/contacts")
public class ContactsResource {

	@Inject
	private ContactService service;
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getContacts() {
		return Response.ok(service.getAll()).build();
	}

	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getContact(@PathParam("id") int id) {
		return Response.ok(this.service.getById(id)).build();
	}
}