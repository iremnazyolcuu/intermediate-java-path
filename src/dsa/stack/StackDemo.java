package dsa.stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        // LIFO data structure => Last-In First-Out
        // stores objects into a sort of "vertical tower"
        // push(): to add objects to the top
        // pop(): to remove objects from the top
        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack.peek()); // FFVII
        System.out.println(stack); // [Minecraft, Skyrim, DOOM, Borderlands, FFVII]

        String favGame = stack.pop();
        System.out.println(favGame); // FFVII
        System.out.println(stack); // [Minecraft, Skyrim, DOOM, Borderlands]

        System.out.println(stack.search("Minecraft")); // 4

    }
}
