package chapter21;
/*
finally语句：
    放在finally语句块中的代码是一定会执行的【再次强调！！！】
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        /*
        try和finally，没有catch可以吗？可以。
            try不能单独使用。
            try finally可以联合使用。
        以下代码的执行顺序：
            先执行try...
            再执行finally...
            最后执行 return （return语句只要执行方法必然结束。）
         */
        try {
            System.out.println("try...");
            return;
        } finally {
            // finally中的语句会执行。能执行到。
            System.out.println("finally...");
        }

        // 这里不能写语句，因为这个代码是无法执行到的。
        //System.out.println("Hello World!");
    }
}
