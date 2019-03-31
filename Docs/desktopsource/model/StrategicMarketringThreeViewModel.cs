using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class StrategicMarketingThreeViewModel : INotifyPropertyChanged
    {

        //Property Template
        //private String _prop;
        //public String prop
        //  {
        //    get { return _prop; }
        //    set
        //    {
        //      if (value == _prop)
        //        return;

        //      _prop = value;

        //      OnPropertyChanged("prop");
        //    }
        //  }

        private String _BestMonthA;
        public String BestMonthA
          {
            get { return _BestMonthA; }
            set
            {
              if (value == _BestMonthA)
                return;

              _BestMonthA = value;

              OnPropertyChanged("BestMonthA");
            }
          }

        private String _PoorestMonthA;
        public String PoorestMonthA
          {
            get { return _PoorestMonthA; }
            set
            {
              if (value == _PoorestMonthA)
                return;

              _PoorestMonthA = value;

              OnPropertyChanged("PoorestMonthA");
            }
          }

        private String _BestDayA;
        public String BestDayA
          {
            get { return _BestDayA; }
            set
            {
              if (value == _BestDayA)
                return;

              _BestDayA = value;

              OnPropertyChanged("BestDayA");
            }
          }

        private String _Complaint;
        public String Complaint
          {
            get { return _Complaint; }
            set
            {
              if (value == _Complaint)
                return;

              _Complaint = value;

              OnPropertyChanged("Complaint");
            }
          }

        private String _Compliments;
        public String Compliments
          {
              get { return _Compliments; }
            set
            {
                if (value == _Compliments)
                return;

                _Compliments = value;

              OnPropertyChanged("Compliments");
            }
          }

        private String _MarketingStrategy;
        public String MarketingStrategy
        {
            get { return _MarketingStrategy; }
            set
            {
                if (value == _MarketingStrategy)
                    return;

                _MarketingStrategy = value;

                OnPropertyChanged("MarketingStrategy");
            }
        }

        private String _SocialStrategy;
        public String SocialStrategy
        {
            get { return _SocialStrategy; }
            set
            {
                if (value == _SocialStrategy)
                    return;

                _SocialStrategy = value;

                OnPropertyChanged("SocialStrategy");
            }
        }
        #region INotifyPropertyChanged Handler

        public event PropertyChangedEventHandler PropertyChanged;

        protected void OnPropertyChanged(string propertyName)
        {
            if (PropertyChanged != null)
            {
                PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
            }
        }

        #endregion
    }
}
