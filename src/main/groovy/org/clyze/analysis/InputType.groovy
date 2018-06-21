package org.clyze.analysis

enum InputType {
    INPUT("input", [ResolverType.LOCAL_FILE, ResolverType.URL, ResolverType.MAVEN_ARTIFACT]),
    LIBRARY("library", [ResolverType.LOCAL_FILE, ResolverType.URL, ResolverType.MAVEN_ARTIFACT]),
    PLATFORM("platform", [ResolverType.LOCAL_FILE, ResolverType.URL, ResolverType.ZIP]),
    HPROF("heap dump", [ResolverType.LOCAL_FILE, ResolverType.URL, ResolverType.ZIP]),

    private final String title
    private final Set<ResolverType> resolvers

    InputType(String title, List<ResolverType> resolvers) {
        this.title = title
        this.resolvers = resolvers as Set
    }

    String toString() { title }

    Set<ResolverType> getResolverTypes() { resolvers }
}
