class Solution {
    public String[] createGrid(int m, int n) {
        String[] st=new String[m];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(i==0){
                sb.append(".");
            }else{
                sb.append("#");
            }
        }
        for(int i=0;i<m-1;i++){
            st[i]=sb.toString();
        }
        String newst=sb.toString().replace('#','.');
        st[m-1]=newst;
        return st;
    }
}