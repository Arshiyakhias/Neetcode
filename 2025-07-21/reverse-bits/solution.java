class Solution {
    public int reverseBits(int n) {
        String bin=new String();
        while(n!=0){
            int fin=n%10;
            bin=bin+fin;
            n=n/10;
        }
        return Integer.parseInt(bin,2);
    }
}
