package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BeetrootBlock.class)
public class BeetrootBlock2064781707Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__494331865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-494331865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxAge()I", cancellable = true)
    private void getMaxAge_2103043953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103043953L))
            info.setReturnValue(679762536);
    }


}
