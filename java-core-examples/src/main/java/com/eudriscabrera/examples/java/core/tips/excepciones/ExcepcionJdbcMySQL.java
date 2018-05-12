/**
 * 
 */
package com.eudriscabrera.examples.java.core.tips.excepciones;

/**
 * @author ecabrerar
 *
 */
/**
*
* @author ecabrerar
*/
public class ExcepcionJdbcMySQL extends Exception{

   public ExcepcionJdbcMySQL() {
   }

   public ExcepcionJdbcMySQL(String message) {
       super(message);
   }

   public ExcepcionJdbcMySQL(String message, Throwable cause) {
       super(message, cause);
   }

   public ExcepcionJdbcMySQL(Throwable cause) {
       super(cause);
   }

   public ExcepcionJdbcMySQL(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
       super(message, cause, enableSuppression, writableStackTrace);
   }
}
   
