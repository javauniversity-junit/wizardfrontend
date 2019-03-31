using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class PlanBMediaViewModel : INotifyPropertyChanged
    {
        public PlanBMediaViewModel()
        {
            this.MediaInvestments = new MediaInvestmentList();
        }
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


        private MediaInvestmentList _MediaInvestments;
        public MediaInvestmentList MediaInvestments
        {
            get { return _MediaInvestments; }
            set
            {
                if (value == _MediaInvestments)
                    return;

                _MediaInvestments = value;

                OnPropertyChanged("prop");
            }
        }

        #region Spiking Months

        private String _SpikeEnumJan;
        public String SpikeEnumJan
        {
            get { return _SpikeEnumJan; }
            set
            {
                if (value == _SpikeEnumJan)
                    return;

                _SpikeEnumJan = value;

                OnPropertyChanged("SpikeEnumJan");
            }
        }

        private String _SpikeEnumFeb;
        public String SpikeEnumFeb
        {
            get { return _SpikeEnumFeb; }
            set
            {
                if (value == _SpikeEnumFeb)
                    return;

                _SpikeEnumFeb = value;

                OnPropertyChanged("SpikeEnumFeb");
            }
        }

        private String _SpikeEnumMar;
        public String SpikeEnumMar
        {
            get { return _SpikeEnumMar; }
            set
            {
                if (value == _SpikeEnumMar)
                    return;

                _SpikeEnumMar = value;

                OnPropertyChanged("SpikeEnumMar");
            }
        }

        private String _SpikeEnumApr;
        public String SpikeEnumApr
        {
            get { return _SpikeEnumApr; }
            set
            {
                if (value == _SpikeEnumApr)
                    return;

                _SpikeEnumApr = value;

                OnPropertyChanged("SpikeEnumApr");
            }
        }

        private String _SpikeEnumMay;
        public String SpikeEnumMay
        {
            get { return _SpikeEnumMay; }
            set
            {
                if (value == _SpikeEnumMay)
                    return;

                _SpikeEnumMay = value;

                OnPropertyChanged("SpikeEnumMay");
            }
        }

        private String _SpikeEnumJun;
        public String SpikeEnumJun
        {
            get { return _SpikeEnumJun; }
            set
            {
                if (value == _SpikeEnumJun)
                    return;

                _SpikeEnumJun = value;

                OnPropertyChanged("SpikeEnumJun");
            }
        }

        private String _SpikeEnumJul;
        public String SpikeEnumJul
        {
            get { return _SpikeEnumJul; }
            set
            {
                if (value == _SpikeEnumJul)
                    return;

                _SpikeEnumJul = value;

                OnPropertyChanged("SpikeEnumJul");
            }
        }

        private String _SpikeEnumAug;
        public String SpikeEnumAug
        {
            get { return _SpikeEnumAug; }
            set
            {
                if (value == _SpikeEnumAug)
                    return;

                _SpikeEnumAug = value;

                OnPropertyChanged("SpikeEnumAug");
            }
        }

        private String _SpikeEnumSept;
        public String SpikeEnumSept
        {
            get { return _SpikeEnumSept; }
            set
            {
                if (value == _SpikeEnumSept)
                    return;

                _SpikeEnumSept = value;

                OnPropertyChanged("SpikeEnumSept");
            }
        }

        private String _SpikeEnumOct;
        public String SpikeEnumOct
        {
            get { return _SpikeEnumOct; }
            set
            {
                if (value == _SpikeEnumOct)
                    return;

                _SpikeEnumOct = value;

                OnPropertyChanged("SpikeEnumOct");
            }
        }

        private String _SpikeEnumNov;
        public String SpikeEnumNov
        {
            get { return _SpikeEnumNov; }
            set
            {
                if (value == _SpikeEnumNov)
                    return;

                _SpikeEnumNov = value;

                OnPropertyChanged("SpikeEnumNov");
            }
        }

        private String _SpikeEnumDec;
        public String SpikeEnumDec
        {
            get { return _SpikeEnumDec; }
            set
            {
                if (value == _SpikeEnumDec)
                    return;

                _SpikeEnumDec = value;

                OnPropertyChanged("SpikeEnumDec");
            }
        }

        #endregion 

        #region Text Helpers Months

        private String _txtStation;
        public String txtStation
        {
            get { return _txtStation; }
            set
            {
                if (value == _txtStation)
                    return;

                _txtStation = value;

                OnPropertyChanged("txtStation");
            }
        }

        private Decimal _txtJan;
        public Decimal txtJan
        {
            get { return _txtJan; }
            set
            {
                if (value == _txtJan)
                    return;

                _txtJan = value;
                TotalMonthlyInvestment();

                OnPropertyChanged("txtJan");
            }
        }

        private Decimal _txtFeb;
        public Decimal txtFeb
        {
            get { return _txtFeb; }
            set
            {
                if (value == _txtFeb)
                    return;

                _txtFeb = value;
                TotalMonthlyInvestment();

                OnPropertyChanged("txtFeb");

            }
        }

        private Decimal _txtMar;
        public Decimal txtMar
        {
            get { return _txtMar; }
            set
            {
                if (value == _txtMar)
                    return;

                _txtMar = value;
                TotalMonthlyInvestment();

                OnPropertyChanged("txtMar");
            }
        }

        private Decimal _txtApr;
        public Decimal txtApr
        {
            get { return _txtApr; }
            set
            {
                if (value == _txtApr)
                    return;

                _txtApr = value;
                TotalMonthlyInvestment();

                OnPropertyChanged("txtApr");
            }
        }

        private Decimal _txtMay;
        public Decimal txtMay
        {
            get { return _txtMay; }
            set
            {
                if (value == _txtMay)
                    return;

                _txtMay = value;
                TotalMonthlyInvestment();

                OnPropertyChanged("txtMay");
            }
        }

        private Decimal _txtJun;
        public Decimal txtJune
        {
            get { return _txtJun; }
            set
            {
                if (value == _txtJun)
                    return;

                _txtJun = value;
                TotalMonthlyInvestment();
                OnPropertyChanged("txtJune");
            }
        }

        private Decimal _txtJul;
        public Decimal txtJuly
        {
            get { return _txtJul; }
            set
            {
                if (value == _txtJul)
                    return;

                _txtJul = value;
                TotalMonthlyInvestment();
                OnPropertyChanged("txtJuly");
            }
        }

        private Decimal _txtAug;
        public Decimal txtAug
        {
            get { return _txtAug; }
            set
            {
                if (value == _txtAug)
                    return;

                _txtAug = value;
                TotalMonthlyInvestment();
                OnPropertyChanged("txtAug");
            }
        }

        private Decimal _txtSept;
        public Decimal txtSept
        {
            get { return _txtSept; }
            set
            {
                if (value == _txtSept)
                    return;

                _txtSept = value;
                TotalMonthlyInvestment();
                OnPropertyChanged("txtSept");
            }
        }

        private Decimal _txtOct;
        public Decimal txtOct
        {
            get { return _txtOct; }
            set
            {
                if (value == _txtOct)
                    return;

                _txtOct = value;
                TotalMonthlyInvestment();
                OnPropertyChanged("txtOct");
            }
        }

        private Decimal _txtNov;
        public Decimal txtNov
        {
            get { return _txtNov; }
            set
            {
                if (value == _txtNov)
                    return;

                _txtNov = value;

                OnPropertyChanged("txtNov");
            }
        }

        private Decimal _txtDec;
        public Decimal txtDec
        {
            get { return _txtDec; }
            set
            {
                if (value == _txtDec)
                    return;

                _txtDec = value;
                TotalMonthlyInvestment();
                OnPropertyChanged("txtDec");
            }
        }

        private Decimal _txtTotal;
        public Decimal txtTotal
        {
            get { return _txtTotal; }
            set
            {
                if (value == _txtTotal)
                    return;

                _txtTotal = value;
                TotalMonthlyInvestment();
                OnPropertyChanged("txtTotal");
            }
        }

        private void TotalMonthlyInvestment()
        {
            txtTotal = txtJan + txtFeb + txtMar + txtApr
            + txtMay + txtJune + txtJuly + txtAug + txtSept + txtOct + txtNov + txtDec;
        }

        #endregion 

        public void AddTotal()
        {
            _MediaInvestments.Add(TotalMediaInvestment());
        }
        private MediaInvestment TotalMediaInvestment()
        {
            MediaInvestment _total = new MediaInvestment();

            foreach (MediaInvestment cMediaInvestment in _MediaInvestments)
            {
                _total.Station = "Total";
                _total.Jan += cMediaInvestment.Jan;
                _total.Feb += cMediaInvestment.Feb;
                _total.Mar += cMediaInvestment.Mar;
                _total.Apr += cMediaInvestment.Apr;
                _total.May += cMediaInvestment.May;
                _total.June += cMediaInvestment.June;
                _total.July += cMediaInvestment.July;
                _total.Aug += cMediaInvestment.Aug;
                _total.Sept += cMediaInvestment.Sept;
                _total.Oct += cMediaInvestment.Oct;
                _total.Nov += cMediaInvestment.Nov;
                _total.Dec += cMediaInvestment.Dec;
                _total.Total += cMediaInvestment.Total;
            }

            return _total;
        }
        public void RemoveTotal()
        {
            bool _remove = false;
            MediaInvestment _total = null;

            foreach (MediaInvestment cMediaInvestment in _MediaInvestments)
            {
                if (cMediaInvestment.Station == "Total")
                {
                    _remove = true;
                    _total = cMediaInvestment;
                }
            }

            if (_remove)
                _MediaInvestments.Remove(_total);


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
