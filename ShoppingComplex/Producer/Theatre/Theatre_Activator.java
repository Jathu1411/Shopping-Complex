package Theatre;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Theatre_Activator implements BundleActivator {

	private static BundleContext context;

	

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Gas service bundle started");
		Theatre_Activator.context = bundleContext;
		this.TicketService();
		System.out.println("Gas service started.");
	}
	
	private void TicketService(){
		Theatre_Interface theatre = new TheatreImplementation();
		context.registerService(Theatre_Interface.class, theatre,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Theatre_Activator.context = null;
		System.out.println("Gas service service stopped.");
	}


}




