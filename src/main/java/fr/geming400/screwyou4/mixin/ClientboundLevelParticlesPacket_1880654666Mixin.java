package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket.class)
public class ClientboundLevelParticlesPacket_1880654666Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_201629577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(201629577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCount()I", cancellable = true)
    private void getCount_1918916911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918916911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1736243718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1736243718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2078162199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2078162199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getY()D", cancellable = true)
    private void getY_1918912106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918912106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()D", cancellable = true)
    private void getX_1918912106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918912106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZ()D", cancellable = true)
    private void getZ_1918912106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918912106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOverrideLimiter()Z", cancellable = true)
    private void isOverrideLimiter_1918933248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918933248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpeed()F", cancellable = true)
    private void getMaxSpeed_1918914028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918914028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void getParticle__188306403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188306403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alwaysShow()Z", cancellable = true)
    private void alwaysShow_1918933248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918933248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZDist()F", cancellable = true)
    private void getZDist_1918914028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918914028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getYDist()F", cancellable = true)
    private void getYDist_1918914028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918914028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getXDist()F", cancellable = true)
    private void getXDist_1918914028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918914028L))
            info.setReturnValue(null);
    }


}
