package com.example.u3cspappdesign;

public interface InfoManagerBase {

    /** Set the current selected part
     * @param part  the part that should be selected
     */
    public void setCurrentPart(ComputerParts part);

    /** Get the title of the current selected part
     * @return  title of selected part
     */
    public String getName();

    /** Get the image source of the current selected part
     * @return  image source of selected part
     */
    public String getImageSource();

    /** Get the description of the current selected part
     * @return  description of selected part
     */
    public String getDescription();

    /** Get the purchase options of the current selected part
     * @return  purchase options of selected part
     */
    public String getPurchaseOptions();
}
