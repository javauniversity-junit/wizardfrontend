using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class PresentedToViewModel : INotifyPropertyChanged
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


        private String _ClientBusinessName;
        public String ClientBusinessName
        {
            get { return _ClientBusinessName; }
            set
            {
                if (value == _ClientBusinessName)
                    return;

                _ClientBusinessName = value;

                OnPropertyChanged("ClientBusinessName");
            }
        }

        private String _ClientContactName;
        public String ClientContactName
        {
            get { return _ClientContactName; }
            set
            {
                if (value == _ClientContactName)
                    return;

                _ClientContactName = value;

                OnPropertyChanged("ClientContactName");
            }
        }

        private String _PortfolioManagerName;
        public String PortfolioManagerName
        {
            get { return _PortfolioManagerName; }
            set
            {
                if (value == _PortfolioManagerName)
                    return;

                _PortfolioManagerName = value;

                OnPropertyChanged("PortfolioManagerName");
            }
        }

        private String _PortfolioPhoneNumber;
        public String PortfolioPhoneNumber
        {
            get { return _PortfolioPhoneNumber; }
            set
            {
                if (value == _PortfolioPhoneNumber)
                    return;

                _PortfolioPhoneNumber = value;

                OnPropertyChanged("PortfolioPhoneNumber");
            }
        }

        private String _Station;
        public String Station
        {
            get { return _Station; }
            set
            {
                if (value == _Station)
                    return;

                _Station = value;

                OnPropertyChanged("Station");
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
