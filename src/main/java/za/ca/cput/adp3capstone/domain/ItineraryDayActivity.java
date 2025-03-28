package za.ca.cput.adp3capstone.domain;

import java.time.LocalTime;
import java.util.Objects;

public class ItineraryDayActivity {
    private int activityId;
    private int itineraryDayId;
    private String activityName;
    private String activityDescription;
    private LocalTime startTime;
    private LocalTime endTime;
    private  double costPrice;

    public ItineraryDayActivity(Builder builder) {
        this.activityId = builder.activityId;
        this.itineraryDayId = builder.itineraryDayId;
        this.activityName = builder.activityName;
        this.activityDescription = builder.activityDescription;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.costPrice = builder.costPrice;
    }



    public int getActivityId() {
        return activityId;
    }

    public int getitineraryDayId() {
        return itineraryDayId;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public double getCostPrice() {
        return costPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItineraryDayActivity that = (ItineraryDayActivity) o;
        return activityId == that.activityId && itineraryDayId == that.itineraryDayId && Double.compare(costPrice, that.costPrice) == 0 && Objects.equals(activityName, that.activityName) && Objects.equals(activityDescription, that.activityDescription) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityId, itineraryDayId, activityName, activityDescription, startTime, endTime, costPrice);
    }

    @Override
    public String toString() {
        return "ItineraryDayActivity{" +
                "activityId=" + activityId +
                ", ItineraryDayId=" + itineraryDayId +
                ", activityName='" + activityName + '\'' +
                ", activityDescription='" + activityDescription + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", costPrice=" + costPrice +
                '}';
    }

    public static class Builder {
        private int activityId;
        private int itineraryDayId;
        private String activityName;
        private String activityDescription;
        private LocalTime startTime;
        private LocalTime endTime;
        private  double costPrice;


        public Builder setActivityId(int activityId) {
            this.activityId = activityId;
            return this;
        }

        public Builder setItineraryDayId(int ItineraryDayId) {
            this.itineraryDayId = ItineraryDayId;
            return this;
        }

        public Builder setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }

        public Builder setActivityDescription(String activityDescription) {
            this.activityDescription = activityDescription;
            return this;
        }

        public Builder setStartTime(LocalTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(LocalTime endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setCostPrice(double costPrice) {
            this.costPrice = costPrice;
            return this;
        }
        public ItineraryDayActivity build() {
            return new ItineraryDayActivity(this);
        }
    }

}
