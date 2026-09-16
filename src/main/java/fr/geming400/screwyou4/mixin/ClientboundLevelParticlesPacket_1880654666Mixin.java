package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket.class)
public class ClientboundLevelParticlesPacket_1880654666Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2036522255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2036522255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCount()I", cancellable = true)
    private void getCount_494735734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494735734L))
            info.setReturnValue(-89206676);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1584942802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1584942802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_289177071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(289177071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getY()D", cancellable = true)
    private void getY__1510880121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1510880121L))
            info.setReturnValue(4.050904006598985E8D);
    }

    @Inject(at = @At("HEAD"), method = "getX()D", cancellable = true)
    private void getX__1539509272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539509272L))
            info.setReturnValue(4.050904001174838E8D);
    }

    @Inject(at = @At("HEAD"), method = "getZ()D", cancellable = true)
    private void getZ__1482250970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482250970L))
            info.setReturnValue(4.0509040055429745E8D);
    }

    @Inject(at = @At("HEAD"), method = "isOverrideLimiter()Z", cancellable = true)
    private void isOverrideLimiter__1943227762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943227762L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "alwaysShow()Z", cancellable = true)
    private void alwaysShow__1359904044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1359904044L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpeed()F", cancellable = true)
    private void getMaxSpeed_169751251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169751251L))
            info.setReturnValue(4.050904E8F);
    }

    @Inject(at = @At("HEAD"), method = "getZDist()F", cancellable = true)
    private void getZDist_1384683682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384683682L))
            info.setReturnValue(4.050904E8F);
    }

    @Inject(at = @At("HEAD"), method = "getXDist()F", cancellable = true)
    private void getXDist_1777710692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777710692L))
            info.setReturnValue(4.050904E8F);
    }

    @Inject(at = @At("HEAD"), method = "getYDist()F", cancellable = true)
    private void getYDist_1581197187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581197187L))
            info.setReturnValue(4.050904E8F);
    }

    @Inject(at = @At("HEAD"), method = "getParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void getParticle__942808807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-942808807L))
            info.setReturnValue(null);
    }


}
