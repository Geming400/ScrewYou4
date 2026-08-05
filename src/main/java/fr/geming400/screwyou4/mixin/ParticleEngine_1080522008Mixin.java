package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ParticleEngine.class)
public class ParticleEngine_1080522008Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/level/ParticlesRenderState;Lnet/minecraft/client/renderer/culling/Frustum;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract_1589155890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1589155890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/particle/Particle;)V", cancellable = true)
    private void add_2102904698(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2102904698L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandom()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void getRandom__969102876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969102876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1118796746(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1118796746L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void setLevel_2043925125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2043925125L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearParticles()V", cancellable = true)
    private void clearParticles_1118796746(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1118796746L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTrackingEmitter(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private void createTrackingEmitter__2065765896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2065765896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTrackingEmitter(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/particles/ParticleOptions;I)V", cancellable = true)
    private void createTrackingEmitter__1937722411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1937722411L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__421985903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-421985903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "countParticles()Ljava/lang/String;", cancellable = true)
    private void countParticles__54938464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-54938464L))
            info.setReturnValue("\"`:grJ:J\"0\"剋DyVy알<W!IZ愛g ]r1-d}xF@瘧rqpi;r;&S.W7.儉");
    }


}
