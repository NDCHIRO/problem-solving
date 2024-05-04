class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arrV1 = version1.split("\\.");
        String[] arrV2 = version2.split("\\.");
        int maxLength = (arrV1.length>arrV2.length)? arrV1.length:arrV2.length;
        for(int i=0 ; i<maxLength;i++)
        {
            int numberV1 = i<arrV1.length? Integer.parseInt(arrV1[i]):0;
            int numberV2 = i<arrV2.length? Integer.parseInt(arrV2[i]):0;
            
            if(numberV1 > numberV2)
            return 1;
            else if(numberV2 > numberV1)
            return -1;
        }
        return 0;
    }
}