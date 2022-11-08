package ru.croc.task6;

public class Task6 {
    public static void main(String[] args) throws Exception {
        Annotation[] annotations = new Annotation[]{                                               //Создаем массив аннотаций
                new Annotation(new Circle(50, 50, 5), "Circle"),                    // и вводим данные
                new Annotation(new Rectangle(10, 10, 20, 20), "Rectangle")};

        AnnotatedImage annotatedImage = new AnnotatedImage("",annotations);

        try {                                                                                 //ищем фигуру по подстроке
            System.out.println(annotatedImage.findByLabel("ang"));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(annotatedImage.findByPoint(50,50));                       //находим фигуру по коордам
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        annotations[0].getFigure().move(1,1);                                           //вызываем move

        System.out.println(annotations[0].getFigure());                                        //и вывлдим результат мува
    }
}
