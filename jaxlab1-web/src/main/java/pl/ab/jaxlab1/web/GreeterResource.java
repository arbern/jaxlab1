package pl.ab.jaxlab1.web;

import pl.ab.jaxlab1.Greeter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greetings")
public class GreeterResource {
    private int i;
    private Greeter greeter = new Greeter();

    public GreeterResource() {
        System.out.println("GreeterResource constructor called");
    }

    public GreeterResource(int i) {
        System.out.println("GreeterResource constructor called with param:" + i);
        this.i = i;
    }

    @GET
    public String greeting() {
        return greeter.hello();
    }
}
