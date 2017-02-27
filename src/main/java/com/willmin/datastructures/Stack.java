package com.willmin.datastructures;

/**
 * Created by WLM on 2017/2/23.
 * java 模拟栈
 * 特点:
 *      1.先进后出
 *      2.访问只能访问栈第一个元素也就是最顶端元素
 * 应用:
 *      1.倒序（文字倒序输出）
 *      2.分隔符通配（比如代码格式审查）
 *      3.辅助遍历二叉树
 *      4.辅助查找图的顶点
 * 例子：
 *      以{[()]}等符号做匹配
 *
 */
public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;
    //构造方法
    public Stack(int s){
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
    //入栈
    public void push(char c){
        stackArray[++top] = c;
    }
    //出栈
    public char pop(){
        stackArray[top] = ' ';
        return stackArray[top--];
    }
    //判空
    public boolean isEmpty(){
        return (top == -1);
    }
    //取栈顶值，不对栈进行操作
    public char peek(){
        return stackArray[top];
    }

    class BracketChecker{
        private String input;

        public BracketChecker(String  in){
            input = in;
        }

        public void check(){
            int stackSize = input.length();
            Stack stack = new Stack(stackSize);

            for(int i = 0;i<stackSize;i++){
                char ch = input.charAt(i);
                switch (ch){
                    case '{':
                    case '[':
                    case '(':
                        stack.push(ch);
                        break;
                    case '}':
                    case ']':
                    case ')':
                        if(!stack.isEmpty()){
                            if(ch!=stack.pop()){
                                System.out.println("error :"+ch+"At"+i);
                            }
                        }
                        else System.out.println("error :"+ch+"At"+i);
                        break;
                    default:
                        break;
                }
                if(!stack.isEmpty()) System.out.println("error : miss right delimiter");
                else System.out.println("ture");
            }
        }
    }
}
