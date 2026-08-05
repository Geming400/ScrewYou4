package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.EnderDragonPart.class)
public class EnderDragonPart_799977728Mixin {
        @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void is_348256911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348256911L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_350547892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350547892L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDimensions__442668317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442668317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_1180004711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180004711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1323396387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323396387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldBeSaved()Z", cancellable = true)
    private void shouldBeSaved_838256310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838256310L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable_838256310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838256310L))
            info.setReturnValue(false);
    }


}
