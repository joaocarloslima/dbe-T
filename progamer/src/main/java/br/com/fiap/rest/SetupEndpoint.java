package br.com.fiap.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.dao.SetupDAO;
import br.com.fiap.model.Setup;

@Path("setups")
@Produces(MediaType.APPLICATION_JSON)
public class SetupEndpoint {
	
	SetupDAO dao = new SetupDAO();
	
	@GET
	public List<Setup> index() {
		return dao.getAll();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Setup setup) {
		if (setup == null) {
			return Response
					.status(Response.Status.BAD_REQUEST)
					.build();
		}
		try {
			dao.save(setup);
		} catch (Exception e) {
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.build();
		}
		return Response
				.status(Response.Status.CREATED)
				.entity(setup)
				.build();
	}
	
	@GET
	@Path("{id}")
	public Response show(@PathParam("id") Long id) {
		Setup setup = dao.findById(id);
		if (setup == null) {
			return Response
					.status(Response.Status.NOT_FOUND)
					.build();

		}
		return Response
					.status(Response.Status.OK)
					.entity(setup)
					.build();
	}
	
	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") Long id, Setup setup ) {
		setup.setId(id);
		dao.update(setup);
		return Response
				.status(Response.Status.OK)
				.entity(setup)
				.build();
	}
	
	
	
	
	
	
	
	

}
