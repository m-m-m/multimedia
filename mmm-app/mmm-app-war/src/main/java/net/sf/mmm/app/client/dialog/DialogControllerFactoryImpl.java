/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.app.client.dialog;

import net.sf.mmm.app.client.dialog.home.HomeDialogController;
import net.sf.mmm.app.client.dialog.page.PageDialogController;
import net.sf.mmm.app.client.dialog.test.TestDialogController;
import net.sf.mmm.client.ui.api.dialog.DialogConstants;
import net.sf.mmm.client.ui.base.dialog.AbstractDialogControllerFactory;
import net.sf.mmm.client.ui.base.dialog.DialogController;

/**
 * TODO: this class ...
 *
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public class DialogControllerFactoryImpl extends AbstractDialogControllerFactory {

  /**
   * The constructor.
   */
  public DialogControllerFactoryImpl() {

    super();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected DialogController<?> createPageDialogController() {

    return new PageDialogController();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public DialogController<?> createDialogController(String dialogId) {

    if (dialogId.equals(DialogConstants.DIALOG_ID_HOME)) {
      return new HomeDialogController();
    } else if (dialogId.equals(MmmDialogConstants.DIALOG_ID_TEST)) {
      return new TestDialogController();
    } else {
      return super.createDialogController(dialogId);
    }
  }

}
