package com.company;

import com.company.engine.EngineMain;
import com.company.graphics.GUI;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        //запуск главного экрана (нужен класс который Создавать шаблоны форм с экранами, замутить переключение между экранами, все дела)
        //настройки (ну будет файлик конфиг с которого будем тянуть параметры игры, размер экрана и т.д.)
        //создание (class CreateCharacter) или загрузка персонажа (class LoadSaveCharacter)
        //запуск игры (class EngineMain схема игрового процесса)
        GUI app = new GUI();
        app.TestGUI();
        EngineMain engineMain = new EngineMain();
        engineMain.startGame();
    }
}