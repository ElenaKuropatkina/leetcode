import java.util.Scanner;

public class ReverseInt {

    public int reverse(int i)
    {
        int res = 0;
        while (i != 0)
        {
            int tmp = i % 10;
            i /= 10;
            res = res * 10 + tmp;
            if (res > Integer.MAX_VALUE/10 || (res== Integer.MAX_VALUE / 10 && tmp > 7))
            {
                return 0;
            }
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && tmp < -8))
            {
                return 0;
            }
        }
        return res;
    }
}
