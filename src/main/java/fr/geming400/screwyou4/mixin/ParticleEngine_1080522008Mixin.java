package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ParticleEngine.class)
public class ParticleEngine_1080522008Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/level/ParticlesRenderState;Lnet/minecraft/client/renderer/culling/Frustum;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract__85809549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-85809549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/particle/Particle;)V", cancellable = true)
    private void add__1182179207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1182179207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandom()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void getRandom_38678987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38678987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_950838349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(950838349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void setLevel_1589166851(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1589166851L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTrackingEmitter(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/particles/ParticleOptions;I)V", cancellable = true)
    private void createTrackingEmitter_1129846106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1129846106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTrackingEmitter(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private void createTrackingEmitter__2105359405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2105359405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "countParticles()Ljava/lang/String;", cancellable = true)
    private void countParticles_1313041534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313041534L))
            info.setReturnValue("-q\"fbs%{ubjnaul\u9DF7_K9&$$c<\u28D0Ei;\u64D1v\u4FB8(qq,hA");
    }

    @Inject(at = @At("HEAD"), method = "clearParticles()V", cancellable = true)
    private void clearParticles__529091350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-529091350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1597136589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597136589L))
            info.setReturnValue(null);
    }


}
