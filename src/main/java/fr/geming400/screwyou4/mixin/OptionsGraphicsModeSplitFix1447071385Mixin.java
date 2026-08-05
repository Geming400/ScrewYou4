package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsGraphicsModeSplitFix.class)
public class OptionsGraphicsModeSplitFix1447071385Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_630934666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630934666L))
            info.setReturnValue(null);
    }


}
