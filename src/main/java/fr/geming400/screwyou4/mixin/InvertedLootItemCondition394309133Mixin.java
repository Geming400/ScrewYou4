package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.InvertedLootItemCondition.class)
public class InvertedLootItemCondition394309133Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1779821392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779821392L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__741150842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741150842L))
            info.setReturnValue(">0\uC8EED54% >^WO`.\u8D88a)wzN_+b");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_432571875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432571875L))
            info.setReturnValue(1525387647);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1982639965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982639965L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1779949856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779949856L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1970939824(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1970939824L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "term()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;", cancellable = true)
    private void term_678573613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678573613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invert(Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void invert_861700906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861700906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2130162857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130162857L))
            info.setReturnValue(null);
    }


}
