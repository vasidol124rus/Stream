public class StreamCorporator {
    public static int compareGroups(Stream stream1, Stream stream2){
        int groupCount1 = 0;
        int groupCount2 = 0;

        for (StudyGroup group : stream1) {
            groupCount1++;
        }

        for (StudyGroup group : stream2) {
            groupCount2++;
        }
        return Integer.compare(groupCount1, groupCount2);
    }

}
