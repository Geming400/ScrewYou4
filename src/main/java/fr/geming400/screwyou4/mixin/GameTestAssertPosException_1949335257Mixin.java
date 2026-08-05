package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestAssertPosException.class)
public class GameTestAssertPosException_1949335257Mixin {
        @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription_1505391281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1505391281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAbsolutePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getAbsolutePos__348870382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348870382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMessageToShowAtBlock()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getMessageToShowAtBlock__1826603332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826603332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRelativePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getRelativePos__1213313049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1213313049L))
            info.setReturnValue(null);
    }


}
