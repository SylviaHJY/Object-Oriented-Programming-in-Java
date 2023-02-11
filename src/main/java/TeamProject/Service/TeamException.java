package TeamProject.Service;

/**
 * 用户自定义异常类：
 *      1、如何自定义异常类：1、继承于现有的异常结构：RuntimeException、Exception
 *      2、提供全局常量：serialVersionUID
 *      3、提供重载的构造器。
 */
public class TeamException extends RuntimeException{
    static final long serialVersionID = -3387514229948L;
    public TeamException(){
        super();
    }

    public TeamException(String mgs){
        super(mgs);
    }

}
