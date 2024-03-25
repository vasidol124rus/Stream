public class Main {
    public static void main(String[] args) {

        Stream stream1 = new Stream();
        StudyGroup group1 = new StudyGroup();
        StudyGroup group2 = new StudyGroup();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream();
        StudyGroup group3 = new StudyGroup();
        stream2.addGroup(group3);

        int result = StreamCorporator.compareGroups(stream1, stream2);

        System.out.println("Результат: " + result);

    }

}
