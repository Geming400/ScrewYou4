package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntitySpawnerItemVariantComponentFix.class)
public class EntitySpawnerItemVariantComponentFix_1739842873Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1069928093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069928093L))
            info.setReturnValue(null);
    }


}
