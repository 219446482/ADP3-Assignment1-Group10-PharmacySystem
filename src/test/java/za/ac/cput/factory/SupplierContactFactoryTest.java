/*SupplierContactFactoryTest.java
 * Factory Test class for SupplierContact
 * Author: Ilyaas Davids (219466242)
 * Date: 12 Oct 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupplierContactFactoryTest {

    @Test
    @Order(1)
    public void buildWithSuccess(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->
                SupplierContactFactory.createSupplierContact("123","0208348302","209023651@mycput.ac.za"));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
    }

    @Test
    @Order(2)
    public void buildWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->
                SupplierContactFactory.createSupplierContact("123","","209023651@mycput.ac.za"));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
    }

}