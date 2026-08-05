package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder.class)
public class StructurePiecesBuilder1080692605Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1118967344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1118967344L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1118971188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1118971188L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;", cancellable = true)
    private void build__774617908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774617908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPiece(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;)V", cancellable = true)
    private void addPiece_1883520105(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1883520105L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findCollisionPiece(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/level/levelgen/structure/StructurePiece;", cancellable = true)
    private void findCollisionPiece_229507374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229507374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveInsideHeights(Lnet/minecraft/util/RandomSource;II)V", cancellable = true)
    private void moveInsideHeights__2101462288(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2101462288L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offsetPiecesVertically(I)V", cancellable = true)
    private void offsetPiecesVertically__2000357719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2000357719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveBelowSeaLevel(IILnet/minecraft/util/RandomSource;I)I", cancellable = true)
    private void moveBelowSeaLevel__1449409700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449409700L))
            info.setReturnValue(1526645032);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox_1250840391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250840391L))
            info.setReturnValue(null);
    }


}
