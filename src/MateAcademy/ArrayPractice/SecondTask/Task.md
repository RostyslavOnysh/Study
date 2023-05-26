Реалізуйте метод countOccurrences: метод приймає 2 параметри (str, substr) і повертає кількість разів, що substr з'являється у str.

Наприклад, для str = "azyxxzyzy", substr = "zy" метод повинен повернути 3, бо "zy" з'являється 3 рази: a[zy]xx[zy][zy].

countOccurrences("azyxxzyzy", "zy") == 3
countOccurrences("ababagalamaga", "ba") == 2

Notes:

str і substr містять тільки латинські літери нижнього регістру.
літери в substr не повторюються (substr не може бути рівним xyx