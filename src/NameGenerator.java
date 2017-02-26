import java.util.Random;

/**
 * Created by root on 23.02.17.
 */
public class NameGenerator {


    public String generateName(int lenght){
        StringBuilder randomName = new StringBuilder();


        String alpabet="abcdefghijklmnoprqstuwxyz";
        String consonant = "bcdfghjklmnprqstwxz";
        String vowel = "aeiouy";
        Random random = new Random();
        for(int i=0;i<lenght;i++){

            randomName.append(randomName.append(alpabet.charAt(random.nextInt(alpabet.length()))));
            if(i-1>=0 && (randomName.charAt(i-1)=='a'||randomName.charAt(i-1)=='e'
                    ||randomName.charAt(i-1)=='i'||randomName.charAt(i-1)=='o'
                    ||randomName.charAt(i-1)=='u'||randomName.charAt(i-1)=='y')) {
                randomName.append(consonant.charAt(random.nextInt(consonant.length())));
                if (randomName.length()==lenght)
                    break;
            }


        }
        return randomName.toString();
    }

    public static void main(String args[]){
        NameGenerator ng = new NameGenerator();
        System.out.println(ng.generateName(10));
    }

}
