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


...

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
