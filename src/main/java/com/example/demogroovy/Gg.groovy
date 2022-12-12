package groovy

import com.example.demogroovy.GroovyTestService
import com.example.demogroovy.util.SpringContextUtil

/**
 * 静态变量
 */
class Globals {
    static String PARAM1 = "静态变量"
    static int[] arrayList = [1, 2]
}
def getBean() {
    GroovyTestService groovyTestService = SpringContextUtil.getBean(GroovyTestService.class);
    groovyTestService.test()
}
