package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.FunctionGameTestInstance.class)
public class FunctionGameTestInstance1087360755Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/gametest/framework/GameTestHelper;)V", cancellable = true)
    private void run_1680393294(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1680393294L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2141161287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2141161287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "describe()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void describe_1868486801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868486801L))
            info.setReturnValue(null);
    }


}
