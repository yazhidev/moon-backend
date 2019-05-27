
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class AppInitializer implements WebApplicationInitializer {

    private static final Logger log = LoggerFactory.getLogger(AppInitializer.class);


    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext applicationContext =
                new AnnotationConfigWebApplicationContext();
        applicationContext.register(AppConfig.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        Dynamic addServlet = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
        addServlet.addMapping("/");
        log.info("webapp initialized ok.");
    }
}
