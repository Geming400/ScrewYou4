package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestAssertPosException.class)
public class GameTestAssertPosException_1949335257Mixin {
        @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription__227573909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-227573909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMessageToShowAtBlock()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getMessageToShowAtBlock__227573909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-227573909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRelativePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getRelativePos_55948377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(55948377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAbsolutePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getAbsolutePos_55948377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(55948377L))
            info.setReturnValue(null);
    }


}
