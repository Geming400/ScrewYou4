package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StructureVoidBlock.class)
public class StructureVoidBlock1268177962Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1290935610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290935610L))
            info.setReturnValue(null);
    }


}
