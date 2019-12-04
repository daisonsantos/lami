package br.ucsal.lamis.banco;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.hsqldb.Server;
import org.hsqldb.persist.HsqlProperties;

@WebListener
public class BancoUtil implements ServletContextListener {

	
    private Server server;

   
    public BancoUtil() {
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
    	server.shutdown();
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
        try {
            System.out.println("Starting Database");
            HsqlProperties p = new HsqlProperties();
            p.setProperty("server.database.0", "file:lami.db");
            p.setProperty("server.dbname.0", "lami");
            p.setProperty("server.port", "9001");
            server = new Server();
            server.setProperties(p);
            server.start();
            
        } catch (Exception e) {
        	System.out.println(e);
        }
    }
}