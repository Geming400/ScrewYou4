package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BannerEntityCustomNameToOverrideComponentFix.class)
public class BannerEntityCustomNameToOverrideComponentFix_928430004Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1881341458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881341458L))
            info.setReturnValue(null);
    }


}
