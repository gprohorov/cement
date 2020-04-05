package com.pro.cement.model;

import java.time.LocalDateTime;

public class Passing {   //  прохождение вагонов (номеров)  через точку

    private String Id;
    private Point point;          //   точка, через которую проходит вагон. Пока что одна.
    private LocalDateTime time;   //  время прохождения
    private String number;          //  номер, который прошел через точку

}
