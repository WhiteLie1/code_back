class ShoppingList extends React.Component{
    render() {
        return(
            <div className="shopping-list">
                <h1>Shopping List for {this.props.name}</h1>
                <ul>
                    <li>Instragram</li>
                    <li>WhatsApp</li>
                    <li>Oculus</li>
                </ul>


            </div>
        )

    }
}
export default ShoppingList;