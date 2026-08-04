package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.AnyOfCondition.class)
public class AnyOfCondition1843752888Mixin {
        @Inject(at = @At("HEAD"), method = "anyOf([Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/AnyOfCondition$Builder;", cancellable = true)
    private static void anyOf__331273278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331273278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__715360684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-715360684L))
            info.setReturnValue(null);
    }


}
