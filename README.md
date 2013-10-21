# moon-castle

(Yet another) Clojure wrapper library for Bouncy Castle. Currently not safe to
use and more of a private investigation on how the API works, but feel free to
use it if you want to experiment with stuff. If you need something more
reliable, read the next section.

## Oh dear, yet another one?

There are already two libraries out out there: [bc-clj][] and [clj-crypto][]. If
you know the BouncyCastle API, I would guess one of those should be sufficient:
I don't know yet.

[bc-clj]: https://github.com/sebhoss/bc-clj
[clj-crypto]: https://github.com/macourtney/clj-crypto

And that's partly why I am making a new one. In both of those libraries, there
is absolutely no documentation on how to use the tool. I would guess that's
fine, if you know the BouncyCastle API already. However, many of us doesn't, and
as a result, those wrapper implementations doesn't give much value.

My goal with Moon Castle is twofold: It's first and foremost an attempt to
properly understand the Bouncy Castle API, and figure out how to make it a
reasonable API for Clojure. Second (and perhaps more importantly), it's an
attempt to write a proper library with proper documentation aimed at people
unfamiliar with Bouncy Castle.

## Who should be using it?

Currently, no one should be using Moon Castle, because it's still in
development.

However, in the future, it aims to provide features which the shell command GPG
does from within Java: OpenPGP encryption and signing. From there on, it may be
reasonable to ask for other features which Bouncy Castle provides. If you are in
need of those features, you should probably watch out for this library. No
obligations are given, however, and it may take longer time than you'd like it
to take.

## Usage

Note that currently, you'll have to manually install the library to test it out.
That can be done with Leiningen as follows:

```bash
git clone git@github.com:hyPiRion/moon-castle.git
cd moon-castle
lein install
```

When you're done with that, you're ready to use either Leiningen or Maven. With
Leiningen, you just add in the following dependency:

```clj
[moon-castle "0.1.0-SNAPSHOT"]
```

And for Maven:

```xml
<dependency>
  <groupId>moon-castle</groupId>
  <artifactId>moon-castle</artifactId>
  <version>0.1.0-SNAPSHOT</version>
</dependency>
```

also ensure that Clojars is added to your repositories:

```xml
<repository>
  <id>clojars</id>
  <url>http://clojars.org/repo/</url>
</repository>
```

## I need more documentation/tutorials!

More help will eventually end up in the `doc` folder in this repository, but for
now, there isn't much to add in. After all, this isn't working, and everything,
including the documentation, is a work in project.

## License

Copyright © 2013 by [hyPiRion](https://github.com/hyPiRion) and
contributors.

Distributed under the [MIT License][license]. You can find a copy in the root of
this repository with the name `LICENSE`.

[license]: http://opensource.org/licenses/MIT "The MIT License"
