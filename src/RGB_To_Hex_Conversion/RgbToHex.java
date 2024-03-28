package RGB_To_Hex_Conversion;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {

        int R = r > 255 ? 255 : Math.max(r, 0);
        int G = g > 255 ? 255 : Math.max(g, 0);
        int B = b > 255 ? 255 : Math.max(b, 0);

        String hexR = Integer.toHexString(R).toUpperCase();
        String hexG = Integer.toHexString(G).toUpperCase();
        String hexB = Integer.toHexString(B).toUpperCase();

        return (hexR.length() < 2 ? "0" + hexR : hexR) +
                (hexG.length() < 2 ? "0" + hexG : hexG) +
                (hexB.length() < 2 ? "0" + hexB : hexB);
    }
}


