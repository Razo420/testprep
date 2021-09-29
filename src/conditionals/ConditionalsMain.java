package conditionals;

public class ConditionalsMain {
    public static void main(String[] args) {
        ConditionalExercises exercises = new ConditionalExercises();

        //Calculator
        int operand1 = (int) (Math.random() * 10);
        int operand2 = (int) (Math.random() * 10);
        String operator;
        if (args.length > 0) {
            operator = args[0];
        } else {
            operator = "add";
        }
        double result = exercises.calculator(operand1,operand2,operator);
        System.out.println("Result is : " + result);
//        Deciding number
        int value = (int) (Math.random() * 100);
      exercises.printNumberDescription(value);
        }
    }



