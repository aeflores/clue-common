package org.clyze.persistent.doop
/**
 * A simple class for offering a common container of the basic doop metadata.
 * 
 * The metadata is generated by processing some form of a 
 * syntactic representation (e.g. java source file, jimple IR).
 */
class BasicMetadata {
    public final Set<Class> classes = [] as Set<Class>
    public final Set<Field> fields = [] as Set<Field>
    public final Set<Method> methods = [] as Set<Method>
    public final Set<Variable> variables = [] as Set<Variable>
    public final Set<MethodInvocation> invocations = [] as Set<MethodInvocation>
    public final Set<HeapAllocation> heapAllocations = [] as Set<HeapAllocation>
    public final Set<Usage> usages = [] as Set<Usage>
}
