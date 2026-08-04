package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemCustomNameToComponentFix.class)
public class ItemCustomNameToComponentFix_511839420Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1997035254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997035254L))
            info.setReturnValue(null);
    }


}
