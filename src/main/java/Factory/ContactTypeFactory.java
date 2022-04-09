package Factory;

/**ContactTypeFactory.java
 * Factory for ContactType
 * Author: Daniella Burgess (219446482)
 * Date: 07 April 2022
 */

import Entity.ContactType;
import Util.DaniellaHelper;

public class ContactTypeFactory {

    public static ContactType createContactType(String contactName, String contactDescription) {

        String contactTypeId = DaniellaHelper.ContactTypeId();
         ContactType contactType = new ContactType.Builder().contactTypeId(contactTypeId)
                .contactName(contactName)
                .contactDescription(contactDescription)
                .build();
         return contactType;
    }
}
