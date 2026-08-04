package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.AllOfCondition.class)
public class AllOfCondition1105944099Mixin {
        @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/List;)Lnet/minecraft/world/level/storage/loot/predicates/AllOfCondition;", cancellable = true)
    private static void allOf_509603513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509603513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf([Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/AllOfCondition$Builder;", cancellable = true)
    private static void allOf_62862370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62862370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1453169473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1453169473L))
            info.setReturnValue(null);
    }


}
