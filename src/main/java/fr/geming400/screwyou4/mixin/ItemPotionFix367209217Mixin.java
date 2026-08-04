package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemPotionFix.class)
public class ItemPotionFix367209217Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1852405052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852405052L))
            info.setReturnValue(null);
    }


}
