package com.bloc.inherit;

// CLASS DEFINITION GOES HERE

class Chihuahua extends Dog {

@Override
    public void feed(){
        mWeight += WEIGHT_GAINED_FROM_FEEDING;
        // Pre-increment feed counter
        if (++mFeedCounter == 5) {
            changeSize(true);
            mFeedCounter = 0;
        }

    }

}