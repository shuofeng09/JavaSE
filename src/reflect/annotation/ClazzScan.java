package reflect.annotation;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClazzScan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 空class对象
        List<Class<?>> classList = null;
        // 需要扫描的路径
        String path = "reflect.annotation";
        path = path.replaceAll("\\.", "/");
        // System.out.println(path);
        // 得到我classLoader对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        // 通过classLoader获取当前环境变量
        Enumeration<URL> resources = loader.getResources(path);
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            // 得到文件类型
            String protocol = url.getProtocol();
            if ("file".equals(protocol)) {
                List<File> classes = new ArrayList<>();
                // 递归路径下的所有class文件
                listFiles(new File(url.getFile()), classes);
                // 加载所有class文件，并存入容器中
                classList = loadClasses(classes, path);
            }
        }
        System.out.println(classList);

    }

    private static List<Class<?>> loadClasses(List<File> classes, String path) throws ClassNotFoundException {
        List<Class<?>> clazzes = new ArrayList<>();
        for (File file : classes) {
            // 得到class文件的绝对路径，并且替换路径分隔符
            String fPath = file.getAbsolutePath().replaceAll("\\\\", "/");
            // 去掉绝对路径前的盘符，得到包名+.class
            String packageName = fPath.substring(fPath.lastIndexOf(path));
            String classFullName = packageName.replace(".class", "").replaceAll("/", ".");
            clazzes.add(Class.forName(classFullName));
        }

        return clazzes;
    }

    private static void listFiles(File file, List<File> classes) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                listFiles(f, classes);
            }
        } else {
            if (file.getName().endsWith(".class")) {
                classes.add(file);
            }
        }
    }
}
