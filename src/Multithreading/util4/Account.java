package Multithreading.util4;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 20:21
 * @Description: 银行类
 */
public class Account {
    private int imat = 600;
    /**取款*/
    public void wait(int haha){
        this.imat = this.imat - haha;
    }

    /**查看余额*/
    public int getimat(){
        return imat;
    }
}
