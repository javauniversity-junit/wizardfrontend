using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class StrategicMarketingTwoViewModel : INotifyPropertyChanged
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

        private String _CurrentCompanySlogan;
        public String CurrentCompanySlogan
        {
            get { return _CurrentCompanySlogan; }
            set
            {
                if (value == _CurrentCompanySlogan)
                    return;

                _CurrentCompanySlogan = value;

                OnPropertyChanged("CurrentCompanySlogan");
            }
        }

        private String _CompanyNameProjectImage;
        public String CompanyNameProjectImage
        {
            get { return _CompanyNameProjectImage; }
            set
            {
                if (value == _CompanyNameProjectImage)
                    return;

                _CompanyNameProjectImage = value;

                OnPropertyChanged("CompanyNameProjectImage");
            }
        }

        private bool _CompanySloganProjectImageYes;
        public bool CompanySloganProjectImageYes
        {
            get { return _CompanySloganProjectImageYes; }
            set
            {
                if (value == _CompanySloganProjectImageYes)
                    return;

                _CompanySloganProjectImageYes = value;

                OnPropertyChanged("CompanySloganProjectImage");
            }
        }

        public bool CompanySloganProjectImageNo
        {
            get { return !_CompanySloganProjectImageYes; }
            set
            {
                if (value == !_CompanySloganProjectImageYes)
                    return;

                _CompanySloganProjectImageYes = !value;

                OnPropertyChanged("CompanySloganProjectImage");
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
