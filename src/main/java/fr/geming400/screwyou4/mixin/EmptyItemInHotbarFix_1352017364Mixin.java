package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EmptyItemInHotbarFix.class)
public class EmptyItemInHotbarFix_1352017364Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1457754098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457754098L))
            info.setReturnValue(null);
    }


}
