package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsRenameFieldFix.class)
public class OptionsRenameFieldFix_1737941591Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1071829871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071829871L))
            info.setReturnValue(null);
    }


}
