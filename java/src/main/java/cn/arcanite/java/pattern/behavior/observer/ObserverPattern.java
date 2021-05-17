package cn.arcanite.java.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者（Observer）模式
 * 定义：指多个对象间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
 * 优点：降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。符合依赖倒置原则。
 * 缺点：当观察者对象很多时，通知的发布会花费很多时间，影响程序的效率
 *
 * @author Jim
 * @date 2021/05/17
 */
public class ObserverPattern {

    public static void main(String[] args) {
        School school = new School();
        school.add(new TeacherListener());
        school.add(new StudentListener());
        school.notifyObserver(true);
        school.notifyObserver(false);
    }
}

// 抽象目标角色
// 提供一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法
interface Subject {
    void add(Listener listener);

    void remove(Listener listener);

    void notifyObserver(boolean toStart);
}

// 具体目标角色
// 实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象
class School implements Subject {
    private List<Listener> listenerList = new ArrayList<>();

    @Override
    public void add(Listener listener) {
        listenerList.add(listener);
    }

    @Override
    public void remove(Listener listener) {
        listenerList.remove(listener);
    }

    @Override
    public void notifyObserver(boolean toStart) {
        for (Listener listener: listenerList) {
            listener.onEvent(toStart);
        }
    }
}

// 抽象观察者（Observer）
// 包含一个更新自己的抽象方法，当接到具体主题的更改通知时被调用
interface Listener {

    void onEvent(boolean toStart);
}

// 具体观察者1
// 实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态
class TeacherListener implements Listener {

    @Override
    public void onEvent(boolean toStart) {
        if (toStart) {
            System.out.println("老师开始上课");
        } else {
            System.out.println("老师宣布下课");
        }
    }
}

// 具体观察者2
class StudentListener implements Listener {

    @Override
    public void onEvent(boolean toStart) {
        if (toStart) {
            System.out.println("学生准备听课");
        } else {
            System.out.println("学生下课");
        }
    }
}
