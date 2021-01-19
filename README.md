Boolean data type has two possible truth values to represent logic.<br>
:package: [Central](https://search.maven.org/artifact/io.github.javaf/extra-boolean),
:scroll: [Releases](https://repo1.maven.org/maven2/io/github/javaf/extra-boolean/),
:octocat: [GitHub](https://github.com/javaf/hello-world/packages/575247),
:frog: [Bintray](https://bintray.com/beta/#/bintray/jcenter/io.github.javaf:extra-boolean),
:peacock: [MvnRepository](https://mvnrepository.com/artifact/io.github.javaf/extra-boolean),
:newspaper: [Javadoc](https://javaf.github.io/extra-boolean/)
:blue_book: [Wiki](https://github.com/javaf/extra-boolean/wiki).

> Stability: Experimental.

<br>

```java
import io.github.javaf.*;

Boolean.parse("inactive");
// false

Boolean.parse("not off");
// true

Boolean.parse("truthy");
// true

Boolean.xor(true, true);
// false

Boolean.imp(true, false);
// false

Boolean.eqv(false, false);
// true
```

<br>
<br>


## Index

| Method  | Action                                    |
| ------- | ----------------------------------------- |
| [parse] | Convert string to boolean.                |
| [xor]   | Get exclusive-or of 2 boolean values.     |
| [eqv]   | Check if antecedent ⇔ consequent (x ⇔ y). |
| [imp]   | Check if antecedent ⇒ consequent (x ⇒ y). |

[parse]: https://github.com/javaf/extra-boolean/wiki/parse
[xor]: https://github.com/javaf/extra-boolean/wiki/xor
[eqv]: https://github.com/javaf/extra-boolean/wiki/eqv
[imp]: https://github.com/javaf/extra-boolean/wiki/imp

<br>
<br>

[![](https://img.youtube.com/vi/6mMK6iSZsAs/maxresdefault.jpg)](https://www.youtube.com/watch?v=6mMK6iSZsAs)
