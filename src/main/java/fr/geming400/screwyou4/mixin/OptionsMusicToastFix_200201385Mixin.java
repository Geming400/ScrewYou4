package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsMusicToastFix.class)
public class OptionsMusicToastFix_200201385Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__615935335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615935335L))
            info.setReturnValue(null);
    }


}
