package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.BlockBasedTestInstance.class)
public class BlockBasedTestInstance617109295Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/gametest/framework/GameTestHelper;)V", cancellable = true)
    private void run_1009043519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1009043519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1942004277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942004277L))
            info.setReturnValue(null);
    }


}
