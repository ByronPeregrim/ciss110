public class PeregrimFunWithStrings
{
    public static void main(String[] args)
    {
        String school = "Hudson Valley Community College";
        System.out.println(school.length());

        int schoolLength = school.length();
        System.out.println(schoolLength);

        char letterV = school.charAt(7);
        System.out.println(letterV);

        System.out.println(school.toLowerCase());
        System.out.println(school.toUpperCase());

        String course = "CISS 110";

        int indexOfSpace = course.indexOf(" ");
        String deptCode = course.substring(0, indexOfSpace);

        int bIndex2 = indexOfSpace + 1;
        int endIndex2 = course.length();
        String courseNumber = course.substring(bIndex2, endIndex2);
        
        System.out.println(deptCode);
        System.out.println(courseNumber);
    }
}