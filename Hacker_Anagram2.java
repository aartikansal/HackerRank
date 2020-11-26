import java.util.Scanner;

public class Hacker_Anagram2 {
    static boolean isAnagram(String s1, String s2) {
        //Removing white spaces from s1 and s2 and changing case to lower
        // Hacker rank environment doesn't support regex
        String copyOfs1 = s1.replaceAll("\s", "").toLowerCase();

        String copyOfs2 = s2.replaceAll("\s", "").toLowerCase();

        //Initially setting status as true

        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

            status = false;
        } else {
            //Converting copyOfs1 to char array

            char[] s1ToArray = copyOfs1.toCharArray();

            //Checking whether each character of s1ToArray is present in copyOfs2

            for (char c : s1ToArray) {
                int index = copyOfs2.indexOf(c);

                if (index != -1) {
                    //If character is present in copyOfs2, removing that char from copyOfs2

                    copyOfs2 = copyOfs2.substring(0, index) + copyOfs2.substring(index + 1, copyOfs2.length());
                } else {
                    //If character is not present in copyOfs2, setting status as false and breaking the loop

                    status = false;

                    break;
                }
            }
        }

        //Output

        if (status) {
            return true;
        } else {
      return false;
        }

    }


        public static void main (String[]args)
        {
            Scanner scan = new Scanner(System.in);
            String s1 = scan.next();
            String s2 = scan.next();
            scan.close();
            boolean ret = isAnagram(s1, s2);
            System.out.println((ret) ? " are anagrams" : " are not anagrams");
        }
    }





