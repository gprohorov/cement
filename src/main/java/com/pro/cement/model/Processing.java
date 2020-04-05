package com.pro.cement.model;

import java.time.LocalDateTime;

public class Processing {  //  обработка кадра (распознавание)

    private String id;
    private LocalDateTime time;     //  время обработки. Нек путать со временем кадра
    private  Cadr cadr;            // собственно сам кадр
    private  String number;        //  номер вагона, который получился в результате распознавания.
    private int quality;           //  качество распознавание. В диапазоне 1 ... 100
    private boolean success;      //  номер распознан корректно. То есть валидирован.


}
