package Theatre;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Theatre_Activator implements BundleActivator {
	ServiceRegistration publishServiceReg;
	

	public void start(BundleContext bundleContext) throws Exception {
		Theatre_Interface theatre = new TheatreImplementation();
		System.out.println("Theatre ticket service started.");
		publishServiceReg = bundleContext.registerService(Theatre_Interface.class.getName(), theatre, null);
	}
	
	
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Theatre ticket service stopped.");
		publishServiceReg.unregister();
	}
}









	


