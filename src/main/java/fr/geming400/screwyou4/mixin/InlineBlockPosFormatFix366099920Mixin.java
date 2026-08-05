package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.InlineBlockPosFormatFix.class)
public class InlineBlockPosFormatFix366099920Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__450036799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450036799L))
            info.setReturnValue(null);
    }


}
