package za.ca.cput.adp3capstone.domain;
/* ItineratyDayDomain Class
Author: Luyanda Mbalenhle Makhanya (222788291)
Date: 28 March 2025
        */
import java.time.LocalDate;
import java.util.Objects;

public class ItineraryDay {
      private int itineraryDayId;
      private String itineraryDayName;
      private String itineraryDayDescription;
      private LocalDate itineraryDayDate;
      private double budgetAmount;

      public ItineraryDay(Builder builder) {
          this.itineraryDayId = builder.itineraryDayId;
          this.itineraryDayName = builder.itineraryDayName;
          this.itineraryDayDescription = builder.itineraryDayDescription;
          this.itineraryDayDate = builder.itineraryDayDate;
          this.budgetAmount = builder.budgetAmount;

      }

    public int getItineraryDayId() {
        return itineraryDayId;
    }

    public String getItineraryDayName() {
        return itineraryDayName;
    }

    public String getItineraryDayDescription() {
        return itineraryDayDescription;
    }

    public LocalDate getItineraryDayDate() {
        return itineraryDayDate;
    }

    public double getBudgetAmount() {
        return budgetAmount;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItineraryDay that = (ItineraryDay) o;
        return itineraryDayId == that.itineraryDayId && Double.compare(budgetAmount, that.budgetAmount) == 0 && Objects.equals(itineraryDayName, that.itineraryDayName) && Objects.equals(itineraryDayDescription, that.itineraryDayDescription) && Objects.equals(itineraryDayDate, that.itineraryDayDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itineraryDayId, itineraryDayName, itineraryDayDescription, itineraryDayDate, budgetAmount);
    }

    @Override
    public String toString() {
        return "ItineraryDay{" +
                "itineraryDayId=" + itineraryDayId +
                ", itineraryDayName='" + itineraryDayName + '\'' +
                ", itineraryDayDescription='" + itineraryDayDescription + '\'' +
                ", itineraryDayDate=" + itineraryDayDate +
                ", budgetAmount=" + budgetAmount +
                '}';
    }

    public static class Builder {
        private int itineraryDayId;
        private String itineraryDayName;
        private String itineraryDayDescription;
        private LocalDate itineraryDayDate;
        private double budgetAmount;

        public Builder setItineraryDayId(int itineraryDayId) {
            this.itineraryDayId = itineraryDayId;
            return this;
        }

        public Builder setItineraryDayName(String itineraryDayName) {
            this.itineraryDayName = itineraryDayName;
            return this;
        }

        public Builder setItineraryDayDescription(String itineraryDayDescription) {
            this.itineraryDayDescription = itineraryDayDescription;
            return this;
        }

        public Builder setItineraryDayDate(LocalDate itineraryDayDate) {
            this.itineraryDayDate = itineraryDayDate;
            return this;
        }

        public Builder setBudgetAmount(double budgetAmount) {
            this.budgetAmount = budgetAmount;
            return this;
        }
        public ItineraryDay build() {
            return new ItineraryDay(this);
        }
    }
}
