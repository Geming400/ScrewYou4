package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntitySubPredicates.class)
public class EntitySubPredicates449346539Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void bootstrap_360820619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360820619L))
            info.setReturnValue(null);
    }


}
