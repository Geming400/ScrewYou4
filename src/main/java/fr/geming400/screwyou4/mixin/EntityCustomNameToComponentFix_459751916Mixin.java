package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityCustomNameToComponentFix.class)
public class EntityCustomNameToComponentFix_459751916Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1944947750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944947750L))
            info.setReturnValue(null);
    }


}
