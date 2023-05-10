package Election;

public class VotingRules {

    public static void main(String[] args) {

        int voterAge = 21;
        String voterName = "Khalid Dost";

        if (voterAge < 22) {

            System.out.println(voterName+" is Eligible to vote");


        }else {
            System.err.println(voterName+" is Not Eligible to vote");

        }


    }
}
