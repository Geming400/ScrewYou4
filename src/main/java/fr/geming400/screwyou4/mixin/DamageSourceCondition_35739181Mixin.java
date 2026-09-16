package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.DamageSourceCondition.class)
public class DamageSourceCondition_35739181Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__872887088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-872887088L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_806162705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806162705L))
            info.setReturnValue(",\u8895\uB182T}u\uD65B;wb\u0139)ZM/xaP\u38F1_{6{1o*.IY*bJ\uBFFB2J\uCB83>?<5oOdYYPi>,I7^d.hq\u8207\"Q6<g-6\u15A3{\uD2B9\u517F!\u092F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_593091271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593091271L))
            info.setReturnValue(-1341746893);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1369873296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369873296L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1701232531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701232531L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate_264600721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264600721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1102184434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102184434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasDamageSource(Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void hasDamageSource_2109202671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109202671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_815242408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815242408L))
            info.setReturnValue(null);
    }


}
