package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.ConditionReference.class)
public class ConditionReference1274121024Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void name_1351860806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1351860806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_365494756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365494756L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2044544549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044544549L))
            info.setReturnValue("es?\uC36AfI\u426Ej&_MA0[/cYf!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1831473115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831473115L))
            info.setReturnValue(627030671);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__462850687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462850687L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__131491452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131491452L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_255402253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(255402253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1954401018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1954401018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "conditionReference(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void conditionReference__975749611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975749611L))
            info.setReturnValue(null);
    }


}
