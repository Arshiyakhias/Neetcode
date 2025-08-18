class Solution {

    public String encode(List<String> strs) {
        String str=new String();
        for(int i=0;i<strs.size();i++){
            str=str+strs.get(i);
            str=str+'#';


        }
        return str;

    }

    public List<String> decode(String str) {
        String[]arr=str.split("#");
        List<String>ans=new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        
        return ans;


    }
}
