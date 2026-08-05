package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemStackSpawnEggFix.class)
public class ItemStackSpawnEggFix827548184Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_11411465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(11411465L))
            info.setReturnValue(null);
    }


}
