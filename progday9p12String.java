//Java program to check if a given input string is a valid Integer
import java.io.*;
import java.util.*;
public class Test
{
static boolean isNumber(String s)
{
for(int i=0;i<s,length();i++)
if(Character.isDigit(s.charAt(i))==false)
return false;
}
