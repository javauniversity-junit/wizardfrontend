-- phpMyAdmin SQL Dump
-- version 4.4.15.10
-- https://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 16, 2018 at 11:02 AM
-- Server version: 5.5.60-MariaDB
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `license`
--

-- --------------------------------------------------------

--
-- Table structure for table `agent`
--

CREATE TABLE IF NOT EXISTS `agent` (
  `agentid` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(50) NOT NULL,
  `contact_id` int(11) NOT NULL,
  `active` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE IF NOT EXISTS `contact` (
  `contact_id` int(11) NOT NULL,
  `name` varchar(250) NOT NULL,
  `uuid` varchar(200) NOT NULL,
  `license` varchar(3000) NOT NULL,
  `general_information` varchar(3000) NOT NULL,
  `phone` varchar(250) DEFAULT NULL,
  `usage_date` datetime DEFAULT NULL,
  `created_date` datetime NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL,
  `address` varchar(250) NOT NULL,
  `active` tinyint(4) DEFAULT NULL,
  `client_type` varchar(45) NOT NULL,
  `streetaddress` varchar(250) NOT NULL,
  `city` varchar(250) NOT NULL,
  `state` varchar(250) NOT NULL,
  `zipcode` varchar(250) NOT NULL,
  `emailaddress` varchar(250) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`contact_id`, `name`, `uuid`, `license`, `general_information`, `phone`, `usage_date`, `created_date`, `start_date`, `end_date`, `address`, `active`, `client_type`, `streetaddress`, `city`, `state`, `zipcode`, `emailaddress`, `password`) VALUES
(1, 'Mark Hildebrand', '0825f2d3-f57c-4057-8515-6d497997b8a7', 'y8V9vQD3d1LEoWicIr9ddOxM6hsasE1sVkgvInpE1fI8WrvfsRyhZ22jkAizz4qMm9Muiv81am8blad4tWsrU3M0Kv8KkG46Lg+f2zC/3t/Uko7jRqyZfF0KmkHsFnRt', ' Casper, WY', '3073330964', '2017-09-07 21:54:10', '2017-07-15 07:29:19', '2017-01-04 00:10:00', '2019-01-31 00:03:00', 'mhildebrand@kcwy13.com', 0, 'TV', 'PO Box 1540', 'Mills', 'WY', '82644', '', ''),
(4, 'michael guld', '2ff153db-5f7e-4a29-92e8-9ee9e68725c0', 'nwc634n8Xd03gSlMdGWWBxmH4FJqYGjl1YvLXAJwPO79ZcUAVNx7pjA48VwhKBmSfQ9/kbYagbn48lllgD35JsiC9GQP4BrwXnUfEYHX9ewQAk1HearEHjQlBSsYbyih', 'this is a test today', '8043567006', '2017-09-11 11:01:43', '2017-09-06 12:16:05', '2017-01-06 00:09:00', '2022-01-30 00:09:00', 'natalie.guld@guldresource.com', 1, 'Radio', '3434 edwards mill rd.', 'Raleigh', 'NC', '27612', '', ''),
(5, 'Joe Ebert', '784c7a6f-3c8e-4432-a955-1d56b8032f26', 'ph6R5ZiRgjQQ+kfYEf8A0fFo/Zn1iPEWu3zePsdgWJfyLg+3j+92ZaimgiERBwvBRI/W6MJ0hjyK4MmHp1xJZuDCkLVyd3f81PJKRGW3087CSGJ9IVWTcks/M78jDIUL', 'Rochester', '5852888400', '2017-09-06 12:53:18', '2017-09-06 12:53:18', '2017-01-04 00:10:00', '2018-01-28 00:02:00', 'jebert@wroctv.com', 0, 'TV', '', '', '', '', '', ''),
(6, 'RJ Wilson', '5015f17c-fa6a-419a-a149-f8cc4828d13b', 'f8jrjosYRx6tBErXQf3je3xgAUPpH+ZLdqSXJb9iooealVexB52HxNuEjkwMTZoAz2Pjx8sbhGR4jINaNnCKTSE9GRwDDfpcLK4hIDS4RIBX2Ep3q/9iYKT4SVrrVxv5', 'Nexstar Altoona', '8149421010', '2017-09-11 19:44:50', '2017-09-11 19:44:50', '2017-01-04 00:10:00', '2018-01-30 00:06:00', 'rwilson@wtajtv.com', 1, 'TV', '', '', '', '', '', ''),
(7, 'Lucas Beneke', 'f2e112aa-099c-40a8-ab13-5ff1f383675c', 'f8jrjosYRx6tBErXQf3je7aavC1RWc8mAXIzbBh4GtIiMgH+z3V84bYnCEtBoqJVCxQmPfXyfp72aoB79l2ae7VgDoIqLvelPil256V82JYuMf17tZnbDK6yTvVefXz5', 'Fargo', '3207790304', '2017-09-13 18:20:59', '2017-09-13 18:20:59', '2017-01-13 00:09:00', '2018-01-30 00:11:00', 'lucas.beneke@mwcradio.com', 1, 'Radio', '', '', '', '', '', ''),
(8, 'Neil Raddenbach', 'bfef4f5b-5288-4234-b70b-653ecd8377a4', 'lePrqW6fNiIH5vuZhCs0G4UYnjS+7Z09muSbcWFFf5+onzhy2vMeeCjWApnW1Hi4Gg13eDHMrmjDt8oJhhJp1GOux1875bFBJ77moGfyLq3a9TMXNfuCSS+kh71mrHnH', 'Midwest Wausau and Sioux Falls', '7158421672', '2017-09-13 18:33:03', '2017-09-13 18:33:03', '2017-01-07 00:11:00', '2019-01-31 00:05:00', 'neil.raddenbach@mwcradio.com', 1, 'Radio', '', '', '', '', '', ''),
(9, 'Todd Zschernitz', '0a3d9704-f9c9-4fdd-8be0-8d74d55c3d36', 'lePrqW6fNiIH5vuZhCs0G3WzZCGpqsl2t7TQtjs6gU00GSQSX/602n4obd+W2IgUlrm3Jpr/WG3D0LGKWVs1xXSSclPxiZnFUUKUqUvEX05lRJmUoG3oI+8+epoJW29c', 'Eau Claire', '7154569334', '2017-10-02 16:23:49', '2017-10-02 16:23:49', '2017-01-04 00:10:00', '2019-01-30 00:04:00', 'todd.zschernitz@weau.com', 1, 'TV', '', '', '', '', '', ''),
(10, 'Dan Jordan', 'a4f06d34-4198-4be6-8af1-d5caa4a08d82', 'lePrqW6fNiIH5vuZhCs0G3PvGJ2/0s46z1iJcfUcOqFH2ms/VlVuyMjgIfpEzEtsEYWQbBO2kV7upW//j1HEgG/WN+IUoL2nu2iio5oBUgStSL8FHNYhgNzRhOFpoqkT', 'Evansville', '8124247777', '2017-10-02 16:26:22', '2017-10-02 16:26:22', '2017-01-04 00:10:00', '2019-01-31 00:01:00', 'djordan@tristatehomepage.com', 1, 'TV', '', '', '', '', '', ''),
(11, 'Garrett Levos', '9b1dbfcf-85a5-4fc9-be51-2bf76a37c7ee', 'y8V9vQD3d1LEoWicIr9ddFZd+PRipxM+8lXesGSgLcnxituRcqvZsKpljIS3/OiewcyoB9auP5IbgRYmdGF0cfOTAGgzLJyygAGvb4XFcEg4amTBheurzXL6PxpMl1lK', 'Sioux City', '7128982789', '2017-10-03 19:06:31', '2017-10-03 11:31:43', '2017-01-03 00:10:00', '2019-01-31 00:10:00', 'glevos@kcautv.com', 1, 'TV', '5993 Gordon Drive', 'Sioux City', 'IA', '51106', '', ''),
(12, 'Jacob Schilcher', 'f1436e35-5464-444c-9503-252fc3fd5d09', 'lePrqW6fNiIH5vuZhCs0G9CFXsJEQGQRtvW+3pKxnlZarjep9MYOmPkIvGY1SbYZqBerJUs5w8svKqLnb471hRGQfRQtV40nse/fKlpBw4os5AVxjGaPB3gfTQ1vS6ki', 'Green Bay and Sheboygan', '9204353771', '2017-10-04 16:52:03', '2017-10-04 16:52:03', '2017-01-07 00:11:00', '2019-01-28 00:02:00', 'jacob.schilcher@mwcradio.com', 1, 'Radio', '', '', '', '', '', ''),
(13, 'Al Boolani', '49cb7cc7-8b4e-48cb-a16b-96207f7a4962', 'f8jrjosYRx6tBErXQf3je4atN6uDl5tOEgSiPNIt+w/BLA3USGue35GE/XlsRP/B2DjPFcQEtjo7bIMU425YdwaxvzvFmAX7iPl3pEFpiXhq+XfG/J2JQyQGImg/JaRi', 'Houston', '7133822122', '2017-10-04 16:58:19', '2017-10-04 16:58:19', '2017-01-04 00:10:00', '2018-01-31 00:12:00', 'aboolani@kube57.com', 1, 'TV', '', '', '', '', '', ''),
(14, 'Andy Low', 'a2772b00-b162-450b-9f50-c31a9a371ec3', 'ASUE19R0uJUQVfX4RRP7I40marelJ3pbks64O+hfOIXpCnpo8ql18ocdqeY5Q4V67aVoxYulsOlmoso6pEpFrss2AcGxCxlP95JQh3zzAEpf8ax3yYAgSpolEOC8dF/X', 'Kalamazoo', '2693457121', '2017-10-04 17:01:05', '2017-10-04 17:01:05', '2017-01-04 00:10:00', '2020-01-29 00:04:00', 'andy.low@mwcradio.com', 1, 'Radio', '4200 W. Main Street', 'Kalamazoo', 'MI', '49006', '', ''),
(15, 'John Busch', '2c019312-9fcf-44cd-bf2b-62e213816419', 'f8jrjosYRx6tBErXQf3jezvT69ncBk4nV58zvrnYpdKaUMXDgK++HJPsZHF1+PpLUzctJSqm50korspjZpXD71KoPQPDknSLfa1F/sgKzEEkwsNq7MEHK4dN9JG4NuMb', 'Los Angeles', '9494429800', '2017-10-04 17:28:55', '2017-10-04 17:28:55', '2017-01-04 00:10:00', '2018-01-31 00:12:00', 'jbusch@vanguardmis.com', 1, 'TV', '', '', '', '', '', ''),
(16, 'Andy Low', '8175f99e-7638-4800-af60-158ac101a448', 'y8V9vQD3d1LEoWicIr9ddODlP70WnjPfkoyV4ty0dDy6aXiV0lU3gv31aalQ1mzvaOIdZ+Wfq38EYQY2KWxnIjmA7HHSPkA20iK5EHjsdcyprFGPIhCq7YgrIT69KCus', 'Lansing', '2693457121', '2017-10-04 17:30:30', '2017-10-04 17:30:30', '2017-01-04 00:10:00', '2019-01-31 00:08:00', 'andy.low@mwcradio.com', 1, 'Radio', '2495 Cedar Street', 'Lansing', 'MI', '48842', '', ''),
(17, 'Ken Logsdon', '82190c69-ca07-46e3-8c96-4e1fc4b779fc', 'lePrqW6fNiIH5vuZhCs0G/6grdIqJbiNSPzR8GakCxa7j+fR9c6o0kMz01GkH8O1SEzOJ6Q4tBh2V92Y39E1DEP8Ki7/jYsaOVw3Yd/+Ul6dk7PW7HkxaJiTl/2PM8yv', 'Louisville', '5025850836', '2017-10-04 17:32:20', '2017-10-04 17:32:20', '2017-01-04 00:10:00', '2019-01-31 00:03:00', 'klogsdon@wdrb.com', 1, 'TV', '', '', '', '', '', ''),
(18, 'Jeffery Williams', '0e9393e1-10ce-42dc-98c4-a4165a1004ac', 'Xfi0v8pn9XhdVu1amsToEdU2Ef7+YAlLUBwfZRRtWGFYN93K4+JLspmJkFeNIGVX5greMOgqVP/4BJDTMg0qCkdGR8kAcK7ck4ylRgZXdngwArae/DCifgJhoQJkuQX9', 'Saginaw', '9897558191', '2017-10-04 17:35:17', '2017-10-04 17:35:17', '2017-01-04 00:10:00', '2019-01-10 00:10:00', 'jeffery.williams@wnem.com', 1, 'TV', '107 N. Franklin Street', 'Saginaw', 'MI', '48607', '', ''),
(19, 'Jeff Pugmire', '2e951ee7-cf5c-47ba-8277-b09790da94e2', 'f8jrjosYRx6tBErXQf3je69dmPLQ6xSlrQqWq+ZSGZN81HGVWD4P2YloDi8Xcbz85A92Sto4Yk8omtR2RjpwxDPty66WPEpnMvuSChyQSjC75jAZPExzF2B0dfEM2IK4', 'Tucson', '6029180459', '2017-10-04 17:39:12', '2017-10-04 17:39:12', '2017-01-04 00:10:00', '2018-01-31 00:01:00', 'jpugmire@12news.com', 1, 'TV', '', '', '', '', '', ''),
(20, 'Billy Ward', 'e0a567c5-5a93-4648-8bc3-32aca24fabdd', 'S+KSVv9gPE8keco9lKRCNTZhAgxlKXEj1YAaXllBCff9n2fBLNs8dT3v2uJVVLhLLu41EFZNdmNlVMc5LV4LUovti1Nd2INiM13bugH1+wvWYN8ugS7CYPM3I3oWGl1G', 'Panama City', '8508329850', '2017-10-04 18:00:15', '2017-10-04 18:00:15', '2017-01-04 00:10:00', '2017-01-31 00:12:00', 'bward@wmbb.com', 1, 'TV', 'Street address', 'city', 'AL', '25679', '', ''),
(21, 'Bruce Wesley', '17e9049f-fa26-4154-ae1f-52e1dca59b91', 'lePrqW6fNiIH5vuZhCs0G/6grdIqJbiNSPzR8GakCxa7j+fR9c6o0kMz01GkH8O1sHTOwHE+BWOD8msf2QPe1fmprbEEv9nnasT8A1s/Zw0NYe1Df7KFbJGPS7eieVuA', 'Terre Haute', '8126962121', '2017-10-04 18:03:42', '2017-10-04 18:03:42', '2017-01-04 00:10:00', '2019-01-31 00:03:00', 'bwesley@wtwo.com', 1, 'TV', '', '', '', '', '', ''),
(22, 'Randall Whan', '9aeb1db2-c1e6-428d-95db-97814c73e5cb', 'lePrqW6fNiIH5vuZhCs0G9CFXsJEQGQRtvW+3pKxnlZw8rFhl6K6bM1AZ6mO882y2EK7TbgBk4Z6T2JU0u6Wj6k12ONdQK5o6ij+iDZeprFkqb1zbfS9p+Fd7OUunCLO', 'Abilene', '3256924242', '2017-10-05 10:32:27', '2017-10-05 10:32:27', '2017-01-04 00:10:00', '2019-01-28 00:02:00', 'rwhan@ktab.tv', 1, 'TV', '4510 South 14th Street', 'Abilene', 'TX', '79605', '', ''),
(23, 'Tim Free', '97459b46-b0f4-41dc-9309-1e2e1054e6d2', 'f8jrjosYRx6tBErXQf3je8V+reSii7slktZt3t/NrTYMw8w6ocOMj7Ipes5Gj3E557fN/5CcxkQBN+RWQUzxT48quIY0qQVL+/WOQ87Bv9l/pBCulZhw4Pa1/bOZruQt', 'Charlottesville', '4342421919', '2017-10-05 10:47:40', '2017-10-05 10:47:40', '2017-01-04 00:10:00', '2018-01-31 00:07:00', 'tim.free@newsplex.com', 1, 'TV', '', '', '', '', '', ''),
(24, 'Bob Berger', '987b751e-b330-4700-bfb5-ed872e113c04', 'y8V9vQD3d1LEoWicIr9ddCione08NaUCA16WjYYyJN2ucvqBtms2WuEkjl7gFYgbDnTfIJuDHtawUTVKWDPw/1Y71MROJ9Fc5RkKjKrDyF7NGQD7W1/fOtpEn2/OHktc', 'Quad Cities', '3092832393', '2017-11-06 11:28:15', '2017-11-06 10:02:43', '2017-01-05 00:11:00', '2019-01-31 00:12:00', 'rberger@whbf.com', 1, 'TV', '231 18th Street', 'Quad Cities', 'IL', '61201', '', ''),
(25, 'Scott Nelson', '3424fa23-57e7-4f57-bc1a-15f9e081c9d5', 'f8jrjosYRx6tBErXQf3jew4iByFOhYv6CkLCVgAL70WmuDi6MYcFBlgLa4i6UH3TabEfJgTCvI/7x5YLb4Zkek/jlRfy04Oxo4GECcFiQR60qGh1362Z/WtlfpkMkW38', 'Detroit', '5867903838', '2017-11-06 10:34:36', '2017-11-06 10:34:36', '2017-01-06 00:11:00', '2018-01-30 00:11:00', 'scottn@wadldetroit.com', 1, 'TV', '', '', '', '', '', ''),
(26, 'Mike Doty', '56647d07-72c9-468d-bf6b-bb60489d4d9d', 'y8V9vQD3d1LEoWicIr9ddCione08NaUCA16WjYYyJN2ucvqBtms2WuEkjl7gFYgbnyC3vFg80Kw+TwHHl/vEu1fdfgKqrQVVOoZK1cDvz4OVTovscKlNrGhXTjZEI0xR', 'Hagerstown', '3017974400', '2017-11-06 10:44:45', '2017-11-06 10:44:45', '2017-01-05 00:11:00', '2019-01-31 00:12:00', 'mdoty@localdvm.com', 1, 'TV', '13 E. Washington Street', 'Hagerstown', 'MD', '21740', '', ''),
(27, 'Hilton Woods', '26122fbc-b017-45cf-887d-d036bb2d2680', 'f8jrjosYRx6tBErXQf3je+PI0BhosFBaUQ/XVSAF0EKqY2uqSPrzCYe1vVNLJZvAu+ceWEyPMjMCKmss45nu4Zr6OAV06gs0rPdAmTEiOP8AddlxwKQliQw9VsSzJRD5', 'Hurley''s Media Cayman Islands', '3453336500', '2017-12-22 12:04:28', '2017-12-22 12:04:28', '2017-01-22 00:12:00', '2019-01-01 00:01:00', 'hiltonwoods@c3.ky', 1, 'TV', '', '', '', '', '', ''),
(28, 'Jim Walton', 'e5415901-ffc0-470c-a750-efcaf6c7d079', 'lePrqW6fNiIH5vuZhCs0G4UYnjS+7Z09muSbcWFFf5/mGceqsY/I4GF+Vi/H4G6mozQq9i12xXyZC98OGBtAUIliCPkvZyRaic2SbVySuKse7hyTKyZZsJIw+onjOyTG', 'Greensboro', '3363795658', '2018-05-01 15:08:43', '2018-05-01 15:08:43', '2018-01-01 00:05:00', '2019-01-31 00:05:00', 'jcwalton@wfmy.com', 1, 'TV', '', '', '', '', '', ''),
(29, 'Sean Waddle', '18d52cd1-ec55-4168-9f5b-6f9ce41fbec9', 'y8V9vQD3d1LEoWicIr9ddCione08NaUCA16WjYYyJN01liB1+AucgVAZ3w4c4RCKtjjodMzq1wqnApfQ/5+67eFwcQFfO5vEG3WoEllr4Mms1Rz5LkGP5r73UnxDcnRv', 'Sean', '5406567071', '2018-09-24 19:47:52', '2018-09-24 19:47:52', '2018-01-24 00:09:00', '2019-01-31 00:12:00', 'sean.waddle@pathoscommunication.com', 1, 'TV', '1301 Main Street', 'Lynchburg', 'VA', '24504', '', ''),
(30, 'Don Hunt', '5d5668d4-ccc3-41ed-a639-b30c50bcaf04', 'y8V9vQD3d1LEoWicIr9ddNS9Z33yu/gWhiOUXShCkCr+zhKWBiPFrItSuuo3wHPo+Tkm2Wb2yaZ9ox2wam8Sv6MUTMK3obqEswkGogx7dKvj6NqVO4IFTi9n8RT2JyQF', 'Elmira, NY', '6077335518', '2018-10-30 20:49:42', '2018-10-30 20:49:42', '2018-01-30 00:10:00', '2019-01-30 00:11:00', 'donhunt@wetmtv.com', 1, 'TV', '101 East Water Street', 'Elmira', 'NY', '14901', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `wizard`
--

CREATE TABLE IF NOT EXISTS `wizard` (
  `wizardid` int(11) NOT NULL,
  `agentid` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `wizarddata`
--

CREATE TABLE IF NOT EXISTS `wizarddata` (
  `wizarddataid` int(11) NOT NULL,
  `pagedata` varchar(500) NOT NULL,
  `wizardid` int(11) NOT NULL,
  `pagename` varchar(50) NOT NULL,
  `pagesequence` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `agent`
--
ALTER TABLE `agent`
  ADD PRIMARY KEY (`agentid`),
  ADD UNIQUE KEY `nameindex` (`name`);

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`contact_id`);

--
-- Indexes for table `wizard`
--
ALTER TABLE `wizard`
  ADD PRIMARY KEY (`wizardid`);

--
-- Indexes for table `wizarddata`
--
ALTER TABLE `wizarddata`
  ADD PRIMARY KEY (`wizarddataid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `agent`
--
ALTER TABLE `agent`
  MODIFY `agentid` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `contact_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `wizard`
--
ALTER TABLE `wizard`
  MODIFY `wizardid` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `wizarddata`
--
ALTER TABLE `wizarddata`
  MODIFY `wizarddataid` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
