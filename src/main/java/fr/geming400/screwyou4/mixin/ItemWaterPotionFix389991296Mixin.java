package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemWaterPotionFix.class)
public class ItemWaterPotionFix389991296Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__426145423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-426145423L))
            info.setReturnValue(null);
    }


}
