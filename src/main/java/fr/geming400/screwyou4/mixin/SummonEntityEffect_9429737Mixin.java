package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SummonEntityEffect.class)
public class SummonEntityEffect_9429737Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__899196532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-899196532L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_779853261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779853261L))
            info.setReturnValue("{\u4077V\uA25DfbD%8{\u8AE5\u9B69?8+\u9069{\u8B62t\u15CEM\u6C58>jxScK}-Bp\u7084)Cj0t3\u8EEAZfBn-7$u@QDy`[J$J\u46B7-\u4C2F \u65BAA6?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_566781827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566781827L))
            info.setReturnValue(-669450333);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__315764267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-315764267L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityTypes()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void entityTypes__1843606190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843606190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1075874990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1075874990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinTeam()Z", cancellable = true)
    private void joinTeam__1945953704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945953704L))
            info.setReturnValue(false);
    }


}
