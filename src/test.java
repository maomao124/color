/**
 * Project name(项目名称)：自定义颜色
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/3
 * Time(创建时间)： 12:00
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {

        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        System.out.println(1234567);
        System.out.println(" \033[(前缀),m(后缀),格式:\033[XX;XX;XXm");
        System.out.println("------ 字体颜色30~37 ------");
        System.out.println("\033[30m" + "就是酱紫的");
        System.out.println("\033[31m" + "就是酱紫的");
        System.out.println("\033[32m" + "就是酱紫的");
        System.out.println("\033[33m" + "就是酱紫的");
        System.out.println("\033[34m" + "就是酱紫的");
        System.out.println("\033[35m" + "就是酱紫的");
        System.out.println("\033[36m" + "就是酱紫的");
        System.out.println("\033[37m" + "就是酱紫的");
        System.out.println("\033[38m" + "就是酱紫的");
        System.out.println("------ 背景颜色40~47 -------");
        System.out.println("\033[40m" + "就是酱紫的");
        System.out.println("\033[41m" + "就是酱紫的");
        System.out.println("\033[42m" + "就是酱紫的");
        System.out.println("\033[42m" + "就是酱紫的" + "\033[m");
        System.out.println("\033[43m" + "就是酱紫的");
        System.out.println("\033[44m" + "就是酱紫的" + "\033[m");
        System.out.println("\033[45m" + "就是酱紫的");
        System.out.println("\033[46m" + "就是酱紫的" + "\033[m");
        System.out.println("\033[47m" + "就是酱紫的" + "\033[m");
        System.out.println("--- 1:加粗,;:隔开,90~97字体颜色变亮 ---");
        System.out.println("\033[1;90m" + "就是酱紫的");
        System.out.println("\033[1;91m" + "就是酱紫的");
        System.out.println("\033[1;92m" + "就是酱紫的");
        System.out.println("\033[1;93m" + "就是酱紫的");
        System.out.println("\033[1;94m" + "就是酱紫的");
        System.out.println("\033[1;95m" + "就是酱紫的");
        System.out.println("\033[1;96m" + "就是酱紫的");
        System.out.println("\033[1;97m" + "就是酱紫的");
        System.out.println("\033[1;93;45m" + "就是酱紫的" + "\033[m");

        System.out.println(123);
        System.out.println("\033[38m");
        System.out.println("123");
        System.out.println("\033[32m" + "123" + "\033[0m");
        System.out.println(123);
        System.out.println("\033[1;92m" + "就是酱紫的" + "\033[0;0m"); //green bold
        System.out.println(12345464);

        System.out.println("\033[42m" + "就是酱紫的" + "\033[m");  //background
        System.out.println("1234");

        System.out.print("\033[1;92m");
        for (int i = 0; i < 6; i++)
        {
            System.out.print(i + "\t");
        }
        System.out.print("\033[0;0m");
        //天蓝色
        System.out.print("\033[1;96m");      //sky_blue
        for (int i = 0; i < 6; i++)
        {
            System.out.print(i + "\t");
        }
        System.out.print("\033[0;0m");
        //蓝色
        System.out.print("\033[1;94m");      //blue
        for (int i = 0; i < 6; i++)
        {
            System.out.print(i + "\t");
        }
        System.out.print("\033[0;0m");
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
    }
}
