package MateAcademy.JavaBasicExtended.MethodAdvanced.PaginationService;

public class PaginationService {
    private String[] data;
    private int elementsPerPage;

    public PaginationService(String[] data, int elementsPerPage) {
        this.data = data;
        this.elementsPerPage = elementsPerPage;
    }

    // create getElementsCount() method
    public int getElementsCount(){
        int count = data.length;
        return count;
    }


    public int getPageNumberByElementIndex(int index){
        if (index >= 0 && index < data.length){
            int pageNumber =index  / elementsPerPage;
            return pageNumber;
        }else {
            return -1;
        }
    }
}

/*
Перший метод getElementsCount() повинен просто повертати кількість елементів у масиві даних,
що зберігаються в класі.
Другий метод getPageNumberByElementIndex(int index) повинен перевірити,
чи є індекс в межах допустимого діапазону, тобто чи не виходить індекс за межі масиву даних.
Якщо індекс дійсний, тоді потрібно обчислити номер сторінки за допомогою формули pageNumber = index / pageSize,
 де pageSize - кількість елементів на одній сторінці. Оскільки нумерація сторінок починається з 0,
  то отриманий номер сторінки потрібно зменшити на одиницю. Якщо індекс недійсний, то повернути -1.
 Цей код приймає масив data з елементами, а також кількість елементів на сторінці pageSize.
 Метод getElementsCount() просто повертає довжину масиву data.
  Метод getPageNumberByElementIndex(int index) перевіряє, чи валідний індекс index,
   тоді обчислює номер сторінки за допомогою формули,
  і повертає номер сторінки. Якщо індекс не валідний, повертається -1.
 */