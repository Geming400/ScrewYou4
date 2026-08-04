package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsSetGraphicsPresetToCustomFix.class)
public class OptionsSetGraphicsPresetToCustomFix_1925089075Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__884682387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884682387L))
            info.setReturnValue(null);
    }


}
