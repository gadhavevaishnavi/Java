class CharClassMethods
{
        public static void main(String argu[])
        {
            System.out.println(Character.isLetter('g')); // true
            System.out.println(Character.isLetter('6')); // false
            System.out.println(Character.isDigit('8')); // true
            System.out.println(Character.isWhitespace('\t')); // true
            System.out.println(Character.isUpperCase('k')); // false
            System.out.println(Character.isLowerCase('G')); // false
            System.out.println(Character.toUpperCase('d')); // D
            System.out.println(Character.toLowerCase('K')); // k
            System.out.println(Character.toString('S')); // S
            int type = Character.getType('1');  // Output: 1 (Letter)
            System.out.println(type);
            String s3="";
            System.out.println(s3.isEmpty());
            System.out.println(s3.isBlank());

           }


}