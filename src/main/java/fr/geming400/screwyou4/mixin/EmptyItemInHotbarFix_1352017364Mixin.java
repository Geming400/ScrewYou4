package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EmptyItemInHotbarFix.class)
public class EmptyItemInHotbarFix_1352017364Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_535880644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(535880644L))
            info.setReturnValue(null);
    }


}
