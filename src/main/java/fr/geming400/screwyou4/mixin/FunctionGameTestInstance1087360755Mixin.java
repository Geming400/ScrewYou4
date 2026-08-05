package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.FunctionGameTestInstance.class)
public class FunctionGameTestInstance1087360755Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/gametest/framework/GameTestHelper;)V", cancellable = true)
    private void run_1479294979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1479294979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "describe()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void describe__1089548410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1089548410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1471752817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471752817L))
            info.setReturnValue(null);
    }


}
