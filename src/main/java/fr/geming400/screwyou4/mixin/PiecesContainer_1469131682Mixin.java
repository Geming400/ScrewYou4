package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pieces.PiecesContainer.class)
public class PiecesContainer_1469131682Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_560505413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560505413L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2055412090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055412090L))
            info.setReturnValue("-wdzVA\u9495p\u94578$k&7mC;0v@\u84C0hf#%\uFC43NNP\u9345\u268B\u24AC:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2026483772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026483772L))
            info.setReturnValue(1418943562);
    }

    @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/nbt/ListTag;Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;)Lnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;", cancellable = true)
    private static void load__2048894470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048894470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1766719243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1766719243L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void save_1559186783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1559186783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInsidePiece(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isInsidePiece_293616116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293616116L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "calculateBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void calculateBoundingBox_932091372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932091372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pieces()Ljava/util/List;", cancellable = true)
    private void pieces__1733715818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733715818L))
            info.setReturnValue(null);
    }


}
