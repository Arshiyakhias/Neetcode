class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st=new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(temperatures[i]);
                temperatures[i]=0;
              
            
            }
            else if(st.peek()>temperatures[i]){
                st.push(temperatures[i]);
                temperatures[i]=st.peek();
            }
            else if(st.peek()<temperatures[i]){
                while(st.peek()<=temperatures[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(temperatures[i]);
                    temperatures[i]=0;

                }
                else{
                    st.push(temperatures[i]);
                    temperatures[i]=st.peek();

                }
            }
        }
        return temperatures;
    }
}
