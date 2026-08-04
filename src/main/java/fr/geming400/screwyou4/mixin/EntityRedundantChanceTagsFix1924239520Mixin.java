package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityRedundantChanceTagsFix.class)
public class EntityRedundantChanceTagsFix1924239520Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__885531941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885531941L))
            info.setReturnValue(null);
    }


}
