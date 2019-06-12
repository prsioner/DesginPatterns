package com.prsioner.desginpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.prsioner.desginpatterns.strategyPattern.CommonPeople;
import com.prsioner.desginpatterns.strategyPattern.Defender;
import com.prsioner.desginpatterns.strategyPattern.Knight;
import com.prsioner.desginpatterns.strategyPattern.SwordWeapon;
import com.prsioner.desginpatterns.strategyPattern.TheKing;
import com.prsioner.desginpatterns.strategyPattern.Weapon;
import com.prsioner.desginpatterns.strategyPattern.WoodenWeapon;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
/**
 * @author Create by lql.
 * @date 2019/6/12 10:02
 * description:模式执行演示
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_strategy_pattern)
    TextView tvStrategyPattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.tv_strategy_pattern)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.tv_strategy_pattern:
                executeStrategyPattern();
                break;
        }
    }

    /**
     * 策略模式
     */
    private void executeStrategyPattern() {

        Defender defender = new TheKing();
        //为国王铸造一把剑
        Weapon weapon = new SwordWeapon();
        defender.setWeapon(weapon);
        defender.fight();

        for (int i =0;i<5;i++){
            Defender knight = new Knight();
            Weapon weapon2 = new SwordWeapon();
            knight.setWeapon(weapon2);
            knight.fight();
        }


            Defender people1 = new CommonPeople();
            Defender people2 = new CommonPeople();
            Weapon weapon3 = new WoodenWeapon();
            Weapon weapon4 = new SwordWeapon();
            people1.setWeapon(weapon3);
            people2.setWeapon(weapon4);
            people1.fight();
            people2.fight();



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
