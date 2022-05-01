import onjava.Operation;

class Bing implements Operation {
    @Override
    public void execute() {
        Operation.show("Bing");
    }
}

class Crack implements Operation {
    @Override
    public void execute() {
        Operation.show("Crack");
    }
}

class Twist implements Operation {
    @Override
    public void execute() {
        Operation.show("Twist");
    }
}

public class Machine {
    public static void main(String[] args) {
        Operation.runOps(
                new Bing(), new Crack(), new Twist()
        );
    }
}
