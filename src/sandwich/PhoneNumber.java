package sandwich;

import java.util.regex.Pattern;

public final class PhoneNumber {
    //  불 필요한 객체 생성을 피하라
    private static final Pattern PHONE = Pattern.compile("^01(?:0|1|[6-9])[-]?(\\d{4}|\\d{3})[-]?(\\d{4})$");

    private PhoneNumber() {
    }

    public static void isPhoneNumber(String s) {
        if (PHONE.matcher(s).matches()) {
            System.out.println(s + " 번호가 입력 되었습니다.");
        } else {
            System.out.println("잘못된 번호 입니다. 다시 입력 하세요.");
        }
    }
}
