package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.AttachedStemBlock.class)
public class AttachedStemBlock_1432542862Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1126570711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126570711L))
            info.setReturnValue(null);
    }


}
