import java.util.*;
import java.text.SimpleDateFormat;

class DateTime
{
    public static void main(String[] args)
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("y-MMM-dd");
        String formattedDate = sdf.format(date);
        System.out.println(date);
        System.out.println(formattedDate);
    }
}

/*
d-> day -> 1 or 12
dd -> two digit day -> 01 or 12
M -> month -> 6 or 12
MM -> two digit month -> 06 or 12
MMM -> name of the month -> Jun
y -> year -> 2019
yy -> last two digits of the year -> 19
yyyy -> full year -> 2019

h-> hour of the day -> 12 hour format
H -> hour of the day -> 24 hour format
hh -> hour in two digits -> 01
m -> minute
s -> seconds 

a -> AM/PM
E -> Name of the day
*/