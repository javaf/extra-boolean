A "Hello, World!" is an introductory computer program.<br>
:package: [Central](https://search.maven.org/artifact/io.github.javaf/hello-world),
:scroll: [Releases](https://repo1.maven.org/maven2/io/github/javaf/hello-world/),
:octocat: [GitHub](https://github.com/javaf/hello-world/packages/573464),
:frog: [Bintray](https://bintray.com/beta/#/bintray/jcenter/io.github.javaf:hello-world),
:peacock: [MvnRepository](https://mvnrepository.com/artifact/io.github.javaf/hello-world),
:newspaper: [Javadoc](https://javaf.github.io/hello-world/),
:blue_book: [Wiki](https://github.com/javaf/hello-world/wiki).

<br>

Consider this as a template to:
- Write Maven project.
- Create test cases.
- Set up [package information](pom.xml).
- Set up [global settings](global/settings.xml).
- Auto generate sources, javadoc JAR.
- Auto sign package with GPG.
- Auto publish javadoc to `gh-pages`.
- Auto deploy to Maven Central Respository.
- Auto deploy to GitHub Package registry.
- TODO: Auto update package version.

<br>

```java
## OUTPUT
What clothing does a house wear?
<your answer>
```

<br>
<br>


## References

### Which JDK

- [JDK, JRE, JVM: What Are They and What Are Their Differences?](https://www.youtube.com/watch?v=BXFHuaQNnLo)
- [Java Development Kit: What Version of the JDK Should You Use?](https://www.youtube.com/watch?v=HqU0TF4XNbM)

<br>


### Setup deploy

- [Publish JAR To Central Maven Repository, Jakob Jenkov](http://tutorials.jenkov.com/maven/publish-to-central-maven-repository.html)
- [OSSRH Guide, Sonatype Central Repository](https://central.sonatype.org/pages/ossrh-guide.html)
- [Sonatype issues: Account management](https://issues.sonatype.org)
- [Nexus repository manager](https://oss.sonatype.org)

<br>


### Sign package

- [OpenPGP KeyServer](https://keys.openpgp.org)
- [Working with PGP Signatures](https://central.sonatype.org/pages/working-with-pgp-signatures.html)
- [Keep GnuPG credentials cached for entire user session](https://superuser.com/a/624488/305990)
- [How to export a GPG private key and public key to a file](https://unix.stackexchange.com/a/482559/166668)
- [How to import secret gpg key (copied from one machine to another)?](https://unix.stackexchange.com/a/184952/166668)

<br>


### Auto deploy

- [Job Lifecycle, Travis CI](https://docs.travis-ci.com/user/job-lifecycle)
- [Building a Java project, Travis CI](https://docs.travis-ci.com/user/languages/java/)
- [Github clone with oauth access token](https://stackoverflow.com/a/42175489/1413259)
- [Various tips for using Apache Maven SCM Publish Plugin](https://maven.apache.org/plugins/maven-scm-publish-plugin/various-tips.html#Git_branch)
- [Using Travis CI to deploy to Maven repositories and GitHub Releases](https://synyx.de/blog/using-travis-ci-to-deploy-to-maven-repositories-and-github-releases/)
- [Configuring Apache Maven for use with GitHub Packages](https://docs.github.com/en/free-pro-team@latest/packages/guides/configuring-apache-maven-for-use-with-github-packages)

<br>


### Update version

- [Changing the project version](https://www.mojohaus.org/versions-maven-plugin/examples/set.html)
- [Updating version numbers of modules in a multi-module Maven project](https://stackoverflow.com/a/5726599/1413259)
- [Use the Latest Version of a Dependency in Maven](https://www.baeldung.com/maven-dependency-latest-version)
- [Managing Version Numbers in Maven With the Maven Versions Plugin](https://dzone.com/articles/managing-version-numbers-maven)

<br>
<br>

[![](https://img.youtube.com/vi/qNS2jj2w-GI/maxresdefault.jpg)](https://www.youtube.com/watch?v=qNS2jj2w-GI)
