class Solution {

    public String encode(List<String> strs) {
        String enc=new String();
        for(String word:strs){

           
            enc=enc+"#";
            enc=enc+word;

        }
        return enc;

    }

    public List<String> decode(String str) {
        String[]arr=str.split("#");
        List<String>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        return ans;



    }
}
