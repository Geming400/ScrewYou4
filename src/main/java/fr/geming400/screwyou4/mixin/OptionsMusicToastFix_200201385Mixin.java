package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsMusicToastFix.class)
public class OptionsMusicToastFix_200201385Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1685397219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685397219L))
            info.setReturnValue(null);
    }


}
