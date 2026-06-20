class P13_RomanToInteger {
    public int romanToInt(String s) {
        int i = 0, num = 0;

        while (i < s.length())
        {
            switch (s.charAt(i))
            {
                case 'I':
                    if ((i + 1) < s.length() && s.charAt(i+1) == 'V')
                    {
                        num += 4;
                        i += 2;
                        break;
                    }
                    else if ((i + 1) < s.length() && s.charAt(i+1) == 'X')
                    {
                        num += 9;
                        i += 2;
                        break;
                    }
                    else
                    {
                        num += 1;
                        i += 1;
                        break;
                    }
                case 'V':
                    num += 5;
                    i += 1;
                    break;
                case 'X':
                    if ((i + 1) < s.length() && s.charAt(i+1) == 'L')
                    {
                        num += 40;
                        i += 2;
                        break;
                    }
                    else if ((i + 1) < s.length() && s.charAt(i+1) == 'C')
                    {
                        num += 90;
                        i += 2;
                        break;
                    }
                    else
                    {
                        num += 10;
                        i += 1;
                        break;
                    }
                case 'L':
                    num += 50;
                    i += 1;
                    break;
                case 'C':
                    if ((i + 1) < s.length() && s.charAt(i+1) == 'D')
                    {
                        num += 400;
                        i += 2;
                        break;
                    }
                    else if ((i + 1) < s.length() && s.charAt(i+1) == 'M')
                    {
                        num += 900;
                        i += 2;
                        break;
                    }
                    else
                    {
                        num += 100;
                        i += 1;
                        break;
                    }
                case 'D':
                    num += 500;
                    i += 1;
                    break;
                case 'M':
                    num += 1000;
                    i += 1;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        return num;
    }
}