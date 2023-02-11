package AnonymousObject;

/**
 * 我们创建的对象，没有显式的赋给一个变量名，即为匿名对象。
 * 特点：匿名对象只能调用一次。
 * 举例： new phone().sendEmail();
 *       new phone().playGame();
 *       new phone().price = 1999;
 *       new phone().showPrice(); // 0.0
 *       以上创立了四个匿名对象。
 *
 *       public class NiMingObj {
 *     // 开发中的应用场景：
 *     PhoneMall mall = new PhoneMall();
 *     // 匿名对象的使用
 *     mall.show1(new phone()); //方法的形参是一个类类型。传入一个匿名对象。
 *     // 此时的new phone()赋给了phone这个形参，在show方法里可以被多次调用。
 *
 * }
 *
 * class PhoneMall {
 *     public void show1(Phone phone) {
 * //        phone.sendEmail();
 * //        phone.playGame();
 *     }
 * }
 */


