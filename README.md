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

Bit.count(7);
// 3 (111 => 3)

Bit.parity(8, 2);
// 2 (10,00 => 10)

Bit.swap(6, 1, 0);
// 5 (110 => 101)

Bit.reverse(0xFFFF0000);
// 65535 (0x0000FFFF)

Bit.signExtend(15, 4);
// -1
```

<br>
<br>


## Index

| Method       | Action                                  |
| ------------ | --------------------------------------- |
| [get]        | Get a bit.                              |
| [set]        | Set a bit.                              |
| [toggle]     | Toggle a bit.                           |
| [swap]       | Swap bit sequences.                     |
| [scan]       | Get index of first set bit from LSB.    |
| [count]      | Count bits set.                         |
| [parity]     | Get n-bit parity.                       |
| [rotate]     | Rotate bits.                            |
| [reverse]    | Reverse all bits.                       |
| [merge]      | Merge bits as per mask.                 |
| [interleave] | Interleave bits of two int16s.          |
| [signExtend] | Sign extend variable bit-width integer. |

[get]: https://github.com/javaf/extra-boolean/wiki/get
[set]: https://github.com/javaf/extra-boolean/wiki/set
[setAs]: https://github.com/javaf/extra-boolean/wiki/setAs
[swap]: https://github.com/javaf/extra-boolean/wiki/swap
[scan]: https://github.com/javaf/extra-boolean/wiki/scan
[scanReverse]: https://github.com/javaf/extra-boolean/wiki/scanReverse
[count]: https://github.com/javaf/extra-boolean/wiki/count
[parity]: https://github.com/javaf/extra-boolean/wiki/parity
[reverse]: https://github.com/javaf/extra-boolean/wiki/reverse
[merge]: https://github.com/javaf/extra-boolean/wiki/merge
[interleave]: https://github.com/javaf/extra-boolean/wiki/interleave
[signExtend]: https://github.com/javaf/extra-boolean/wiki/signExtend
[toggle]: https://github.com/javaf/extra-boolean/wiki/toggle
[rotate]: https://github.com/javaf/extra-boolean/wiki/rotate

<br>
<br>

[![](https://img.youtube.com/vi/r3QQ6dm64xg/maxresdefault.jpg)](https://www.youtube.com/watch?v=r3QQ6dm64xg)
