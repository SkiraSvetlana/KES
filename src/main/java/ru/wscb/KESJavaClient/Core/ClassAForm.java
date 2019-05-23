package ru.wscb.KESJavaClient.Core;

import javax.swing.*;
import java.util.UUID;

/**
 * Абстрактный класс визуальной формы.
 *
 * @author Zakirov_IG
 */
public abstract class ClassAForm implements IForm {
  /**
   * Уникальный идентификатор.
   */
  private String m_GUID;
  /**
   * Визуальная форма.
   */
  private JFrame m_Form;

  /**
   * Конструктор.
   */
  public ClassAForm() {
    m_GUID = UUID.randomUUID().toString();
  }

  /**
   * @see IForm
   */
  @Override
  public abstract void Show();

  /**
   * @param DefaultCloseOperation действие выполняемое по умолчанию при закрытии формы.
   * @see IForm
   */
  @Override
  public abstract void Show(int DefaultCloseOperation);

  /**
   * @return Уникальный идентификатор объекта.
   * @see IObject
   */
  @Override
  public String GetGUID() {
    return m_GUID;
  }

  /**
   * Инициализация формы, панелей, слоев.
   */
  protected abstract void InitForm();

  /**
   * Инициализация компонентов управления (кнопки и прочие контролы располагающиеся на слоях, панелях).
   */
  protected abstract void InitMenu();
}
