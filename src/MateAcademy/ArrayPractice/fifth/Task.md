Обчислити суму значень Integer в хешмапі, де ключ містить keyPart.

Наприклад:

Якщо keyPart = "hello", а хешмапа має наступний вміст:\
data.put("myhelloworld", 4);
data.put("Hello", 7);
data.put("AwesomeString", 8);
data.put("Wow!!!! HELLO", 9);

результатом виконання методу буде 4 + 7 + 9 = 20.

Якщо мапа порожня - повернути 0.
Якщо рядок порожній - повернути суму всіх Integer.