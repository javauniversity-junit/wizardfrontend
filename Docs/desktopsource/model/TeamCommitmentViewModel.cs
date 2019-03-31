using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class TeamCommitmentViewModel : INotifyPropertyChanged
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

        private String _TopLevelName;
        public String TopLevelName
        {
            get { return _TopLevelName; }
            set
            {
                if (value == _TopLevelName)
                    return;

                _TopLevelName = value;

                OnPropertyChanged("TopLevelName");
            }
        }
        
        private String _TopLevelTitle;
        public String TopLevelTitle
        {
            get { return _TopLevelTitle; }
            set
            {
                if (value == _TopLevelTitle)
                    return;

                _TopLevelTitle = value;

                OnPropertyChanged("TopLevelTitle");
            }
        }
       
        private String _SecondLevelName;
        public String SecondLevelName
        {
            get { return _SecondLevelName; }
            set
            {
                if (value == _SecondLevelName)
                    return;

                _SecondLevelName = value;

                OnPropertyChanged("SecondLevelName");
            }
        }

        private String _SecondLevelTitle;
        public String SecondLevelTitle
        {
            get { return _SecondLevelTitle; }
            set
            {
                if (value == _SecondLevelTitle)
                    return;

                _SecondLevelTitle = value;

                OnPropertyChanged("SecondLevelTitle");
            }
        }
        

        private String _ThirdLevelName;
        public String ThirdLevelName
        {
            get { return _ThirdLevelName; }
            set
            {
                if (value == _ThirdLevelName)
                    return;

                _ThirdLevelName = value;

                OnPropertyChanged("ThirdLevelName");
            }
        }

        private String _ThirdLevelTitle;
        public String ThirdLevelTitle
        {
            get { return _ThirdLevelTitle; }
            set
            {
                if (value == _ThirdLevelTitle)
                    return;

                _ThirdLevelTitle = value;

                OnPropertyChanged("ThirdLevelTitle");
            }
        }
        
        private String _FourthLevelName;
        public String FourthLevelName
        {
            get { return _FourthLevelName; }
            set
            {
                if (value == _FourthLevelName)
                    return;

                _FourthLevelName = value;

                OnPropertyChanged("FourthLevelName");
            }
        }

        private String _FourthLevelTitle;
        public String FourthLevelTitle
        {
            get { return _FourthLevelTitle; }
            set
            {
                if (value == _FourthLevelTitle)
                    return;

                _FourthLevelTitle = value;

                OnPropertyChanged("FourthLevelTitle");
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
