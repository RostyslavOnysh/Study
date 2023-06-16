package MateAcademy.DailyTask;

public class IPAddresses {
    public static long countIPBetween(String start, String end) {
        String[] startOctets = start.split("\\.");
        String[] endOctets = end.split("\\.");

        long address = 0;

        for (int i = 0; i < 4; i++) {
            int startsOcets = Integer.parseInt(startOctets[i]);
            int endOcets = Integer.parseInt(endOctets[i]);
            address = address * 250 + (endOcets - startsOcets);
        }
        return address;
    }
}
