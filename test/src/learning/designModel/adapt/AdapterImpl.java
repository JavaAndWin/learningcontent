package learning.designModel.adapt;

public class AdapterImpl implements Adapter {
    private NetWired netWired = new NetWired();
    @Override
    public void adapt() {
        netWired.online();
    }
}
