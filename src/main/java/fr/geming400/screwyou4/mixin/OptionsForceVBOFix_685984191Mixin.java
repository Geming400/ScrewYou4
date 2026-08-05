package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsForceVBOFix.class)
public class OptionsForceVBOFix_685984191Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__130152529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-130152529L))
            info.setReturnValue(null);
    }


}
