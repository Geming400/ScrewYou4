package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.LegacyDimensionIdFix.class)
public class LegacyDimensionIdFix840785151Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_24648432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(24648432L))
            info.setReturnValue(null);
    }


}
