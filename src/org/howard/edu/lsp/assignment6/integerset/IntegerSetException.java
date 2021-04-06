  
package org.howard.edu.lsp.assignment6.integerset;

/**
 * @apiNote Exception Class for IntegerSet exceptions
 * 
 * @author Samuel Calmday
 *
 */
public class IntegerSetException extends Exception {

  private static final long serialVersionUID = 7654757987890L;

  /**
   * @param e thrown exception object
   */
  public IntegerSetException(String e) {
    super(e);
  }
}
