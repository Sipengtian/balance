package org.example;

import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击间距中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args)  throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your expression");
        String expression =scanner.nextLine();
        BalanceParentheses balance = new BalanceParentheses();
         balance.balanceParentheses(expression);//TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修复。
scanner.close();

    }
}