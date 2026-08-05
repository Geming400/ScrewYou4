package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.AllOfCondition.class)
public class AllOfCondition1105944099Mixin {
        @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/List;)Lnet/minecraft/world/level/storage/loot/predicates/AllOfCondition;", cancellable = true)
    private static void allOf__2125579247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2125579247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf([Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/AllOfCondition$Builder;", cancellable = true)
    private static void allOf__937599110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937599110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2122577943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122577943L))
            info.setReturnValue(null);
    }


}
