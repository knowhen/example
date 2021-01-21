package org.when.example.switchable;

/**
 * @author: when
 * @create: 2021-01-21  22:24
 **/
abstract class ComputerAsset extends Asset {
    int deskNumber;

    ComputerAsset(int deskNumber) {
        this.deskNumber = deskNumber;
    }
}
