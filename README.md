Demo of issue with classes that extends sealed class.

```log
!MESSAGE Error computing hover
!STACK 0
java.lang.NullPointerException: Cannot read the array length because "superPermittedTypes" is null
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsAndAdd(SourceTypeBinding.java:1346)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsInType(SourceTypeBinding.java:1202)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.faultInTypesForFieldsAndMethods(SourceTypeBinding.java:1116)
	at org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope.faultInTypes(CompilationUnitScope.java:608)
	at org.eclipse.jdt.internal.codeassist.SelectionEngine.select(SelectionEngine.java:1076)
	at org.eclipse.jdt.internal.core.Openable.codeSelect(Openable.java:166)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeSelect(CompilationUnit.java:382)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeSelect(CompilationUnit.java:375)
	at org.eclipse.jdt.ls.core.internal.JDTUtils.findElementsAtSelection(JDTUtils.java:1036)
	at org.eclipse.jdt.ls.core.internal.HoverInfoProvider.computeHover(HoverInfoProvider.java:101)
	at org.eclipse.jdt.ls.core.internal.handlers.HoverHandler.computeHover(HoverHandler.java:57)
	at org.eclipse.jdt.ls.core.internal.handlers.HoverHandler.hover(HoverHandler.java:43)
	at org.eclipse.jdt.ls.core.internal.handlers.JDTLanguageServer.lambda$5(JDTLanguageServer.java:666)
	at org.eclipse.jdt.ls.core.internal.BaseJDTLanguageServer.lambda$0(BaseJDTLanguageServer.java:87)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(Unknown Source)
	at java.base/java.util.concurrent.CompletableFuture$Completion.exec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool.scan(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)
```

## Full Log

```log
!SESSION 2024-04-30 09:41:14.265 -----------------------------------------------
eclipse.buildId=unknown
java.version=17.0.10
java.vendor=Eclipse Adoptium
BootLoader constants: OS=win32, ARCH=x86_64, WS=win32, NL=en_US
Framework arguments:  --pipe=\\.\pipe\lsp-7ac86e6d8c0998b356a957e238d693cf-sock
Command-line arguments:  -data c:\Users\me\AppData\Roaming\Code\User\workspaceStorage\4d8abd9b37c18198b530c5886cc478c5\redhat.java\jdt_ws --pipe=\\.\pipe\lsp-7ac86e6d8c0998b356a957e238d693cf-sock

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:19.362
!MESSAGE class org.eclipse.jdt.ls.core.internal.JavaLanguageServerPlugin is started

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:20.371
!MESSAGE Main thread is waiting

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:20.590
!MESSAGE >> initialize

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:20.597
!MESSAGE Initializing Java Language Server 1.35.0.202404250410

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:20.599
!MESSAGE Started org.eclipse.m2e.core 0ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:21.847
!MESSAGE ProjectRegistryRefreshJob finished 1247ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:21.882
!MESSAGE Started org.eclipse.buildship.core 33ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.022
!MESSAGE Setting C:\Program Files\Java\jdk-22 as 'JavaSE-22' environment (id:1714462881998)

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.026
!MESSAGE Setting java.home C:\Program Files\Java\jdk-22 as default global VM

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.039
!MESSAGE Default VM Install changed from  1714462881960-C:\Users\me\.vscode\extensions\redhat.java-1.30.0-win32-x64\jre\17.0.10-win32-x86_64 to 1714462881998-C:\Program Files\Java\jdk-22

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.067
!MESSAGE JVM Runtimes changed, saving new configuration

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.145
!MESSAGE Static Commands: []

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.146
!MESSAGE Non-Static Commands: [java.project.import, java.project.changeImportedProjects, java.navigate.openTypeHierarchy, java.project.resolveStackTraceLocation, java.edit.handlePasteEvent, java.edit.stringFormatting, java.project.getSettings, java.project.resolveWorkspaceSymbol, java.project.upgradeGradle, java.project.createModuleInfo, java.vm.getAllInstalls, java.edit.organizeImports, java.project.refreshDiagnostics, java.project.removeFromSourcePath, java.project.listSourcePaths, java.project.getAll, java.reloadBundles, java.project.isTestFile, java.project.resolveText, java.project.getClasspaths, java.navigate.resolveTypeHierarchy, java.edit.smartSemicolonDetection, java.project.updateSourceAttachment, java.project.updateClassPaths, java.decompile, java.protobuf.generateSources, java.project.resolveSourceAttachment, java.project.updateJdk, java.project.addToSourcePath, java.completion.onDidSelect]

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.147
!MESSAGE Static Commands: []

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.148
!MESSAGE Non-Static Commands: [java.intellicode.enable]

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.149
!MESSAGE Static Commands: []

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.150
!MESSAGE Non-Static Commands: [vscode.java.checkProjectSettings, vscode.java.isOnClasspath, vscode.java.fetchUsageData, vscode.java.validateLaunchConfig, vscode.java.resolveInlineVariables, vscode.java.resolveClassFilters, vscode.java.resolveMainMethod, vscode.java.resolveClasspath, vscode.java.resolveBuildFiles, vscode.java.resolveMainClass, vscode.java.updateDebugSettings, vscode.java.resolveSourceUri, vscode.java.fetchPlatformSettings, vscode.java.buildWorkspace, vscode.java.startDebugSession, vscode.java.inferLaunchCommandLength, vscode.java.resolveElementAtSelection, vscode.java.resolveJavaExecutable]

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.154
!MESSAGE Static Commands: []

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.155
!MESSAGE Non-Static Commands: [java.project.refreshLib, java.project.checkImportStatus, java.project.list, java.project.generateJar, java.project.getMainClasses, java.getPackageData, java.resolvePath]

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.158
!MESSAGE Static Commands: []

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.158
!MESSAGE Non-Static Commands: [vscode.java.test.jacoco.getCoverageDetail, vscode.java.test.findJavaProjects, vscode.java.test.findTestPackagesAndTypes, vscode.java.test.findTestTypesAndMethods, vscode.java.test.resolvePath, vscode.java.test.findTestLocation, vscode.java.test.get.testpath, vscode.java.test.findDirectTestChildrenForClass, vscode.java.test.navigateToTestOrTarget, vscode.java.test.junit.argument, vscode.java.test.generateTests]

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.160
!MESSAGE Static Commands: []

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.162
!MESSAGE Non-Static Commands: [java.maven.initializeSearcher, java.maven.searchArtifact, java.maven.addDependency, java.maven.controlContext]

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.214
!MESSAGE RepositoryRegistryUpdateJob finished 1ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.240
!MESSAGE >> initialized

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.276
!MESSAGE Creating the Java project jdt.ls-java-project

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:22.694
!MESSAGE Finished creating the Java project jdt.ls-java-project

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:24.631
!MESSAGE Try to create an invisible project for the workspace C:/Users/me/Desktop/java/sealed_jls

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:24.633
!MESSAGE Creating the Java project sealed_jls_8ab9a510

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:24.804
!MESSAGE Finished creating the Java project sealed_jls_8ab9a510

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:24.894
!MESSAGE Successfully created a workspace invisible project sealed_jls_8ab9a510

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:25.000
!MESSAGE Workspace initialized in 2788ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:25.064
!MESSAGE >> initialization job finished

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:25.074
!MESSAGE >> registerWatchers'

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:25.095
!MESSAGE >> registerFeature 'workspace/didChangeWatchedFiles'

!ENTRY java-debug 1 0 2024-04-30 09:41:25.110
!MESSAGE Starting com.microsoft.java.debug.plugin

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:26.030
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:26.031
!MESSAGE >> Updating classpath for project sealed_jls_8ab9a510

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:26.126
!MESSAGE Reconciled 2. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:26.206
!MESSAGE Reconciled 1. Took 0 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:26.778
!MESSAGE Reconciled 2. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:27.001
!MESSAGE >> build jobs finished

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:27.538
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:27.544
!MESSAGE 3 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:27.573
!MESSAGE begin problem for /Storage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:27.574
!MESSAGE 0 problems reported for /Storage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:27.618
!MESSAGE begin problem for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:27.619
!MESSAGE 3 problems reported for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:27.653
!MESSAGE begin problem for /StorageUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:27.653
!MESSAGE 0 problems reported for /StorageUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:27.655
!MESSAGE Validated 4. Took 274 ms

!ENTRY org.eclipse.jdt.ls.core 4 0 2024-04-30 09:41:27.720
!MESSAGE Error computing hover
!STACK 0
java.lang.NullPointerException: Cannot read the array length because "superPermittedTypes" is null
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsAndAdd(SourceTypeBinding.java:1346)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsInType(SourceTypeBinding.java:1202)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.faultInTypesForFieldsAndMethods(SourceTypeBinding.java:1116)
	at org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope.faultInTypes(CompilationUnitScope.java:608)
	at org.eclipse.jdt.internal.codeassist.SelectionEngine.select(SelectionEngine.java:1076)
	at org.eclipse.jdt.internal.core.Openable.codeSelect(Openable.java:166)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeSelect(CompilationUnit.java:382)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeSelect(CompilationUnit.java:375)
	at org.eclipse.jdt.ls.core.internal.JDTUtils.findElementsAtSelection(JDTUtils.java:1036)
	at org.eclipse.jdt.ls.core.internal.HoverInfoProvider.computeHover(HoverInfoProvider.java:101)
	at org.eclipse.jdt.ls.core.internal.handlers.HoverHandler.computeHover(HoverHandler.java:57)
	at org.eclipse.jdt.ls.core.internal.handlers.HoverHandler.hover(HoverHandler.java:43)
	at org.eclipse.jdt.ls.core.internal.handlers.JDTLanguageServer.lambda$5(JDTLanguageServer.java:666)
	at org.eclipse.jdt.ls.core.internal.BaseJDTLanguageServer.lambda$0(BaseJDTLanguageServer.java:87)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(Unknown Source)
	at java.base/java.util.concurrent.CompletableFuture$Completion.exec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool.scan(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:28.079
!MESSAGE >> java/validateDocument

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:28.530
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:28.531
!MESSAGE 3 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:28.532
!MESSAGE Validated 1. Took 36 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:32.108
!MESSAGE >> java/validateDocument

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:32.539
!MESSAGE begin problem for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:32.540
!MESSAGE 3 problems reported for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:41:32.544
!MESSAGE Validated 1. Took 29 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:43:34.502
!MESSAGE >> java/validateDocument

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:43:34.924
!MESSAGE begin problem for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:43:34.924
!MESSAGE 3 problems reported for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 09:43:34.925
!MESSAGE Validated 1. Took 14 ms

!ENTRY org.eclipse.jdt.ls.core 4 0 2024-04-30 10:08:37.954
!MESSAGE Error computing hover
!STACK 0
java.lang.NullPointerException: Cannot read the array length because "superPermittedTypes" is null
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsAndAdd(SourceTypeBinding.java:1346)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsInType(SourceTypeBinding.java:1202)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.faultInTypesForFieldsAndMethods(SourceTypeBinding.java:1116)
	at org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope.faultInTypes(CompilationUnitScope.java:608)
	at org.eclipse.jdt.internal.core.hierarchy.HierarchyResolver.resolve(HierarchyResolver.java:860)
	at org.eclipse.jdt.internal.core.hierarchy.HierarchyResolver.resolve(HierarchyResolver.java:661)
	at org.eclipse.jdt.internal.core.hierarchy.HierarchyBuilder.buildSupertypes(HierarchyBuilder.java:132)
	at org.eclipse.jdt.internal.core.hierarchy.IndexBasedHierarchyBuilder.build(IndexBasedHierarchyBuilder.java:157)
	at org.eclipse.jdt.internal.core.hierarchy.TypeHierarchy.compute(TypeHierarchy.java:323)
	at org.eclipse.jdt.internal.core.hierarchy.TypeHierarchy.refresh(TypeHierarchy.java:1281)
	at org.eclipse.jdt.internal.core.CreateTypeHierarchyOperation.executeOperation(CreateTypeHierarchyOperation.java:94)
	at org.eclipse.jdt.internal.core.JavaModelOperation.run(JavaModelOperation.java:740)
	at org.eclipse.jdt.internal.core.JavaModelOperation.runOperation(JavaModelOperation.java:805)
	at org.eclipse.jdt.internal.core.SourceType.newSupertypeHierarchy(SourceType.java:862)
	at org.eclipse.jdt.internal.core.SourceType.newSupertypeHierarchy(SourceType.java:813)
	at org.eclipse.jdt.internal.corext.util.SuperTypeHierarchyCache.getTypeHierarchy(SuperTypeHierarchyCache.java:144)
	at org.eclipse.jdt.internal.corext.util.SuperTypeHierarchyCache.getTypeHierarchy(SuperTypeHierarchyCache.java:96)
	at org.eclipse.jdt.core.manipulation.internal.javadoc.JavadocLookup.getTypeHierarchy(JavadocLookup.java:228)
	at org.eclipse.jdt.core.manipulation.internal.javadoc.JavadocLookup.getInheritedDescription(JavadocLookup.java:182)
	at org.eclipse.jdt.core.manipulation.internal.javadoc.JavadocLookup.getInheritedMainDescription(JavadocLookup.java:101)
	at org.eclipse.jdt.core.manipulation.internal.javadoc.CoreJavadocAccessImpl.elementToHTML(CoreJavadocAccessImpl.java:354)
	at org.eclipse.jdt.core.manipulation.internal.javadoc.CoreJavadocAccessImpl.toHTML(CoreJavadocAccessImpl.java:162)
	at org.eclipse.jdt.core.manipulation.internal.javadoc.CoreJavadocAccess.javadoc2HTML(CoreJavadocAccess.java:434)
	at org.eclipse.jdt.core.manipulation.internal.javadoc.CoreJavadocAccess.getHTMLContentFromSource(CoreJavadocAccess.java:360)
	at org.eclipse.jdt.core.manipulation.internal.javadoc.CoreJavadocAccess.getHTMLContent(CoreJavadocAccess.java:230)
	at org.eclipse.jdt.ls.core.internal.javadoc.JavadocContentAccess2.getMarkdownContentReader(JavadocContentAccess2.java:74)
	at org.eclipse.jdt.ls.core.internal.HoverInfoProvider.computeJavadoc(HoverInfoProvider.java:308)
	at org.eclipse.jdt.ls.core.internal.HoverInfoProvider.computeHover(HoverInfoProvider.java:149)
	at org.eclipse.jdt.ls.core.internal.handlers.HoverHandler.computeHover(HoverHandler.java:57)
	at org.eclipse.jdt.ls.core.internal.handlers.HoverHandler.hover(HoverHandler.java:43)
	at org.eclipse.jdt.ls.core.internal.handlers.JDTLanguageServer.lambda$5(JDTLanguageServer.java:666)
	at org.eclipse.jdt.ls.core.internal.BaseJDTLanguageServer.lambda$0(BaseJDTLanguageServer.java:87)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(Unknown Source)
	at java.base/java.util.concurrent.CompletableFuture$Completion.exec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool.scan(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:37.989
!MESSAGE >> java/validateDocument

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:38.403
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:38.404
!MESSAGE 3 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:38.405
!MESSAGE Validated 1. Took 11 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:42.961
!MESSAGE >> java/validateDocument

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:43.384
!MESSAGE begin problem for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:43.385
!MESSAGE 3 problems reported for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:43.386
!MESSAGE Validated 1. Took 10 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:48.560
!MESSAGE >> java/validateDocument

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:48.979
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:48.980
!MESSAGE 3 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:48.980
!MESSAGE Validated 1. Took 9 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:54.781
!MESSAGE >> java/validateDocument

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:55.209
!MESSAGE begin problem for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:55.209
!MESSAGE 3 problems reported for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:55.211
!MESSAGE Validated 1. Took 16 ms

!ENTRY org.eclipse.jdt.ls.core 4 0 2024-04-30 10:08:55.922
!MESSAGE Error computing hover
!STACK 0
java.lang.NullPointerException: Cannot read the array length because "superPermittedTypes" is null
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsAndAdd(SourceTypeBinding.java:1346)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsInType(SourceTypeBinding.java:1202)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.faultInTypesForFieldsAndMethods(SourceTypeBinding.java:1116)
	at org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope.faultInTypes(CompilationUnitScope.java:608)
	at org.eclipse.jdt.internal.codeassist.SelectionEngine.select(SelectionEngine.java:1076)
	at org.eclipse.jdt.internal.core.Openable.codeSelect(Openable.java:166)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeSelect(CompilationUnit.java:382)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeSelect(CompilationUnit.java:375)
	at org.eclipse.jdt.ls.core.internal.JDTUtils.findElementsAtSelection(JDTUtils.java:1036)
	at org.eclipse.jdt.ls.core.internal.HoverInfoProvider.computeHover(HoverInfoProvider.java:101)
	at org.eclipse.jdt.ls.core.internal.handlers.HoverHandler.computeHover(HoverHandler.java:57)
	at org.eclipse.jdt.ls.core.internal.handlers.HoverHandler.hover(HoverHandler.java:43)
	at org.eclipse.jdt.ls.core.internal.handlers.JDTLanguageServer.lambda$5(JDTLanguageServer.java:666)
	at org.eclipse.jdt.ls.core.internal.BaseJDTLanguageServer.lambda$0(BaseJDTLanguageServer.java:87)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(Unknown Source)
	at java.base/java.util.concurrent.CompletableFuture$Completion.exec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool.scan(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:56.070
!MESSAGE >> java/validateDocument

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:56.491
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:56.491
!MESSAGE 3 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:08:56.492
!MESSAGE Validated 1. Took 7 ms

!ENTRY org.eclipse.jdt.ls.core 4 0 2024-04-30 10:09:11.949
!MESSAGE Error computing hover
!STACK 0
java.lang.NullPointerException: Cannot read the array length because "superPermittedTypes" is null
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsAndAdd(SourceTypeBinding.java:1346)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsInType(SourceTypeBinding.java:1202)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.faultInTypesForFieldsAndMethods(SourceTypeBinding.java:1116)
	at org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope.faultInTypes(CompilationUnitScope.java:608)
	at org.eclipse.jdt.internal.codeassist.SelectionEngine.select(SelectionEngine.java:1076)
	at org.eclipse.jdt.internal.core.Openable.codeSelect(Openable.java:166)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeSelect(CompilationUnit.java:382)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeSelect(CompilationUnit.java:375)
	at org.eclipse.jdt.ls.core.internal.JDTUtils.findElementsAtSelection(JDTUtils.java:1036)
	at org.eclipse.jdt.ls.core.internal.HoverInfoProvider.computeHover(HoverInfoProvider.java:101)
	at org.eclipse.jdt.ls.core.internal.handlers.HoverHandler.computeHover(HoverHandler.java:57)
	at org.eclipse.jdt.ls.core.internal.handlers.HoverHandler.hover(HoverHandler.java:43)
	at org.eclipse.jdt.ls.core.internal.handlers.JDTLanguageServer.lambda$5(JDTLanguageServer.java:666)
	at org.eclipse.jdt.ls.core.internal.BaseJDTLanguageServer.lambda$0(BaseJDTLanguageServer.java:87)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(Unknown Source)
	at java.base/java.util.concurrent.CompletableFuture$Completion.exec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool.scan(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:09:46.355
!MESSAGE >> java/validateDocument

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:09:46.772
!MESSAGE begin problem for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:09:46.772
!MESSAGE 3 problems reported for /SqlStorageFromUnsealed.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:09:46.773
!MESSAGE Validated 1. Took 8 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:32.824
!MESSAGE >> java/validateDocument

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:33.237
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:33.238
!MESSAGE 3 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:33.239
!MESSAGE Validated 1. Took 8 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:35.892
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:36.303
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:36.304
!MESSAGE 3 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:36.305
!MESSAGE Validated 1. Took 10 ms

!ENTRY org.eclipse.jdt.ls.core 4 0 2024-04-30 10:10:36.403
!MESSAGE Problem with codeComplete for file:///c%3A/Users/me/Desktop/java/sealed_jls/src/main/java/com/efi/storage/SqlStorage.java
!STACK 0
java.lang.NullPointerException: Cannot read the array length because "superPermittedTypes" is null
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsAndAdd(SourceTypeBinding.java:1346)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsInType(SourceTypeBinding.java:1202)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.faultInTypesForFieldsAndMethods(SourceTypeBinding.java:1116)
	at org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope.faultInTypes(CompilationUnitScope.java:608)
	at org.eclipse.jdt.internal.codeassist.CompletionEngine.complete(CompletionEngine.java:2329)
	at org.eclipse.jdt.internal.core.Openable.codeComplete(Openable.java:135)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeComplete(CompilationUnit.java:360)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeComplete(CompilationUnit.java:350)
	at org.eclipse.jdt.ls.core.internal.handlers.CompletionHandler.computeContentAssist(CompletionHandler.java:287)
	at org.eclipse.jdt.ls.core.internal.handlers.CompletionHandler.completion(CompletionHandler.java:121)
	at org.eclipse.jdt.ls.core.internal.handlers.JDTLanguageServer.completion(JDTLanguageServer.java:633)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.base/java.lang.reflect.Method.invoke(Unknown Source)
	at org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint.lambda$recursiveFindRpcMethods$0(GenericEndpoint.java:65)
	at org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint.request(GenericEndpoint.java:120)
	at org.eclipse.lsp4j.jsonrpc.RemoteEndpoint.handleRequest(RemoteEndpoint.java:272)
	at org.eclipse.lsp4j.jsonrpc.RemoteEndpoint.consume(RemoteEndpoint.java:201)
	at org.eclipse.jdt.ls.core.internal.ParentProcessWatcher.lambda$1(ParentProcessWatcher.java:144)
	at org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer.handleMessage(StreamMessageProducer.java:194)
	at org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer.listen(StreamMessageProducer.java:94)
	at org.eclipse.lsp4j.jsonrpc.json.ConcurrentMessageProcessor.run(ConcurrentMessageProcessor.java:113)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Unknown Source)
	at java.base/java.util.concurrent.FutureTask.run(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.base/java.lang.Thread.run(Unknown Source)

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:36.405
!MESSAGE Completion request cancelled

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:36.424
!MESSAGE Reconciled 1. Took 3 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:36.535
!MESSAGE Reconciled 1. Took 3 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:36.633
!MESSAGE Reconciled 1. Took 2 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:36.815
!MESSAGE Reconciled 1. Took 7 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:36.952
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:37.331
!MESSAGE Completion request completed

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:37.368
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 4 0 2024-04-30 10:10:37.516
!MESSAGE Problem with codeComplete for file:///c%3A/Users/me/Desktop/java/sealed_jls/src/main/java/com/efi/storage/SqlStorage.java
!STACK 0
java.lang.NullPointerException: Cannot read the array length because "superPermittedTypes" is null
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsAndAdd(SourceTypeBinding.java:1346)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsInType(SourceTypeBinding.java:1202)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.faultInTypesForFieldsAndMethods(SourceTypeBinding.java:1116)
	at org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope.faultInTypes(CompilationUnitScope.java:608)
	at org.eclipse.jdt.internal.codeassist.CompletionEngine.complete(CompletionEngine.java:2329)
	at org.eclipse.jdt.internal.core.Openable.codeComplete(Openable.java:135)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeComplete(CompilationUnit.java:360)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeComplete(CompilationUnit.java:350)
	at org.eclipse.jdt.ls.core.internal.handlers.CompletionHandler.computeContentAssist(CompletionHandler.java:287)
	at org.eclipse.jdt.ls.core.internal.handlers.CompletionHandler.completion(CompletionHandler.java:121)
	at org.eclipse.jdt.ls.core.internal.handlers.JDTLanguageServer.completion(JDTLanguageServer.java:633)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.base/java.lang.reflect.Method.invoke(Unknown Source)
	at org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint.lambda$recursiveFindRpcMethods$0(GenericEndpoint.java:65)
	at org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint.request(GenericEndpoint.java:120)
	at org.eclipse.lsp4j.jsonrpc.RemoteEndpoint.handleRequest(RemoteEndpoint.java:272)
	at org.eclipse.lsp4j.jsonrpc.RemoteEndpoint.consume(RemoteEndpoint.java:201)
	at org.eclipse.jdt.ls.core.internal.ParentProcessWatcher.lambda$1(ParentProcessWatcher.java:144)
	at org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer.handleMessage(StreamMessageProducer.java:194)
	at org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer.listen(StreamMessageProducer.java:94)
	at org.eclipse.lsp4j.jsonrpc.json.ConcurrentMessageProcessor.run(ConcurrentMessageProcessor.java:113)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Unknown Source)
	at java.base/java.util.concurrent.FutureTask.run(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.base/java.lang.Thread.run(Unknown Source)

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:37.517
!MESSAGE Completion request cancelled

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:37.559
!MESSAGE Reconciled 1. Took 2 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:37.646
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:37.671
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 4 0 2024-04-30 10:10:37.861
!MESSAGE Problem with codeComplete for file:///c%3A/Users/me/Desktop/java/sealed_jls/src/main/java/com/efi/storage/SqlStorage.java
!STACK 0
java.lang.NullPointerException: Cannot read the array length because "superPermittedTypes" is null
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsAndAdd(SourceTypeBinding.java:1346)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsInType(SourceTypeBinding.java:1202)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.faultInTypesForFieldsAndMethods(SourceTypeBinding.java:1116)
	at org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope.faultInTypes(CompilationUnitScope.java:608)
	at org.eclipse.jdt.internal.codeassist.CompletionEngine.complete(CompletionEngine.java:2329)
	at org.eclipse.jdt.internal.core.Openable.codeComplete(Openable.java:135)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeComplete(CompilationUnit.java:360)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeComplete(CompilationUnit.java:350)
	at org.eclipse.jdt.ls.core.internal.handlers.CompletionHandler.computeContentAssist(CompletionHandler.java:287)
	at org.eclipse.jdt.ls.core.internal.handlers.CompletionHandler.completion(CompletionHandler.java:121)
	at org.eclipse.jdt.ls.core.internal.handlers.JDTLanguageServer.completion(JDTLanguageServer.java:633)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.base/java.lang.reflect.Method.invoke(Unknown Source)
	at org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint.lambda$recursiveFindRpcMethods$0(GenericEndpoint.java:65)
	at org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint.request(GenericEndpoint.java:120)
	at org.eclipse.lsp4j.jsonrpc.RemoteEndpoint.handleRequest(RemoteEndpoint.java:272)
	at org.eclipse.lsp4j.jsonrpc.RemoteEndpoint.consume(RemoteEndpoint.java:201)
	at org.eclipse.jdt.ls.core.internal.ParentProcessWatcher.lambda$1(ParentProcessWatcher.java:144)
	at org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer.handleMessage(StreamMessageProducer.java:194)
	at org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer.listen(StreamMessageProducer.java:94)
	at org.eclipse.lsp4j.jsonrpc.json.ConcurrentMessageProcessor.run(ConcurrentMessageProcessor.java:113)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Unknown Source)
	at java.base/java.util.concurrent.FutureTask.run(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.base/java.lang.Thread.run(Unknown Source)

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:37.862
!MESSAGE Completion request cancelled

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:37.913
!MESSAGE Reconciled 1. Took 3 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:38.146
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 4 0 2024-04-30 10:10:38.153
!MESSAGE Problem with codeComplete for file:///c%3A/Users/me/Desktop/java/sealed_jls/src/main/java/com/efi/storage/SqlStorage.java
!STACK 0
java.lang.NullPointerException: Cannot read the array length because "superPermittedTypes" is null
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsAndAdd(SourceTypeBinding.java:1346)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.checkPermitsInType(SourceTypeBinding.java:1202)
	at org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding.faultInTypesForFieldsAndMethods(SourceTypeBinding.java:1116)
	at org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope.faultInTypes(CompilationUnitScope.java:608)
	at org.eclipse.jdt.internal.codeassist.CompletionEngine.complete(CompletionEngine.java:2329)
	at org.eclipse.jdt.internal.core.Openable.codeComplete(Openable.java:135)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeComplete(CompilationUnit.java:360)
	at org.eclipse.jdt.internal.core.CompilationUnit.codeComplete(CompilationUnit.java:350)
	at org.eclipse.jdt.ls.core.internal.handlers.CompletionHandler.computeContentAssist(CompletionHandler.java:287)
	at org.eclipse.jdt.ls.core.internal.handlers.CompletionHandler.completion(CompletionHandler.java:121)
	at org.eclipse.jdt.ls.core.internal.handlers.JDTLanguageServer.completion(JDTLanguageServer.java:633)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.base/java.lang.reflect.Method.invoke(Unknown Source)
	at org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint.lambda$recursiveFindRpcMethods$0(GenericEndpoint.java:65)
	at org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint.request(GenericEndpoint.java:120)
	at org.eclipse.lsp4j.jsonrpc.RemoteEndpoint.handleRequest(RemoteEndpoint.java:272)
	at org.eclipse.lsp4j.jsonrpc.RemoteEndpoint.consume(RemoteEndpoint.java:201)
	at org.eclipse.jdt.ls.core.internal.ParentProcessWatcher.lambda$1(ParentProcessWatcher.java:144)
	at org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer.handleMessage(StreamMessageProducer.java:194)
	at org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer.listen(StreamMessageProducer.java:94)
	at org.eclipse.lsp4j.jsonrpc.json.ConcurrentMessageProcessor.run(ConcurrentMessageProcessor.java:113)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Unknown Source)
	at java.base/java.util.concurrent.FutureTask.run(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.base/java.lang.Thread.run(Unknown Source)

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:38.154
!MESSAGE Completion request cancelled

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:38.569
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:38.570
!MESSAGE 5 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:38.571
!MESSAGE Validated 1. Took 9 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:39.065
!MESSAGE Reconciled 1. Took 3 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:39.480
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:39.480
!MESSAGE 4 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:39.481
!MESSAGE Validated 1. Took 12 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:39.877
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:40.266
!MESSAGE Reconciled 1. Took 2 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:40.691
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:40.692
!MESSAGE 3 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:40.693
!MESSAGE Validated 1. Took 13 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:41.723
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:42.139
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:42.140
!MESSAGE 5 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:42.141
!MESSAGE Validated 1. Took 8 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:46.943
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:47.357
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:47.357
!MESSAGE 3 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:47.358
!MESSAGE Validated 1. Took 11 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:47.786
!MESSAGE Reconciled 1. Took 1 ms

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:48.199
!MESSAGE begin problem for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:48.199
!MESSAGE 3 problems reported for /SqlStorage.java

!ENTRY org.eclipse.jdt.ls.core 1 0 2024-04-30 10:10:48.201
!MESSAGE Validated 1. Took 11 ms
```
