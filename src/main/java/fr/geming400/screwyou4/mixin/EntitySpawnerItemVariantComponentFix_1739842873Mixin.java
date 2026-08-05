package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntitySpawnerItemVariantComponentFix.class)
public class EntitySpawnerItemVariantComponentFix_1739842873Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_923706649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923706649L))
            info.setReturnValue(null);
    }


}
