public class FizzBuzz {
    public String getValue(int val) {
        String newString = val + "";

        if ((val % 5 == 0) && (val % 3 == 0))
            return "Fizz Buzz";
        if (val % 3 == 0)
            return "Fizz";
        if (val % 5 == 0)
            return "Buzz";


        return newString;
    }

    public String getOverallString() {
        String j = "";
        for (int i =1; i < 16; i++ ) {
            j += getValue(i) + "\n";
        }
        return j;
    }
}
