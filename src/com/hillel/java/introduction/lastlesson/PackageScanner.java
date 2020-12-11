package com.hillel.java.introduction.lastlesson;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;

public class PackageScanner {

    @SuppressWarnings("rawtypes")
    public static Class[] getClasses(String packageName) throws ClassNotFoundException, IOException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

        Objects.requireNonNull(contextClassLoader);

        String path = packageName.replace('.', '/');

        Enumeration<URL> resources = contextClassLoader.getResources(path);
        List<File> directories = new ArrayList<>();

        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();

            directories.add(new File(resource.getFile()));
        }

        ArrayList<Class> classes = new ArrayList<>();
        for (File directory : directories) {
            classes.addAll(findClasses(directory, packageName));
        }

        return classes.toArray(new Class[classes.size()]);
    }

    @SuppressWarnings("rawtypes")
    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes= new ArrayList<>();

        if (!directory.exists()) {
            return classes;
        }

        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                if (file.getName().contains(".")) {
                    throw new RuntimeException("The directory name shouldn't contain dots ('.')");
                }
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else {
             //   classes.add(Class.forName(packageName + "." + file.getName().substring(0, file.getName().length() - ".class".length())));
                classes.add(Thread.currentThread().getContextClassLoader().loadClass(packageName + "." + file.getName().substring(0, file.getName().length() - ".class".length())));
            }
        }

        return classes;
    }
}
