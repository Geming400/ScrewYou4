package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityPaintingItemFrameDirectionFix.class)
public class EntityPaintingItemFrameDirectionFix597830811Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_2083026646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2083026646L))
            info.setReturnValue(null);
    }


}
