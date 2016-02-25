package com.example.awesomefat.linkedlist;

import android.view.View;

/**
 * Created by awesomefat on 2/23/16.
 */
public class TOHCore
{
    static TowerFragment tower1 = null;
    static TowerFragment tower2 = null;
    static TowerFragment tower3 = null;

    static void toggleTowerButtons(TowerFragment sourceTower)
    {
        TowerFragment[] towerCollection = {tower1, tower2, tower3};
        sourceTower.setButtonText("SOURCE");
        for(TowerFragment tower : towerCollection)
        {
            if(tower != sourceTower)
            {
                tower.setButtonText("PUSH");

                //need a click listener for specific tower clicked, set towerclicked var to that tower
                //so that disk can be added to JUST that one

                public void TowerButtonClicked(View sender)
                {
                    if (sender == tower1)
                    {
                        System.out.println("**** add front button pressed");
                    }
                    else if (sender == tower2)
                    {
                        System.out.println("**** add end button pressed");
                    }
                    else if (sender == tower3)
                    {
                        System.out.println("**** tower3 button pressed");
                    }
                }

                towerClicked.addDisk(4);

                //remove from source tower
                sourceTower.removeDisk(4);
            }
        }
    }
}
