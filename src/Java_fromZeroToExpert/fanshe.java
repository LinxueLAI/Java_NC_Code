package Java_fromZeroToExpert;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class fanshe {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = new String("abc");

        /**
         * 1.
         */
        //反射
        /*
        java的反射机制： 在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法。
        对于任意一个对象，都能够调用它的一个属性和方法。 反射机制是一种动态获取信息以及动态调用对象方法的功能。
         */
        Field value  = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(s,"abcd".toCharArray());

        System.out.println(s);

        /**
         *         2.
         */
        String s1 = new String("abc");//生成2个对象
        String s2 = "abc";//字符串常量对象

        System.out.println(s1==s2);//false

        String s3 = s1.intern();// String 对象的intern方法，首先会检查字符串常量池中是否存在“abc"，如果存在则返回该字符串引用，如果不存在，则把“abc"添加到字符串常量池中，并返回该字符串的引用。

        System.out.println(s2==s3);//true


        /**
         * 3.
         */
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1==i2);//true

        Integer i3 =128;
        Integer i4 = 128;
        System.out.println(i3==i4);//false

        /*
        在Integer 类中，存在一个静态内部类IntegerCache[],并且存在一个static块，会在加载类的时候执行，
        会将-128至127这些数字提前生成Integer对象，并且缓存在cache数组中，当我们在定义Integer数字的时候，会调用Integer的valueOf方法，
        valueOf会判断所定义的数字是否在-128~127之间，如果存在则直接从cache数组中获取Integer对象，如果超过，则生成一个新的Integer对象。

         */

        /**
         * 4.
         */

        differencesString();

        /**
         * 5.
         */
        differenceList();

        /**
         * 6.
         */
        kuorongHashMap();
    }

    private static void kuorongHashMap() {
        /*
        1.7： 对数组进行扩容，生成新的数组，把每个位置上的元素（链表上的）转移到新的数组上。
        1.8: 数组、链表、红黑树
         */
    }

    private static void differenceList() {
        /*
        1.ArrayList ->底层是基于数组实现的：添加元素，加在后面(简单），否则考虑扩容。更适合随即查找

        2.LinkedList ->底层是基于链表实现的；更适合删除和添加。

        另外二者都实现了List接口，但是LinkedList还额外实现了Deque接口，所以LinkedList还可以当作队列来使用。


         */

        ArrayList<String> arrayList = new ArrayList<>(); //数组
        arrayList.add("1"); //扩容
        arrayList.add(3,"1");//扩容 移动

//        ArrayList是线程不安全的。
        arrayList.add("adsfsf");
        arrayList.add("gfdgdfd"); //并发的状况下会发生数据覆盖。

        /*
        CopyOnWriteArrayList的底层原理：
        1. 内部也是数组来实现的，向它添加元素时，会复制一个新的数组，写操作在新的数组上进行，读操作在原数组上进行。
        2. 并且，写操作会加锁，防止出现并发写入丢失数据的问题。
        3. 写操作结束后会把原数组指向新的数组
        4. 它允许在写操作时来读取数据，大大提高了读的性能，因此适合读多写少的应用场景。但它比较占内存，同时可能读到的数据不是实时的最新数据，
        所以不适合实时性要求高的场景。
         */
        CopyOnWriteArrayList<String> list  =new CopyOnWriteArrayList<>();
        list.add("adsfsf");
        String s = list.get(1);
        System.out.println(list);
        System.out.println(arrayList);


        LinkedList<String>  linkedList = new LinkedList<>(); //链表
        linkedList.add("1");
        linkedList.add(3,"1");

        System.out.println(arrayList);
        System.out.println(linkedList);
    }

    private static void differencesString() {
        /*
        1.String 是不可变的，如果尝试去修改，会新生成一个字符串对象，StringBuffer和StringBuilder是可变的
        2.StringBuffer是线程安全的，StringBuilder是线程不安全的，所以在单线程环境下StringBuilder效率会更高。
         */
        String s = "abc";
        s = "bcd";


        StringBuffer buffer = new StringBuffer();
        buffer.append("abc");//加了synchronize
    }
}
