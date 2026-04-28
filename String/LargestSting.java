public classLargestSting  {
    public static void main(String[] args) {
        String names[] = { "Sanket" , "Dhanraj" , "Tejas"};
        String largestStr = names [0];
        for (int i = 0 ; i<names.length; i++){
if(largestStr.compareTo(names[i])<0){
    largestStr = names[i];
    // largest mean = a>b>c>d.....>z

}
        }
        System.out.println(largestStr);

    }
}
