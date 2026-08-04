package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType.class)
public class TreeDecoratorType139226537Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1875080261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875080261L))
            info.setReturnValue(null);
    }


}
