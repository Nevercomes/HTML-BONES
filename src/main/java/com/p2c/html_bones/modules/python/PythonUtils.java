package com.p2c.html_bones.modules.python;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/***
 * Python脚本的执行的工具类
 */
public final class PythonUtils {
    /***
     * 传入参数调用shell脚本
     * 返回结果为字符串（文件路径 结果等）
     * @param path shell path
     * @param args parameters
     * @return result path
     */
    public static String callArgs(String path, List<String> args) {
        String result = "";
        try {
            StringBuilder command = new StringBuilder();
            command.append("python ").append(path).append(" ");
            if(args != null) {
                for(String arg : args) {
                    command.append(arg).append(" ");
                }
            }
            System.err.println(command);
            Process process = Runtime.getRuntime().exec(command.toString());
            InputStreamReader ir = new InputStreamReader(process.getInputStream());
            LineNumberReader input = new LineNumberReader(ir);
            result = input.readLine();
            input.close();
            ir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.err.println(callArgs("D:/call_test.py", list));
    }

}
