Given an integer array nums sorted in ***non-decreasing order***,
remove the duplicates ***in-place*** such that each unique element appears only once.
The ***relative order*** of the elements should be kept the same.
Then return *the number of unique elements in* ***nums***.

Consider the number of unique elements of ***nums*** to be ***k***,
to get accepted, you need to do the following things:

* Change the array ***nums*** such that the first ***k*** elements of ***nums*** contain the unique elements 
in the order they were present in ***nums*** initially. The remaining elements of ***nums*** are not important as well as the size of nums.
* Return k.


### Constraints:

* 1 <= nums.length <= 3 * 104
* -100 <= nums[i] <= 100
* nums is sorted in non-decreasing order.


## Example output~~~~
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


### hint :

* We need to modify the array in-place and the size of the final array would potentially be
smaller than the size of the input array. So, we ought to use a two-pointer approach here.
One, that would keep track of the current element in the original array and another one for just 
the unique elements.
* Essentially, once an element is encountered, you simply need to bypass its duplicates and
move on to the next unique element.

# soling 

* Ініціалізуйте два вказівники: current і nextUnique. 
Початкове значення nextUnique буде 1, 
оскільки перший елемент в масиві є унікальним за замовчуванням.
* Проітеруйтесь по масиву nums починаючи з індексу 1:
* Порівняйте поточний елемент ***nums[i]*** з елементом, який знаходиться попереду нього ***nums[i-1]***.
* Якщо елементи різні, помістіть поточний елемент ***nums[i]*** на позицію nextUnique в масиві nums. 
Збільште значення nextUnique на 1.

Після завершення ітерації, поверніть значення nextUnique як кількість
унікальних елементів в масиві.


 ## Сенс використання current і nextUnique
* вони будуть цілими числами типу ***int***.
* Вони використовуються для відстеження позицій у масиві nums.

### Ось як вони використовуються в алгоритмі:

1. *current*  
 - це вказівник, який використовується для ітерації по елементам масиву ***nums***.
 - Він починається з індексу *1*, оскільки перший елемент вже вважається унікальним.

2. *nextUnique* 
 - це вказівник, який вказує на місце, куди треба помістити наступний унікальний елемент.
 - Він починається зі значення 1, оскільки перший елемент вже є унікальним і залишається на місці.

Під час ітерації по масиву ***nums***, *current* збільшується на 1 при кожній ітерації,
а *nextUnique* збільшується лише тоді, коли зустрічається новий унікальний елемент, який потрібно помістити на наступну позицію.

***Таким чином, current і nextUnique є цілими числами, які використовуються для керування індексами у масиві nums.***

 ## example :

```java
class buba {
    public int removeDuplicatesFromArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int nextUnique = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[nextUnique] = nums[i];
                nextUnique++;
            }
        }

        return nextUnique;
    }
}
```