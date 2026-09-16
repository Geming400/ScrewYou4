package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Marker.class)
public class Marker_269926906Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_140243247(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(140243247L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__545360452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-545360452L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private void getPistonPushReaction__2101027524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101027524L))
            info.setReturnValue(net.minecraft.world.level.material.PushReaction.BLOCK);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoringBlockTriggers()Z", cancellable = true)
    private void isIgnoringBlockTriggers__937142143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937142143L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_116385463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(116385463L))
            info.setReturnValue(null);
    }


}
