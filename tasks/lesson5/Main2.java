package tasks.lesson5;

import java.util.Deque;
import java.util.LinkedList;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(isRightParenthSeq("<>{)"));
        System.out.println(isRightParenthSeq("<(>)"));
        System.out.println(isRightParenthSeq("<()>[]"));
        System.out.println(isRightParenthSeq("[]"));
    }

    private static boolean isRightParenthSeq(String strSrc) {
        Deque<Character> charDeque = new LinkedList<>();
        for (char tmpChar : strSrc.toCharArray()) {
            if (Character.isMirrored(tmpChar))
                if (Character.isMirrored(tmpChar + 2)) // значит левая
                    charDeque.addFirst(tmpChar);
                else charDeque.addLast(tmpChar);
        }
        if (charDeque.size() % 2 != 0) return false;
        for (int i = 0; i < charDeque.size() / 2; i++) {
            if ((charDeque.removeLast() - charDeque.removeFirst()) != 2) return false;
        }
        return true;
    }
}
