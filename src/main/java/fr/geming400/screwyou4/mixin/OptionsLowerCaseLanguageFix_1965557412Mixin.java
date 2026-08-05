package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsLowerCaseLanguageFix.class)
public class OptionsLowerCaseLanguageFix_1965557412Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1149420692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1149420692L))
            info.setReturnValue(null);
    }


}
