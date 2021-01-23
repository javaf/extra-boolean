Boolean data type has two possible truth values to represent logic.<br>
:package: [Central](https://search.maven.org/artifact/io.github.javaf/extra-boolean),
:scroll: [Releases](https://repo1.maven.org/maven2/io/github/javaf/extra-boolean/),
:octocat: [GitHub](https://github.com/javaf/hello-world/packages/579834),
:frog: [Bintray](https://bintray.com/beta/#/bintray/jcenter/io.github.javaf:extra-boolean),
:peacock: [MvnRepository](https://mvnrepository.com/artifact/io.github.javaf/extra-boolean),
:newspaper: [Javadoc](https://javaf.github.io/extra-boolean/),
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

| Method   | Action                                |
| -------- | ------------------------------------- |
| [parse]  | Convert string to boolean.            |
| [not]    | Check if value is false.              |
| [and]    | Check if all values are true.         |
| [or]     | Check if any value is true.           |
| [xor]    | Check if odd no. of values are true.  |
| [nand]   | Check if any value is false.          |
| [nor]    | Check if all values are false.        |
| [xnor]   | Check if even no. of values are true. |
| [eq]     | Check if antecedent ⇔ consequent.     |
| [imply]  | Check if antecedent ⇒ consequent.     |
| [nimply] | Check if antecedent ⇏ consequent.     |
| [count]  | Count no. of true values.             |

[parse]: https://github.com/javaf/extra-boolean/wiki/parse
[not]: https://github.com/javaf/extra-boolean/wiki/not
[and]: https://github.com/javaf/extra-boolean/wiki/and
[or]: https://github.com/javaf/extra-boolean/wiki/or
[xor]: https://github.com/javaf/extra-boolean/wiki/xor
[nand]: https://github.com/javaf/extra-boolean/wiki/nand
[nor]: https://github.com/javaf/extra-boolean/wiki/nor
[xnor]: https://github.com/javaf/extra-boolean/wiki/xnor
[eq]: https://github.com/javaf/extra-boolean/wiki/eq
[imply]: https://github.com/javaf/extra-boolean/wiki/imply
[nimply]: https://github.com/javaf/extra-boolean/wiki/nimply
[count]: https://github.com/javaf/extra-boolean/wiki/count

<br>
<br>

[![](https://img.youtube.com/vi/6mMK6iSZsAs/maxresdefault.jpg)](https://www.youtube.com/watch?v=6mMK6iSZsAs)
