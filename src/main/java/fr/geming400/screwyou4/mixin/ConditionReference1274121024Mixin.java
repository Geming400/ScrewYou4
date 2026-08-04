package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.ConditionReference.class)
public class ConditionReference1274121024Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void name_2082612337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082612337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1635334013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635334013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_138661049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138661049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1312383766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312383766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1635205549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635205549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1102828074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1102828074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1444215581(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1444215581L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1284992548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1284992548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "conditionReference(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void conditionReference__1207963227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207963227L))
            info.setReturnValue(null);
    }


}
