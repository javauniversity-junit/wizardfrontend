using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class TargetMarketingViewModel : INotifyPropertyChanged
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

        private Decimal _pctMen;
        public Decimal pctMen
        {
            get { return _pctMen; }
            set
            {
                if (value == _pctMen)
                    return;

                _pctMen = value;

                OnPropertyChanged("pctMen");
            }
        }

        private Decimal _pctWomen;
        public Decimal pctWomen
        {
            get { return _pctWomen; }
            set
            {
                if (value == _pctWomen)
                    return;

                _pctWomen = value;

                OnPropertyChanged("pctWomen");
            }
        }

        private String _DescribeIdealTargetConsumer;
        public String DescribeIdealTargetConsumer
        {
            get { return _DescribeIdealTargetConsumer; }
            set
            {
                if (value == _DescribeIdealTargetConsumer)
                    return;

                _DescribeIdealTargetConsumer = value;

                OnPropertyChanged("DescribeIdealTargetConsumer");
            }
        }

        private String _HouseholdIncome;
        public String HouseholdIncome
        {
            get { return _HouseholdIncome; }
            set
            {
                if (value == _HouseholdIncome)
                    return;

                _HouseholdIncome = value;

                OnPropertyChanged("HouseholdIncome");
            }
        }

        #region Lenograph

        private Decimal _want12to18;
        public Decimal want12to18
        {
            get { return _want12to18; }
            set
            {
                if (value == _want12to18)
                    return;

                _want12to18 = value;

                OnPropertyChanged("want12to18");
            }
        }

        private Decimal _want19to25;
        public Decimal want19to25
        {
            get { return _want19to25; }
            set
            {
                if (value == _want19to25)
                    return;

                _want19to25 = value;

                OnPropertyChanged("want19to25");
            }
        }

        private Decimal _want26to35;
        public Decimal want26to35
        {
            get { return _want26to35; }
            set
            {
                if (value == _want26to35)
                    return;

                _want26to35 = value;

                OnPropertyChanged("want26to35");
            }
        }

        private Decimal _want36to45;
        public Decimal want36to45
        {
            get { return _want36to45; }
            set
            {
                if (value == _want36to45)
                    return;

                _want36to45 = value;

                OnPropertyChanged("want36to45");
            }
        }

        private Decimal _want46to55;
        public Decimal want46to55
        {
            get { return _want46to55; }
            set
            {
                if (value == _want46to55)
                    return;

                _want46to55 = value;

                OnPropertyChanged("want46to55");
            }
        }

        private Decimal _want55Plus;
        public Decimal want55Plus
        {
            get { return _want55Plus; }
            set
            {
                if (value == _want55Plus)
                    return;

                _want55Plus = value;

                OnPropertyChanged("want55Plus");
            }
        }

        private Decimal _have12to18;
        public Decimal have12to18
        {
            get { return _have12to18; }
            set
            {
                if (value == _have12to18)
                    return;

                _have12to18 = value;

                OnPropertyChanged("have12to18");
            }
        }

        private Decimal _have19to25;
        public Decimal have19to25
        {
            get { return _have19to25; }
            set
            {
                if (value == _have19to25)
                    return;

                _have19to25 = value;

                OnPropertyChanged("have19to25");
            }
        }

        private Decimal _have26to35;
        public Decimal have26to35
        {
            get { return _have26to35; }
            set
            {
                if (value == _have26to35)
                    return;

                _have26to35 = value;

                OnPropertyChanged("have26to35");
            }
        }

        private Decimal _have36to45;
        public Decimal have36to45
        {
            get { return _have36to45; }
            set
            {
                if (value == _have36to45)
                    return;

                _have36to45 = value;

                OnPropertyChanged("have36to45");
            }
        }

        private Decimal _have46to55;
        public Decimal have46to55
        {
            get { return _have46to55; }
            set
            {
                if (value == _have46to55)
                    return;

                _have46to55 = value;

                OnPropertyChanged("have46to55");
            }
        }

        private Decimal _have56Plus;
        public Decimal have56Plus
        {
            get { return _have56Plus; }
            set
            {
                if (value == _have56Plus)
                    return;

                _have56Plus = value;

                OnPropertyChanged("have56Plus");
            }
        }

        #endregion
    

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
