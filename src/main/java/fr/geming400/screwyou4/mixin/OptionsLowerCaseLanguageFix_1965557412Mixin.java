package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsLowerCaseLanguageFix.class)
public class OptionsLowerCaseLanguageFix_1965557412Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__844214050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-844214050L))
            info.setReturnValue(null);
    }


}
