package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OminousBannerRarityFix.class)
public class OminousBannerRarityFix1601483830Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_785347111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785347111L))
            info.setReturnValue(null);
    }


}
