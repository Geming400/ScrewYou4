package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityHealthFix.class)
public class EntityHealthFix1188263688Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_372126969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(372126969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixTag_240373644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240373644L))
            info.setReturnValue(null);
    }


}
