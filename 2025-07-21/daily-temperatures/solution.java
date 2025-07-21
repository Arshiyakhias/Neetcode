class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st=new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(temperatures[i]);
                temperatures[i]=0;
              
            
            }
            else if(st.peek()>temperatures[i]){
                int curr=temperatures[i];
                temperatures[i]=st.peek();
                st.push(curr);
                
            }
            else if(st.peek()<temperatures[i]){
                while(!st.isEmpty() && st.peek()<=temperatures[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(temperatures[i]);
                    temperatures[i]=0;

                }
                else{
                    int curr1=temperatures[i];
                    temperatures[i]=st.peek();
                    st.push(curr1);
                    

                }
            }
        }
        return temperatures;
    }
}
