using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class StrategicMarketingOneViewModel : INotifyPropertyChanged
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

        private int _YearsInBusiness;
        public int YearsInBusiness
        {
            get { return _YearsInBusiness; }
            set
            {
                if (value == _YearsInBusiness)
                    return;

                _YearsInBusiness = value;

                OnPropertyChanged("YearsInBusiness");
            }
        }

        private String _PlansToExpand;
        public String PlansToExpand
        {
            get { return _PlansToExpand; }
            set
            {
                if (value == _PlansToExpand)
                    return;

                _PlansToExpand = value;

                OnPropertyChanged("PansToExpand");
            }
        }

        private int _NumberOfLocations;
        public int NumberOfLocations
        {
            get { return _NumberOfLocations; }
            set
            {
                if (value == _NumberOfLocations)
                    return;

                _NumberOfLocations = value;

                OnPropertyChanged("NumberOfLocations");
            }
        }

        private String _Misconceptions;
        public String Misconceptions
        {
            get { return _Misconceptions; }
            set
            {
                if (value == _Misconceptions)
                    return;

                _Misconceptions = value;

                OnPropertyChanged("Misconceptions");
            }
        }

        private String _SellingAdvantages;
        public String SellingAdvantages
        {
            get { return _SellingAdvantages; }
            set
            {
                if (value == _SellingAdvantages)
                    return;

                _SellingAdvantages = value;

                OnPropertyChanged("SellingAdvantages");
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
