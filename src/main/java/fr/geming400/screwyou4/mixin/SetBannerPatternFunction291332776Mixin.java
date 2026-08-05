package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetBannerPatternFunction.class)
public class SetBannerPatternFunction291332776Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1357778030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1357778030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBannerPattern(Z)Lnet/minecraft/world/level/storage/loot/functions/SetBannerPatternFunction$Builder;", cancellable = true)
    private static void setBannerPattern__1329843692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1329843692L))
            info.setReturnValue(null);
    }


}
