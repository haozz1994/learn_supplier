package com.haozz.util;

import com.haozz.bean.User;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/11/29 15:22 haozz Exp $
 */
public class Java8Tester {

    final static String salutation = "Hello! ";

    public static void main(String args[]) {

//        java8Tester1();

        System.out.println("-------------------------------------");

//        java8Tester2();

        System.out.println("-------------------------------------");

//        java8Tester3();

        System.out.println("-------------------------------------");

//        java8Tester4();

        System.out.println("-------------------------------------");

//        java8Tester5();

        System.out.println("-------------------------------------");

//        java8Tester6();

        System.out.println("-------------------------------------");

//        java8Tester7();

        System.out.println("-------------------------------------");

//        java8Tester8();

        java8Tester9();

    }

    private static int jia(int a, int b) {
        return a + b;
    }

    public static void java8Tester9() {
        List<User> list = genUserList();
        list = list.stream().filter(u -> u.getId() / 2 != 0).collect(Collectors.toList());
        List<Integer> ids = list.stream().filter(u -> u.getUsername().length() >= 5).map(u -> (int) u.getId()).sorted((u1, u2) -> u1 - u2).collect(Collectors.toList());

        List<Long> idss = list.stream().filter(u -> u.getUsername().length() >= 5).map(User::getId).collect(Collectors.toList());

        List<Long> lll = list.stream().filter(user -> user.getId()>3).map(new Function<User, Long>() {
            @Override
            public Long apply(User user) {
                return user.getId();
            }
        }).collect(Collectors.toList());

        List<Long> lll1 = list.stream().filter(user -> user.getId()>3).map(user -> user.getId()).collect(Collectors.toList());

        List<Long>newList = list.stream().filter(u -> u.getId() > 3).map(User::getId).collect(Collectors.toList());




                list.forEach(System.out::println);
        System.out.println("-------------------------------------");
        ids.forEach(System.out::println);

        list.forEach(li ->{

        });

        List<Integer> list3 = Arrays.asList(1, 3, 5, 7, 9);

        //1.使用匿名内部类,不使用lambda表达式
        Collections.sort(list3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        //2.使用lambda表达式
        Collections.sort(list3,(o1,o2) -> o1 - o2 );


        //1.使用匿名内部类,不使用lambda表达式
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
            }
        });

        //2.使用lambda表达式
        new Thread(() -> System.out.println("123"));

        //1.使用匿名内部类,不使用lambda表达式
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
            }
        };

        //2.使用lambda表达式
        Runnable r2 = () -> System.out.println();


        String [] ss=  {"1","2"};

        Arrays.sort(ss,(s1,s2)->s1.compareToIgnoreCase(s2));
        Arrays.sort(ss,String::compareToIgnoreCase);

    }

    private static List<User> genUserList() {
        List<User> list = Arrays.asList(new User(2, "Zoro", "2"), new User(3, "Sanji", "3"), new User(1, "Lufy", "1"), new User(5, "Nami", "5"), new User(9, "Franke", "9"), new User(7, "Nico`Robin", "7"));
        return list;
    }


    /**********************************************************************/

    public static void java8Tester1() {
        GreetingService greetService1 = message -> System.out.println(salutation + message);
        greetService1.sayMessage("Runoob");
    }

    /**********************************************************************/

    public static void java8Tester2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true

        System.out.println("输出所有数据:");

        // 传递参数 n
        eval(list, n -> true);

        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n%2 为 0 test 方法返回 true

        System.out.println("输出所有偶数:");
        eval(list, n -> n % 2 == 0);

        // Predicate<Integer> predicate2 = n -> n > 3
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n 大于 3 test 方法返回 true

        System.out.println("输出大于 3 的所有数字:");
        eval(list, n -> n > 3);
//        list.stream().filter(n -> n > 3).forEach(System.out::println);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {

            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }

//        list.stream().filter(predicate).forEach(System.out::println);
    }

    /**********************************************************************/

    public static void java8Tester3() {
        List<String> players = Arrays.asList("Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner");


        // 1.1 使用匿名内部类根据 name 排序 players
        Collections.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        Collections.sort(players, (s1, s2) -> s1.compareTo(s2));
    }

    public static void java8Tester4() {
        /**
         * 构造器引用：它的语法是Class::new，或者更一般的Class< T >::new
         * 相当于传入一个new Car()
         */
        final Car car = Car.create(Car::new);
        car.setAge(5);

        final Car car1 = Car.create(Car::new);
        car1.setAge(7);
        List<Car> list = Arrays.asList(car, car1);

        /**
         * 静态方法引用：它的语法是Class::static_method
         * collide是静态方法,入参是一个Car,此处可理解为每一次遍历是一个未初始化的Car调用了collide方法
         * 方法的入参就是list的每一项
         * 打印结果:
         * Collided  ; car.getAge = 5
         * Collided  ; car.getAge = 7
         */
        list.forEach(Car::collide);

        /**
         * 特定类的任意对象的方法引用：它的语法是Class::method
         * repair不是静态方法,且没有入参,此处可理解为每一次遍历,是list中的每一项调用了repair方法
         * 打印结果:
         * Repaired 5
         * Repaired 7
         */

        list.forEach(Car::repair);

        final Car police = Car.create(Car::new);
        /**
         * 特定对象的方法引用：它的语法是instance::method
         * follow不是静态方法,且有入参
         * 所以下面的写法可理解为,在list的每一次遍历中,都是police调用了follow方法,而方法的入参就是list的每一项
         * 打印结果为:
         * Following : this.age = 0 ; car.getAge = 5
         * Following : this.age = 0 ; car.getAge = 7
         */
        list.forEach(new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                police.follow(car);
            }
        });

        list.forEach(carr -> police.follow(carr));

        list.forEach(police::follow);


        Random random = new Random();
        random.ints();


    }

    public static void java8Tester5() {
        System.out.println("使用 Java 7: ");

        // 计算空字符串
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println("列表: " + strings);
        long count = getCountEmptyStringUsingJava7(strings);

        System.out.println("空字符数量为: " + count);
        count = getCountLength3UsingJava7(strings);

        System.out.println("字符串长度为 3 的数量为: " + count);

        // 删除空字符串
        List<String> filtered = deleteEmptyStringsUsingJava7(strings);
        System.out.println("筛选后的列表: " + filtered);

        // 删除空字符串，并使用逗号把它们合并起来
        String mergedString = getMergedStringUsingJava7(strings, ", ");
        System.out.println("合并字符串: " + mergedString);
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        // 获取列表元素平方数
        List<Integer> squaresList = getSquares(numbers);
        System.out.println("平方数列表: " + squaresList);
        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);

        System.out.println("列表: " + integers);
        System.out.println("列表中最大的数 : " + getMax(integers));
        System.out.println("列表中最小的数 : " + getMin(integers));
        System.out.println("所有数之和 : " + getSum(integers));
        System.out.println("平均数 : " + getAverage(integers));
        System.out.println("随机数: ");

        // 输出10个随机数
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }

        System.out.println("使用 Java 8: ");
        System.out.println("列表: " + strings);

        count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("空字符串数量为: " + count);

        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("字符串长度为 3 的数量为: " + count);

        filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选后的列表: " + filtered);

        mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);

        squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);
        System.out.println("列表: " + integers);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
        System.out.println("随机数: ");

        random.ints().limit(10).sorted().forEach(System.out::println);

        // 并行处理
        count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("空字符串的数量为: " + count);
    }

    public static void java8Tester6() {
        Integer value1 = null;
        Integer value2 = new Integer(10);

        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value2);
        System.out.println(sum(a, b));
    }

    public static void java8Tester7() {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        String name = "Runoob";
        Integer result = null;

        try {
            nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("10 + 2");

        } catch (ScriptException e) {
            System.out.println("执行脚本错误: " + e.getMessage());
        }

        System.out.println(result.toString());


        List<String> ids = Arrays.asList("2", "", "4", "3", "11");
        ids.stream().filter(string -> Integer.parseInt(string) >= 3 || string.isEmpty()).sorted().collect(Collectors.toList());
        ids.forEach(System.out::println);
    }

    public static void java8Tester8() {
        try {

            // 使用基本编码
            String base64encodedString = Base64.getEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
            System.out.println("Base64 字符串 (基本) :" + base64encodedString);

            // 解码
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);

            System.out.println("原始字符串: " + new String(base64decodedBytes, "utf-8"));
            base64encodedString = Base64.getUrlEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
            System.out.println("Base64 编码字符串 (URL) :" + base64encodedString);

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 编码字符串 (MIME) :" + mimeEncodedString);

        } catch (UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
        }

    }

    private static Integer sum(Optional<Integer> a, Optional<Integer> b) {

        // Optional.isPresent - 判断值是否存在

        System.out.println("第一个参数值存在: " + a.isPresent());
        System.out.println("第二个参数值存在: " + b.isPresent());

        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - 获取值，值需要存在
        Integer value2 = b.get();
        return value1 + value2;
    }

    private static int getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;

        for (String string : strings) {

            if (string.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    private static int getCountLength3UsingJava7(List<String> strings) {
        int count = 0;

        for (String string : strings) {

            if (string.length() == 3) {
                count++;
            }
        }
        return count;
    }

    private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        List<String> filteredList = new ArrayList<String>();

        for (String string : strings) {

            if (!string.isEmpty()) {
                filteredList.add(string);
            }
        }
        return filteredList;
    }

    private static String getMergedStringUsingJava7(List<String> strings, String separator) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String string : strings) {

            if (!string.isEmpty()) {
                stringBuilder.append(string);
                stringBuilder.append(separator);
            }
        }
        String mergedString = stringBuilder.toString();
        return mergedString.substring(0, mergedString.length() - 2);
    }

    private static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squaresList = new ArrayList<Integer>();

        for (Integer number : numbers) {
            Integer square = new Integer(number.intValue() * number.intValue());

            if (!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }
        return squaresList;
    }

    private static int getMax(List<Integer> numbers) {
        int max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {

            Integer number = numbers.get(i);

            if (number.intValue() > max) {
                max = number.intValue();
            }
        }
        return max;
    }

    private static int getMin(List<Integer> numbers) {
        int min = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            Integer number = numbers.get(i);

            if (number.intValue() < min) {
                min = number.intValue();
            }
        }
        return min;
    }

    private static int getSum(List numbers) {
        int sum = (int) (numbers.get(0));

        for (int i = 1; i < numbers.size(); i++) {
            sum += (int) numbers.get(i);
        }
        return sum;
    }

    private static int getAverage(List<Integer> numbers) {
        return getSum(numbers) / numbers.size();
    }

    interface GreetingService {
        void sayMessage(String message);
    }


}
