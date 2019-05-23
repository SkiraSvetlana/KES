package ru.wscb.KESJavaClient.Core;

/**
 * Интерфейс визуальной формы объекта.
 *
 * @author Zakirov_IG
 */
public interface IForm extends IObject {
  /**
   * Показать форму.
   */
  void Show();

  /**
   * Показать форму.
   *
   * @param DefaultCloseOperation действие выполняемое по умолчанию при закрытии формы.
   */
  void Show(int DefaultCloseOperation);
}
