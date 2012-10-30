package archipelago.network;

import archipelago.compute.ProcessManager;

public interface ProcessListener
{
    
    public boolean processFinished(ProcessManager<?, ?> process);
    
}
