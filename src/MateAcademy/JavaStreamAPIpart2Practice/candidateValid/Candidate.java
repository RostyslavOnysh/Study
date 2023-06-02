package MateAcademy.JavaStreamAPIpart2Practice.candidateValid;

import java.util.Objects;

public class Candidate {
    private int age;
    private String nationality;
    private boolean allowedToVote;
    private String periodsInUkr;
    private String name;

    public Candidate(int age, String nationality, boolean allowedToVote, String periodsInUkr) {
        this.age = age;
        this.nationality = nationality;
        this.allowedToVote = allowedToVote;
        this.periodsInUkr = periodsInUkr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isAllowedToVote() {
        return allowedToVote;
    }

    public void setAllowedToVote(boolean allowedToVote) {
        this.allowedToVote = allowedToVote;
    }

    public String getPeriodsInUkr() {
        return periodsInUkr;
    }

    public void setPeriodsInUkr(String periodsInUkr) {
        this.periodsInUkr = periodsInUkr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Candidate candidate = (Candidate) o;
        return age == candidate.age
                && allowedToVote == candidate.allowedToVote
                && Objects.equals(nationality, candidate.nationality)
                && Objects.equals(periodsInUkr, candidate.periodsInUkr)
                && Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getNationality(),
                isAllowedToVote(), getPeriodsInUkr(), getName());
    }
}

