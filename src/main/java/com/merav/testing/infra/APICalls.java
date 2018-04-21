package com.merav.testing.infra;

public enum APICalls {
    DAILY_SUMMARY { //“daily	summary”
        @Override
        public String toString(){ return "users/profile/daily_summary/extended";}
    },

    DAILY_JOURNAL{ //”daily	journal”
        @Override
        public String toString() {return  "journals/extended";}
    },

    SLEEP_PROFILE{ //”sleep	profile
        @Override
        public String toString() {return  "sleep";}
    }
}
