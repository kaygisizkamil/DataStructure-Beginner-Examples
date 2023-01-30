import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        // user declared
        int tmp = -1;
        boolean success = true;
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);
            tmp = position;

            if (next == '(' || next == '[' || next == '{') {
                Bracket bracket = new Bracket(next, position);
                opening_brackets_stack.push(bracket);
                // Process opening bracket, write your code here
            }

            if (next == ')' || next == ']' || next == '}') {
                // Check if the stack is empty
                if (opening_brackets_stack.empty()) {
                    System.out.println(position+1);
                    success = false;
                    break;
                }
                // Get the top bracket from the stack
                Bracket topBracket = opening_brackets_stack.peek();
                // Check if the current closing bracket matches the top bracket
                if (!topBracket.Match(next)) {
                    System.out.println(position+1);
                    success = false;
                    break;
                } else {
                    opening_brackets_stack.pop();
                }

                // Process closing bracket, write your code here
            }
        }
        if (success && opening_brackets_stack.empty()) {
            System.out.println("Success");
        }
        // If there are any brackets left in the stack, there is an unmatched opening
        // output should be one indexed e.g { input print 1 not 0 or -1
        else if(success) {
            int index = text.length();
            for (Bracket bracket : opening_brackets_stack) {
                index = Math.min(index, bracket.position);
            }
            System.out.println(index + 1);
        }
    }
}
class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}

