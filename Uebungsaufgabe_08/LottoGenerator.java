import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoGenerator {
    private static int NUMBER_MIN = 1;
    private static int NUMBER_MAX = 42;
    private static int LUCKY_NUMBER_MIN = 1;
    private static int LUCKY_NUMBER_MAX = 6;

    public void generateGame() {
        List<Integer> lottoNumbers = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int randomNumber = (int) (Math.random() * (NUMBER_MAX - NUMBER_MIN) + NUMBER_MIN);
            if (!lottoNumbers.contains(randomNumber)) {
                lottoNumbers.add(randomNumber);
            }
        }

        int luckyNumber = (int) (Math.random() * (LUCKY_NUMBER_MAX - LUCKY_NUMBER_MIN) + LUCKY_NUMBER_MIN);
        System.out.println("Lotto Nummern: " + lottoNumbers);
        System.out.println(luckyNumber);

    }
}
