package Test1;
class outer {
    public static void main(String[] args) {
        String [] arr = {"outer invoke"};
        first.main(arr);
    }
}

// 实验总结:
// 1. 一个文件中只能有一个public类, 且public类的类名必须与文件名相同，可以在文件外调用
// 2. 一个文件中可以有多个普通类，他们不能被文件外直接调用
// 3. private类只能在类中定义，其使用范围在定义其的类中
// 4. main可以被重载，但只有 public static void main(String[] args)会被识别为入口函数
// 5. 每个类都可以定义入口函数，每个文件中第一个入口函数会被识别为该文件入口函数，必须要有入口函数才能运行该文件

// 6. .java文件原则上要编译为.class字节码文件才能被虚拟机执行,入口程序文件可以直接用java命令执行是新版本的特性,包必须要编译为.class文件才能被 import
// 7. 默认包不需要使用 package 和 import 关键字，默认包名为空
// 8. 对应文件夹下的包，其源文件应使用 "package [文件夹名]"，编译时应在对应路径(见下说明)下编译 import了该包的程序
//      如: first.java 中使用了 "package Test1"，生成的 first.class文件就应放在 Test1 文件夹下。
//          使用 first 类的程序如 outer.java 应 import Test1.first (若 outer.java也声明 package Test1，即同属于一个包，则无需 import)。
//          编译时编译路径应该为 Test1 的父目录(即编译路径下有 Test1文件夹)。