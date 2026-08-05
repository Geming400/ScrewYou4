package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TwistingVinesPlantBlock.class)
public class TwistingVinesPlantBlock713129250Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1779574504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779574504L))
            info.setReturnValue(null);
    }


}
