package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.TargetedConditionalEffect.class)
public class TargetedConditionalEffect_1698111607Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1211343431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211343431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_562651631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562651631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1736374348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736374348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__678837492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678837492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1020224999(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1020224999L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requirements()Ljava/util/Optional;", cancellable = true)
    private void requirements_1943573028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943573028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effect()Ljava/lang/Object;", cancellable = true)
    private void effect__737663471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737663471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__2113177715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113177715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "affected()Lnet/minecraft/world/item/enchantment/EnchantmentTarget;", cancellable = true)
    private void affected__113674465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-113674465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipmentDropsCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void equipmentDropsCodec__2113177715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113177715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchanted()Lnet/minecraft/world/item/enchantment/EnchantmentTarget;", cancellable = true)
    private void enchanted__113674465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-113674465L))
            info.setReturnValue(null);
    }


}
