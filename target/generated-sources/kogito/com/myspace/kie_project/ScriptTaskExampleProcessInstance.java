package com.myspace.kie_project;

public class ScriptTaskExampleProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<ScriptTaskExampleModel> {

    public ScriptTaskExampleProcessInstance(com.myspace.kie_project.ScriptTaskExampleProcess process, ScriptTaskExampleModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public ScriptTaskExampleProcessInstance(com.myspace.kie_project.ScriptTaskExampleProcess process, ScriptTaskExampleModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public ScriptTaskExampleProcessInstance(com.myspace.kie_project.ScriptTaskExampleProcess process, ScriptTaskExampleModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public ScriptTaskExampleProcessInstance(com.myspace.kie_project.ScriptTaskExampleProcess process, ScriptTaskExampleModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(ScriptTaskExampleModel variables) {
        return variables.toMap();
    }

    protected void unbind(ScriptTaskExampleModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
