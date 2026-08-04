package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.NopProcessor.class)
public class NopProcessor1863511893Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__695601679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695601679L))
            info.setReturnValue(null);
    }


}
