package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.ExplosionCondition.class)
public class ExplosionCondition_1657856314Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1251470260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1251470260L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__719092785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-719092785L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__901257259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901257259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__171179173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171179173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "survivesExplosion()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void survivesExplosion__723748582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723748582L))
            info.setReturnValue(null);
    }


}
