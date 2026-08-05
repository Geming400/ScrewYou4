package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SummonEntityEffect.class)
public class SummonEntityEffect_9429737Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1394941995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394941995L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1126030239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126030239L))
            info.setReturnValue("\uAD29[4{kp5\"o%'9m\u1925\uC54Cj%#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_47692478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47692478L))
            info.setReturnValue(-1617523636);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_1250181507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1250181507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityTypes()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void entityTypes_1629382780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629382780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinTeam()Z", cancellable = true)
    private void joinTeam_47708319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47708319L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1745283460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745283460L))
            info.setReturnValue(null);
    }


}
