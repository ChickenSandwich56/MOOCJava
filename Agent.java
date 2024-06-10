public class Agent {
    private String agentfirstName;
    private String agentSecondName;

    public Agent(String initialAgentfirstName, String initialAgentSecondName)
    {
        this.agentfirstName = initialAgentfirstName;
        this.agentSecondName = initialAgentSecondName;
    }

    public String toString()
    {
        return this.agentfirstName + " " +this.agentSecondName;
    }

}
