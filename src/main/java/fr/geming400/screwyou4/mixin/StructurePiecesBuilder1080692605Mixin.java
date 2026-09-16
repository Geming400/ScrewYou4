package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder.class)
public class StructurePiecesBuilder1080692605Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_294864899(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(294864899L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_2139808977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139808977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;", cancellable = true)
    private void build__2995682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2995682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveInsideHeights(Lnet/minecraft/util/RandomSource;II)V", cancellable = true)
    private void moveInsideHeights_681109551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(681109551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offsetPiecesVertically(I)V", cancellable = true)
    private void offsetPiecesVertically_1824224708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1824224708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveBelowSeaLevel(IILnet/minecraft/util/RandomSource;I)I", cancellable = true)
    private void moveBelowSeaLevel__501611641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501611641L))
            info.setReturnValue(-1194375780);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox__376382504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376382504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findCollisionPiece(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/level/levelgen/structure/StructurePiece;", cancellable = true)
    private void findCollisionPiece__1836482791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836482791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPiece(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;)V", cancellable = true)
    private void addPiece__744279050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-744279050L))
            info.cancel();
    }


}
