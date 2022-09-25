class Solution {
    public String interpret(String command) {
        String res = command.replace("()", "o");
        res = res.replace("(al)", "al");

        System.out.println(res);
        return res;
    }
}