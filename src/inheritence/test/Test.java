package inheritence.test;

public class Test {
    private String nameTest;
    private String[] question;

    public Test(String nameTest, String[] question) {
        this.nameTest = nameTest;
        this.question = question;
    }

    public String getNameTest() {
        return nameTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }

    public String[] getQuestion() {
        return question;
    }

    public void setQuestion(String[] question) {
        this.question = question;
    }

    public Test() {

    }
}
