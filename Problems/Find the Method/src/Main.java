import java.util.Arrays;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        for (String className :
                classNames) {
            if (Arrays.stream(Class.forName(className)
                    .getMethods())
                    .anyMatch(method -> method.getName().equals(methodName))){
                return className;
            }
        }
        return "";
    }
}