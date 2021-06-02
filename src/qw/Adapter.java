package qw;

public class Adapter implements NewJuicer{
    private OldJuicer oldJuicer;
    @Override
    public String newPort(Fruit fruit1, Fruit fruit2) {
        oldJuicer=new OldJuicer();
        String str="混合果汁："+oldJuicer.oldPort(fruit1);
        String str2 =str+"混合"+oldJuicer.oldPort(fruit2);
        return str2;
    }
}
