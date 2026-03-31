class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(5, " Java");

        System.out.println("Modified: " + sb);

        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}