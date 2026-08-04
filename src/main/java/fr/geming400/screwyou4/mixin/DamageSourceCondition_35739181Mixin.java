package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.DamageSourceCondition.class)
public class DamageSourceCondition_35739181Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1421251439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421251439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1099720795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099720795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_74001922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(74001922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test_1953757378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953757378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1421379903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421379903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate_281200602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281200602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1771592904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771592904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1793296306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1793296306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasDamageSource(Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void hasDamageSource__279612469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279612469L))
            info.setReturnValue(null);
    }


}
