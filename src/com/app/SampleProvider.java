package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/msg")
public class SampleProvider {
@GET
public String getMsg(
	@MatrixParam("sid") int id,
	@MatrixParam("sname") String  name,
	@MatrixParam("sfee") double fee){
	return "Hello:"+id+","+name+","+fee;
}
}
