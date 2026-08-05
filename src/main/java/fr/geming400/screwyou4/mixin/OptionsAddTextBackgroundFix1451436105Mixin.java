package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsAddTextBackgroundFix.class)
public class OptionsAddTextBackgroundFix1451436105Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_635299386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635299386L))
            info.setReturnValue(null);
    }


}
