package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MultifaceSpreader.SpreadPos.class)
public class SpreadPos_2092759747Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__816695291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816695291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_957299771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(957299771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2131022488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131022488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos_199372867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199372867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "face()Lnet/minecraft/core/Direction;", cancellable = true)
    private void face_1329904461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329904461L))
            info.setReturnValue(null);
    }


}
