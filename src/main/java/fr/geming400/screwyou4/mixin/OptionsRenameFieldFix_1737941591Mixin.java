package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsRenameFieldFix.class)
public class OptionsRenameFieldFix_1737941591Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_921804871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921804871L))
            info.setReturnValue(null);
    }


}
