import java.util.Scanner;

public class Colloq {
    public static Integer size;
    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        String str1 = cin.next();
        String str2 = cin.next();

        if(isInt(str1)|| isDouble(str1))
        {
            while(isInt(str1) || isDouble(str1))
            {
                System.out.println("The first line shouldn't be a number. Enter a new line.");
                str1 = cin.next();
            }
            if(isInt(str2) && !isDouble(str2))
            {
                size = Integer.parseInt(str2);
                if(size > 0)
                {
                    String temp = str1;
                    for (int i = 1; i < size; i++)
                    {
                        str1 += temp;
                    }
                }
                else if(size == 0) str1 = "";
                else if(size < 0)
                {
                    while(size < 0)
                    {
                        System.out.println("The number cannot be less than zero. Enter a new number or string.");
                        str2 = cin.next();
                        if(isInt(str2)) {
                            size = Integer.parseInt(str2);
                        }
                        else
                        {
                            size = -1;
                            break;
                        }
                    }
                    if(size == -1)
                    {
                        str1 += str2;
                    }
                    else if(size == 0) str1 = "";
                    else
                    {
                        String temp = str1;
                        for (int i = 1; i < size; i++)
                        {
                            str1 += temp;
                        }
                    }
                }
            }
            else if(isDouble(str2))
            {
                while(isDouble(str2) && !isInt(str2))
                {
                    System.out.println("The entered number must be an integer. Enter a new number or string.");
                    str2 = cin.next();
                }
                if(isInt(str2))
                {
                    size = Integer.parseInt(str2);
                    if(size > 0)
                    {
                        String temp = str1;
                        for (int i = 1; i < size; i++)
                        {
                            str1 += temp;
                        }
                    }
                    else if(size == 0) str1 = "";
                    else if(size < 0)
                    {
                        while(size < 0)
                        {
                            System.out.println("The number cannot be less than zero. Enter a new number or string.");
                            str2 = cin.next();
                            if(isInt(str2))
                            {
                                size = Integer.parseInt(str2);
                            }
                            else {
                                size = -1;
                                break;
                            }
                        }
                        if(size == -1)
                        {
                            str1 += str2;
                        }
                        else if(size == 0) str1 = "";
                        else {
                            String temp = str1;
                            for (int i = 1; i < size; i++)
                            {
                                str1 += temp;
                            }
                        }
                    }
                }
                else{
                    str1 += str2;
                }
            }
            else {
                str1 += str2;
            }
        }
        else if(isInt(str2) && !isDouble(str2))
        {
            size = Integer.parseInt(str2);
            if(size > 0) {
                String temp = str1;
                for (int i = 1; i < size; i++)
                {
                    str1 += temp;
                }
            }
            else if(size == 0) str1 = "";
            else if(size < 0){
                while(size < 0) {
                    System.out.println("Число не может быть меньше нуля. Введите новое число или строку.");
                    str2 = cin.next();
                    if(isInt(str2))
                    {
                        size = Integer.parseInt(str2);
                    }
                    else {
                        size = -1;
                        break;
                    }
                }
                if(size == -1)
                {
                    str1 += str2;
                }
                else if(size == 0) str1 = "";
                else
                {
                    String temp = str1;
                    for (int i = 1; i < size; i++)
                    {
                        str1 += temp;
                    }
                }
            }
        }
        else if(isDouble(str2))
        {
            while(isDouble(str2) && !isInt(str2))
            {
                System.out.println("The entered number must be an integer. Enter a new number or string.");
                str2 = cin.next();
            }
            if(isInt(str2)){
                size = Integer.parseInt(str2);
                if(size > 0) {
                    String temp = str1;
                    for (int i = 1; i < size; i++)
                    {
                        str1 += temp;
                    }
                }
                else if(size == 0) str1 = "";
                else if(size < 0){
                    while(size < 0) {
                        System.out.println("The number cannot be less than zero. Enter a new number or string.");
                        str2 = cin.next();
                        if(isInt(str2)) {
                            size = Integer.parseInt(str2);
                        }
                        else
                        {
                            size = -1;
                            break;
                        }
                    }
                    if(size == -1){
                        str1 += str2;
                    }
                    else if(size == 0) str1 = "";
                    else {
                        String temp = str1;
                        for (int i = 1; i < size; i++)
                        {
                            str1 += temp;
                        }
                    }
                }
            }
        }
        else {
            str1 += str2;
        }
        System.out.println(str1);
    }
}