package jsettlers.main.android.mainmenu.presenters;

import jsettlers.main.android.mainmenu.navigation.MainMenuNavigator;

/**
 * Created by tompr on 03/02/2017.
 */

public class NewMultiPlayerSetupPresenterPop implements NewMultiPlayerSetupPresenter {
    public NewMultiPlayerSetupPresenterPop(MainMenuNavigator navigator) {
        navigator.popToMenuRoot();
    }

    @Override
    public String getMyPlayerId() {
        return "";
    }

    @Override
    public void initView() {

    }

    @Override
    public void updateViewTitle() {

    }

    @Override
    public void viewFinished() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void startGame() {

    }
}
