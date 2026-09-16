package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CakeBlock.class)
public class CakeBlock_1276797337Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1951724706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951724706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOutputSignal(I)I", cancellable = true)
    private static void getOutputSignal__782942418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-782942418L))
            info.setReturnValue(-1414477605);
    }


}
