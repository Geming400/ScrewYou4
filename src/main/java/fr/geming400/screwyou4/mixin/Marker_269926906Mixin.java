package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Marker.class)
public class Marker_269926906Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_308201644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(308201644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isIgnoringBlockTriggers()Z", cancellable = true)
    private void isIgnoringBlockTriggers_308205488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(308205488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_649953889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649953889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private void getPistonPushReaction__2134161554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134161554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__179502930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179502930L))
            info.setReturnValue(null);
    }


}
