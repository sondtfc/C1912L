/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl17;

import java.net.Socket;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author teacher
 */
public class LoggingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Logger logger = LogManager.getLogger(LoggingDemo.class);
        logger.log(Level.FATAL, "This is Faltal");
        logger.log(Level.ERROR, "This is ERROR");
        logger.log(Level.WARN, "This is Warn");
        logger.log(Level.INFO, "This is Info");
        
        logger.debug("Debug");
        logger.fatal("Debug");
        
    }
    
}
