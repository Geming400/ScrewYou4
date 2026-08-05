package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.BlockBasedTestInstance.class)
public class BlockBasedTestInstance617109295Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/gametest/framework/GameTestHelper;)V", cancellable = true)
    private void run_1210141834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1210141834L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1683554549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683554549L))
            info.setReturnValue(null);
    }


}
