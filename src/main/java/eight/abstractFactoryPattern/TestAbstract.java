package eight.abstractFactoryPattern;

public class TestAbstract {


    public static void main(String[] args) {
        JobRunner runner = getJobRunner();
        runner.runTheJob();
    }

    private static JobRunner getJobRunner() {
        JobRunner jobRunner;
        AbstractFactory abstractFactory;
        //get OS by system.properties
        String os = "windows";
        if (os.equalsIgnoreCase("windows")) {
            abstractFactory = new WindonsFactory();
            jobRunner = new JobRunner(abstractFactory);
        } else {
            abstractFactory = new MacFactory();
            jobRunner = new JobRunner(abstractFactory);
        }
        return jobRunner;


    }
}
