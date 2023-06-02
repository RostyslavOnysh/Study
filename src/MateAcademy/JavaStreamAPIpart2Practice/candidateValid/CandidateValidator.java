package MateAcademy.JavaStreamAPIpart2Practice.candidateValid;

import java.util.function.Predicate;

public class CandidateValidator implements Predicate<Candidate> {

    private static final int MIN_AGE = 35;
    private static final int MIN_PERIOD = 10;
    private static final String NATIONALITY = "Ukrainian";

    @Override
    public boolean test(Candidate candidate) {
        return candidate.getAge() >= MIN_AGE
                && candidate.isAllowedToVote()
                && candidate.getNationality().equals(NATIONALITY)
                && hasMinPeriodInUkraine(candidate);
    }

    private boolean hasMinPeriodInUkraine(Candidate candidate) {
        int periodInUkr = calculatePeriodInUkraine(candidate.getPeriodsInUkr());
        return periodInUkr >= MIN_PERIOD;
    }

    private int calculatePeriodInUkraine(String period) {
        String[] years = period.split("-");
        return Integer.parseInt(years[1]) - Integer.parseInt(years[0]);
    }

}
