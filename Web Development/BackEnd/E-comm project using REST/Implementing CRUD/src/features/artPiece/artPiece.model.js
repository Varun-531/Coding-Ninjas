// src/features/artPiece/artPiece.model.js
export default class ArtPiece {
  constructor(id, title, artist, year, imageUrl) {
    this.id = id;
    this.title = title;
    this.artist = artist;
    this.year = year;
    this.imageUrl = imageUrl;
  }

  static db = [];

  static create({ title, artist, year, imageUrl }) {
    const id = ArtPiece.db.length + 1;
    const artPiece = new ArtPiece(id, title, artist, year, imageUrl);
    ArtPiece.db.push(artPiece);
    return artPiece;
  }

  static findAll() {
    return ArtPiece.db;
  }

  static findOne(id) {
    return ArtPiece.db.find((artPiece) => artPiece.id === parseInt(id));
  }

  static update(id, data) {
    const artPiece = ArtPiece.findOne(id);
    if (artPiece) {
      artPiece.title = data.title || artPiece.title;
      artPiece.artist = data.artist || artPiece.artist;
      artPiece.year = data.year || artPiece.year;
      artPiece.imageUrl = data.imageUrl || artPiece.imageUrl;
    }
    return artPiece;
  }

  static delete(id) {
    const index = ArtPiece.db.findIndex(
      (artPiece) => artPiece.id === parseInt(id)
    );
    if (index !== -1) {
      ArtPiece.db.splice(index, 1);
      return true;
    }
    return false;
  }
}
