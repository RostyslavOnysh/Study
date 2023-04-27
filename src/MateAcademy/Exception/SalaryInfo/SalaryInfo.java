package MateAcademy.Exception.SalaryInfo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalaryInfo {

    public static final int DATE_INDEX = 0;
    public static final int NAME_INDEX = 0;
    public static final int RATE_INDEX = 0;
    public static final int TIME_INDEX = 0;
    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public String getSalaryInfo(String[] names, String[] data, String dateFrom, String dateTo) {
        // create string builder with report`s header :
        StringBuilder builder = new StringBuilder().append("Report for period : ")
                .append(dateFrom).append(" - ").append(dateTo);
        // iterate in array names to check all names and append new line and " - "
        for (String iterationNames : names) {
            builder.append(System.lineSeparator());
            builder.append(iterationNames).append(" - ");
            // check correct data and compare data with dd mm yyyy
            LocalDate localDateFrom = LocalDate.parse(dateFrom, timeFormatter);
            LocalDate localDateTo = LocalDate.parse(dateTo, timeFormatter);
            // create int variable where I save sum of salary
            int sumSalary = 0;
            // let`s start to iteration in date array
            for (String iterationData : data) {
                // split the array using .split(" "); command.We split array with whitespace
                // create new String array
                String[] splitter = iterationData.split(" ");
                // used to parse a string representation of a date (stored in whiteSpace[DATE_INDEX]) using
                // a DateTimeFormatter named timeFormatter and store it in the workDay variable.
                LocalDate workDay = LocalDate.parse(splitter[DATE_INDEX], timeFormatter);
                String name = splitter[NAME_INDEX];
                // if name ==iteration name
                if (name.equals(iterationNames)) {
                    if (!workDay.isAfter(localDateTo) && !workDay.isBefore(localDateFrom)) {
                        sumSalary += Integer.parseInt(splitter[RATE_INDEX])
                                *
                                Integer.parseInt(splitter[TIME_INDEX]);

                    }
                }
            }
            builder.append(sumSalary);
        }


        return builder.toString();
    }
}