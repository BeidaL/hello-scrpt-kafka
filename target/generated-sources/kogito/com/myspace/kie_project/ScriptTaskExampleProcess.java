package com.myspace.kie_project;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("scriptTaskExample")
@io.quarkus.runtime.Startup()
public class ScriptTaskExampleProcess extends org.kie.kogito.process.impl.AbstractProcess<com.myspace.kie_project.ScriptTaskExampleModel> {

    @javax.inject.Inject()
    public ScriptTaskExampleProcess(org.kie.kogito.app.Application app) {
        super(app, java.util.Arrays.asList());
        activate();
    }

    public ScriptTaskExampleProcess() {
    }

    @Override()
    public com.myspace.kie_project.ScriptTaskExampleProcessInstance createInstance(com.myspace.kie_project.ScriptTaskExampleModel value) {
        return new com.myspace.kie_project.ScriptTaskExampleProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.myspace.kie_project.ScriptTaskExampleProcessInstance createInstance(java.lang.String businessKey, com.myspace.kie_project.ScriptTaskExampleModel value) {
        return new com.myspace.kie_project.ScriptTaskExampleProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public com.myspace.kie_project.ScriptTaskExampleModel createModel() {
        return new com.myspace.kie_project.ScriptTaskExampleModel();
    }

    public com.myspace.kie_project.ScriptTaskExampleProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.myspace.kie_project.ScriptTaskExampleModel) value);
    }

    public com.myspace.kie_project.ScriptTaskExampleProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.myspace.kie_project.ScriptTaskExampleModel) value);
    }

    public com.myspace.kie_project.ScriptTaskExampleProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.myspace.kie_project.ScriptTaskExampleProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.myspace.kie_project.ScriptTaskExampleProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.myspace.kie_project.ScriptTaskExampleProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("scriptTaskExample");
        factory.variable("input", new ObjectDataType("java.lang.String", com.myspace.kie_project.ScriptTaskExampleProcess.class.getClassLoader()), "customTags", null);
        factory.name("scriptTaskExample");
        factory.packageName("com.myspace.kie_project");
        factory.dynamic(false);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode1 = factory.startNode(1);
        startNode1.name("Start");
        startNode1.interrupting(false);
        startNode1.metaData("TriggerMapping", "input");
        startNode1.metaData("UniqueId", "_5FC4E8AB-A2D7-4C55-852D-EB511D9A383A");
        startNode1.metaData("TriggerType", "ConsumeMessage");
        startNode1.metaData("x", 138);
        startNode1.metaData("width", 56);
        startNode1.metaData("y", 236);
        startNode1.metaData("TriggerRef", "quickstart");
        startNode1.metaData("MessageType", "String");
        startNode1.metaData("height", 56);
        startNode1.done();
        startNode1.trigger("quickstart", "input", "event");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode2 = factory.actionNode(2);
        actionNode2.name("Helloscript");
        actionNode2.action(kcontext -> {
            java.lang.String input = (java.lang.String) kcontext.getVariable("input");
            System.out.println("Hello World");
            kcontext.setVariable("input", "Hello World");
        });
        actionNode2.metaData("UniqueId", "_5CB6D352-03D2-4F76-A338-47A2FDA26E05");
        actionNode2.metaData("elementname", "Helloscript");
        actionNode2.metaData("NodeType", "ScriptTask");
        actionNode2.metaData("x", 266);
        actionNode2.metaData("width", 154);
        actionNode2.metaData("y", 213);
        actionNode2.metaData("height", 102);
        actionNode2.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode3 = factory.endNode(3);
        endNode3.name("End");
        endNode3.terminate(false);
        endNode3.metaData("UniqueId", "_FC886049-2405-43BC-B1B6-927B3079ACE2");
        endNode3.metaData("x", 535);
        endNode3.metaData("width", 56);
        endNode3.metaData("y", 236);
        endNode3.metaData("height", 56);
        endNode3.done();
        factory.connection(1, 2, "_8F1FA234-39C9-49BD-9761-1C7C9BB58F39");
        factory.connection(2, 3, "_BB47F436-EF04-43FF-BBFE-F48738BA6591");
        factory.validate();
        return factory.getProcess();
    }
}
