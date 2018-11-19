/**
 * @author Sanket Mathur
 * @date 11 Aug 2018
 *
 * Company: YHC
 */

package s2018.yhcmain.healthcare.objects;

import org.springframework.stereotype.Component;

/**
 * A generic object for the response object
 */

@Component
public class ServiceResponse {

    private String status;
    private String description;
    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
