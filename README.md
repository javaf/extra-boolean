Boolean data type has two possible truth values to represent logic.<br>
:package: [Central](https://search.maven.org/artifact/io.github.javaf/extra-boolean),
:scroll: [Releases](https://repo1.maven.org/maven2/io/github/javaf/extra-boolean/),
:smiley_cat: [GitHub](https://github.com/javaf/hello-world/packages/579834),
:frog: [Bintray](https://bintray.com/beta/#/bintray/jcenter/io.github.javaf:extra-boolean),
:peacock: [MvnRepository](https://mvnrepository.com/artifact/io.github.javaf/extra-boolean),
:newspaper: [Javadoc](https://javaf.github.io/extra-boolean/),
:blue_book: [Wiki](https://github.com/javaf/extra-boolean/wiki).

Here is my implementation of digital logic gates in software. That includes
the basic gates [not], [and], [or], [xor]; their complements [nand], [nor],
[xnor]; and 2 propositional logic (taught in discrete mathematics) gates
[imply], [eq]; and their complements [nimply], [neq]. There is also a
multiplexer, called [select], and a `true` counter, called [count]. [count]
can help you make custom gates, such as an *alternate* concept of **xnor**
which returns `true` only if all inputs are the same (standard [xnor] returns
`true` if even inputs are `true`). All of them can handle upto 8 inputs.

[parse] is influenced by [boolean] package, and is quite good at translating
`string` to `boolean`. It can also handle double negatives, eg. `not inactive`.
You know the [and] of 2-inputs, but what of 1-input? What of 0? And what of
the other gates? I answer them here.

> Stability: Experimental.

<br>

```java
import io.github.javaf.*;

Boolean.parse("1");
Boolean.parse("not off");
Boolean.parse("truthy");
// true

Boolean.parse("not true");
Boolean.parse("inactive");
Boolean.parse("disabled");
// false

Boolean.imply(true, false);
// false

Boolean.eq(false, false);
// true

Boolean.xor(true, true, true);
// true

Boolean.select(1, true, false, true);
// false                  ^

Boolean.count(true, false, true);
// 2           ^            ^
```

<br>
<br>


## Index

| Method   | Action                                |
| -------- | ------------------------------------- |
| [parse]  | Converts string to boolean.            |
| [not]    | Checks if value is false.              |
| [and]    | Checks if all values are true.         |
| [or]     | Checks if any value is true.           |
| [xor]    | Checks if odd no. of values are true.  |
| [nand]   | Checks if any value is false.          |
| [nor]    | Checks if all values are false.        |
| [xnor]   | Checks if even no. of values are true. |
| [eq]     | Checks if antecedent ⇔ consequent.     |
| [neq]    | Checks if antecedent ⇎ consequent.     |
| [imply]  | Checks if antecedent ⇒ consequent.     |
| [nimply] | Checks if antecedent ⇏ consequent.     |
| [select] | Checks if ith value is true.           |
| [count]  | Counts no. of true values.             |

[boolean]: https://www.npmjs.com/package/boolean
[parse]: https://github.com/javaf/extra-boolean/wiki/parse
[not]: https://github.com/javaf/extra-boolean/wiki/not
[and]: https://github.com/javaf/extra-boolean/wiki/and
[or]: https://github.com/javaf/extra-boolean/wiki/or
[xor]: https://github.com/javaf/extra-boolean/wiki/xor
[nand]: https://github.com/javaf/extra-boolean/wiki/nand
[nor]: https://github.com/javaf/extra-boolean/wiki/nor
[xnor]: https://github.com/javaf/extra-boolean/wiki/xnor
[eq]: https://github.com/javaf/extra-boolean/wiki/eq
[neq]: https://github.com/javaf/extra-boolean/wiki/neq
[imply]: https://github.com/javaf/extra-boolean/wiki/imply
[nimply]: https://github.com/javaf/extra-boolean/wiki/nimply
[select]: https://github.com/javaf/extra-boolean/wiki/select
[count]: https://github.com/javaf/extra-boolean/wiki/count

<br>
<br>

[![](https://img.youtube.com/vi/6mMK6iSZsAs/maxresdefault.jpg)](https://www.youtube.com/watch?v=6mMK6iSZsAs)
