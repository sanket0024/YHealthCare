/**
 * @author Sanket Mathur
 * @date 11 Aug 2018
 *
 * Company: YHC
 */

package s2018.yhcmain.healthcare.utils;

import s2018.yhcmain.healthcare.objects.ServiceResponse;


/**
 * Utility class for application independent methods and variables
 */

public class Utility {

    public static void setResponseObject(Object obj, String status, String desc, ServiceResponse res) {
        res.setData(obj);
        res.setDescription(desc);
        res.setStatus(status);
    }
}
