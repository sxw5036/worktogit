package com.lwxf.industry4.webapp.common.utils.WeiXin;

import java.security.MessageDigest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: SunXianWei
 * @Date: 2020/07/11/8:49
 * @Description:
 */
public class MD5Utils {
    private static String byteArrayToHexString(byte[] b) {

        StringBuffer resultSb = new StringBuffer();

        for (int i = 0; i < b.length; i++)

            resultSb.append(byteToHexString(b[i]));


        return resultSb.toString();

    }


    private static String byteToHexString(byte b) {

        int n = b;

        if (n < 0)

            n += 256;

        int d1 = n / 16;

        int d2 = n % 16;

        return hexDigits[d1] + hexDigits[d2];

    }


    static String MD5Encode(String origin, String charsetname) {

        String resultString = null;

        try {

            resultString = new String(origin);

            MessageDigest md = MessageDigest.getInstance("MD5");

            if (charsetname == null || "".equals(charsetname))

                resultString = byteArrayToHexString(md.digest(resultString

                        .getBytes()));

            else

                resultString = byteArrayToHexString(md.digest(resultString

                        .getBytes(charsetname)));

        } catch (Exception exception) {

        }

        return resultString;

    }


    private static final String[] hexDigits = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

}
