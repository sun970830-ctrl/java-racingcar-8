package racingcar.game;

import camp.nextstep.edu.missionutils.Randoms;

public class Rule {
    public static boolean RandomGo() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }
}