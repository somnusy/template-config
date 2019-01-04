package somnous.y.templateservice


/**
 *
 * @version 1.0 created by yuanchangxin_fh on 2019/1/4 9:43
 */
class Template {

    HashMap map = new HashMap()

    def getData = {
        m->
            map.putAll(m)
            return map
    }

}