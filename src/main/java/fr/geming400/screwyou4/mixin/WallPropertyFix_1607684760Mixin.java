package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.WallPropertyFix.class)
public class WallPropertyFix_1607684760Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_791548040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791548040L))
            info.setReturnValue(null);
    }


}
