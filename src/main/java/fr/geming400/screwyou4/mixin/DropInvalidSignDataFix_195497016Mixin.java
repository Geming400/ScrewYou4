package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.DropInvalidSignDataFix.class)
public class DropInvalidSignDataFix_195497016Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1680692850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680692850L))
            info.setReturnValue(null);
    }


}
