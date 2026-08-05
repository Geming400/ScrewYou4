package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.ExplosionCondition.class)
public class ExplosionCondition_1657856314Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__79115398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-79115398L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test_252243837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(252243837L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1570665729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570665729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "survivesExplosion()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void survivesExplosion_1767463750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1767463750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1857607755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857607755L))
            info.setReturnValue(null);
    }


}
