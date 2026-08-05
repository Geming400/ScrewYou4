package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsForceDefaultGraphicsApiFix.class)
public class OptionsForceDefaultGraphicsApiFix1357285964Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_541149245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541149245L))
            info.setReturnValue(null);
    }


}
