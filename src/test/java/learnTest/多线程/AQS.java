package learnTest.多线程;

import learnTest.java底层.ItemDTO;
import sun.misc.Unsafe;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.*;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-16 19:00
 **/

public class AQS extends AbstractQueuedSynchronizer {

    Lock lock = new ReentrantLock();
    Lock readLock = new ReentrantReadWriteLock().readLock();
    Lock writeLock = new ReentrantReadWriteLock().writeLock();


    Condition condition = lock.newCondition();

    private static final Unsafe unsafe = Unsafe.getUnsafe();


    @Override
    protected  boolean  tryAcquire(int arg) {
        System.out.println("哈哈哈哈输出了"+arg);
        return true;
    }

    @Override
    protected boolean tryRelease(int arg) {
        return super.tryRelease(arg);
    }

    @Override
    protected int tryAcquireShared(int arg) {
        System.out.println("共享的方式获取锁");
        return super.tryAcquireShared(arg);
    }

    @Override
    protected boolean tryReleaseShared(int arg) {
        return super.tryReleaseShared(arg);
    }

    @Override
    protected boolean isHeldExclusively() {
        return super.isHeldExclusively();
    }

    public static void main(String[] args) {

        Map<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("yao","yaoshiyu");
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("yaoshiyu","yaoshiyu");

        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setNum(1);
        ItemDTO itemDTO1 = new ItemDTO();
        itemDTO1.setNum(2);
        AQS aqs = new AQS();
        //aqs.acquire(6);
        aqs.acquireShared(5);
    }

    private void test(ItemDTO itemDTO,ItemDTO itemDTO1){
        lock.lock();
        readLock.lock();
        writeLock.lock();
        unsafe.compareAndSwapObject(this,0,itemDTO,itemDTO1);
    }
}
