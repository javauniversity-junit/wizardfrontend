using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class MarketPlaceCompetitionViewModel : INotifyPropertyChanged
    {
        // tms
        private String _CompetitionA;
        public String CompetitionA
        {
            get { return _CompetitionA; }
            set
            {
                if (value == _CompetitionA)
                    return;

                _CompetitionA = value;

                OnPropertyChanged("CompetitionA");
            }
        }

        private String _CompetitionB;
        public String CompetitionB
        {
            get { return _CompetitionB; }
            set
            {
                if (value == _CompetitionB)
                    return;

                _CompetitionB = value;

                OnPropertyChanged("CompetitionB");
            }
        }

        private String _CompetitionStrengthA;
        public String CompetitionStrengthA
        {
            get { return _CompetitionStrengthA; }
            set
            {
                if (value == _CompetitionStrengthA)
                    return;

                _CompetitionStrengthA = value;

                OnPropertyChanged("CompetitionStrengthA");
            }
        }

        private String _CompetitionStrengthB;
        public String CompetitionStrengthB
        {
            get { return _CompetitionStrengthB; }
            set
            {
                if (value == _CompetitionStrengthB)
                    return;

                _CompetitionStrengthB = value;

                OnPropertyChanged("CompetitionStrengthB");
            }
        }

        private String _CompetitionWeaknessA;
        public String CompetitionWeaknessA
        {
            get { return _CompetitionWeaknessA; }
            set
            {
                if (value == _CompetitionWeaknessA)
                    return;

                _CompetitionWeaknessA = value;

                OnPropertyChanged("CompetitionWeaknessA");
            }
        }

        private String _CompetitionWeaknessB;
        public String CompetitionWeaknessB
        {
            get { return _CompetitionWeaknessB; }
            set
            {
                if (value == _CompetitionWeaknessB)
                    return;

                _CompetitionWeaknessB = value;

                OnPropertyChanged("CompetitionWeaknessB");
            }
        }

        // tms

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

        private String _FirstTierBusiness;
        public String FirstTierBusiness
          {
            get { return _FirstTierBusiness; }
            set
            {
              if (value == _FirstTierBusiness)
                return;

              _FirstTierBusiness = value;

              OnPropertyChanged("FirstTierBusiness");

                // tms
                _CompetitionA = value;

                OnPropertyChanged("CompetitionA");
                // tms
            }
        }

        private String _SecondTierBusiness;
        public String SecondTierBusiness
          {
            get { return _SecondTierBusiness; }
            set
            {
              if (value == _SecondTierBusiness)
                return;

              _SecondTierBusiness = value;

              OnPropertyChanged("SecondTierBusiness");

                // tms
                _CompetitionB = value;

                OnPropertyChanged("CompetitionB");
                // tms
            }
          }

        private String _ThirdTierBusiness;
        public String ThirdTierBusiness
          {
            get { return _ThirdTierBusiness; }
            set
            {
              if (value == _ThirdTierBusiness)
                return;

              _ThirdTierBusiness = value;

              OnPropertyChanged("prop");
            }
          }

        private String _FourthTierBusiness;
        public String FourthTierBusiness
          {
              get { return _FourthTierBusiness; }
            set
            {
                if (value == _FourthTierBusiness)
                return;

                _FourthTierBusiness = value;

              OnPropertyChanged("prop");
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
