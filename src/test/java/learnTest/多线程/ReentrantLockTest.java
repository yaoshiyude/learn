package learnTest.多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-19 15:40
 **/

public class ReentrantLockTest {

    static ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        for(int i=0;i<10;i++){

            new Thread(()->{
                ReentrantLockTest.testReadWriteLock();
                //ReentrantLockTest.testReadLock();
                //ReentrantLockTest.testWriteLock();
            }).start();

        }

    }

    /**
     * @Author yaoshiyu
     * @Description  测试先写后读 锁降级
     * @Date 16:48 2019/12/19
     * @Param []
     * @return void
     **/

    public static void testWriteReadLock(){
        reentrantReadWriteLock.writeLock().lock();
        System.out.println(Thread.currentThread().getName()+"获取写锁");

        reentrantReadWriteLock.readLock().lock();
        System.out.println(Thread.currentThread().getName()+"获取读锁");

        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        reentrantReadWriteLock.writeLock().unlock();

        System.out.println(Thread.currentThread().getName()+"写锁释放了");

        reentrantReadWriteLock.readLock().unlock();

        System.out.println(Thread.currentThread().getName()+"读锁释放了");
    }


    /**
     * @Author yaoshiyu
     * @Description  测试先读后写
     * @Date 16:48 2019/12/19
     * @Param []
     * @return void
     **/

    public static void testReadWriteLock(){

        reentrantReadWriteLock.readLock().lock();
        System.out.println(Thread.currentThread().getName()+"获取读锁");

        reentrantReadWriteLock.writeLock().lock();
        System.out.println(Thread.currentThread().getName()+"获取写锁");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        reentrantReadWriteLock.readLock().unlock();

        System.out.println(Thread.currentThread().getName()+"读锁释放了");

        reentrantReadWriteLock.writeLock().unlock();

        System.out.println(Thread.currentThread().getName()+"写锁释放了");
    }

    public static void testReadLock(){


        reentrantReadWriteLock.readLock().lock();
        System.out.println(Thread.currentThread().getName()+"获取读锁");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        reentrantReadWriteLock.readLock().unlock();

        System.out.println(Thread.currentThread().getName()+"读锁释放了");
    }

    public static void testWriteLock(){
        reentrantReadWriteLock.writeLock().lock();
        System.out.println(Thread.currentThread().getName()+"获取写锁");


        /*try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        reentrantReadWriteLock.writeLock().unlock();

        System.out.println(Thread.currentThread().getName()+"写锁释放了");

    }
}
