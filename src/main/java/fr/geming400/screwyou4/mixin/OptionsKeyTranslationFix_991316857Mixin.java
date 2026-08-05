package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsKeyTranslationFix.class)
public class OptionsKeyTranslationFix_991316857Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_175180137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175180137L))
            info.setReturnValue(null);
    }


}
