
public class Outer {

    class InnerA
    {
        private String text;
    }
    class InnerB extends InnerA
    {
        public void setText(String text)
        {
            InnerA innerA = this;
            innerA.text = text;
        }
        public String getText()
        {
            return ((InnerA) this).text;
        }
    }
    public static void main(String[] args)
    {
        final InnerB innerB = new Outer().new InnerB();
        innerB.setText("hello world");
        System.out.println(innerB.getText());
    }
}
