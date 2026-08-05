package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugStructureInfo.Piece.class)
public class Piece_201876308Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1587388566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587388566L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__933583668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-933583668L))
            info.setReturnValue("<L#,!W&W9J;\u46C2!FlGZ\u92B6vErBM{Y\u6181[]'OT&P/o'F\uC91B_au\u77B7B<`w>{3U1\u9B04>k]W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_240139049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240139049L))
            info.setReturnValue(-938438583);
    }

    @Inject(at = @At("HEAD"), method = "boundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void boundingBox_372024093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(372024093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStart()Z", cancellable = true)
    private void isStart_240154890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240154890L))
            info.setReturnValue(false);
    }


}
