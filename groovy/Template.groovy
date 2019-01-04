package somnous.y.templateservice

import lombok.Data

/**
 *
 * @version 1.0 created by yuanchangxin_fh on 2019/1/4 9:43
 */
@Data
class Template {

    HashMap map = new HashMap()

    def getData = {
        m->
            map.putAll(m)
            return map
    }

}
