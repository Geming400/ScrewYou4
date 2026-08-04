package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsAmbientOcclusionFix.class)
public class OptionsAmbientOcclusionFix2006673636Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__803097825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803097825L))
            info.setReturnValue(null);
    }


}
