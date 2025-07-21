class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(String word:strs){
            String[]arr=word.split("");
            Arrays.sort(arr);
            String sorts=new String();
            for(int i=0;i<arr.length;i++){
                sorts=sorts+arr[i];
            }
            if(map.containsKey(sorts)){
                map.get(sorts).add(word);

            }
            else{
                map.put(sorts,new ArrayList<>());
                map.get(sorts).add(word);
            }

        }

        List<List<String>> lis = new ArrayList<>(map.values());

        return lis;
    }
}
