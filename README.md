# Take it Further U2.4b — Extra Credit

**AP / IB Computer Science · Unit 2 · assigned Day 16, open until the unit test**

Three problems, all solvable with `/`, `%` and ordinary arithmetic.
No `if` statements. No loops. Do as many as you like — they are scored separately.

---

## 1 · Digital Clock

```
Enter the total number of seconds:
3672

3672 seconds is 1:1:12   (1 hour, 1 minute, 12 seconds)
```

*There are 3600 seconds in an hour. Take the hours out first, then work on what
is left.*

## 2 · Coin Change

```
Enter the total number of cents:
87

87 cents is 3 quarters, 1 dime, 0 nickels, and 2 pennies.
```

*It is the same move four times — take out as many as you can, keep the
leftover, go again.*

## 3 · Day of the Week

```
Enter today's day of the week (0 = Sunday ... 6 = Saturday):
2
Enter the number of days in the future:
10

In 10 days it will be day 5.
```

**This one prints a number, not a name.** Turning `5` into `"Friday"` means
choosing between seven possibilities, and choosing needs an `if` statement —
Unit 4.

**Stretch, after Day 27:** once you know `substring()`, you can store
`"SunMonTueWedThuFriSat"` and pull the right three letters out with arithmetic
alone. Come back to this then.

## Running it

```
javac TakeItFurther.java
java TakeItFurther
```

Push when you are done and tell Mr. Gesell which problems you attempted.
