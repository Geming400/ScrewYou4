package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TurtleRenderer.class)
public class TurtleRenderer340121235Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/TurtleRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1976203158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976203158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1982331226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982331226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__222100572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-222100572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1330352252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1330352252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/turtle/Turtle;Lnet/minecraft/client/renderer/entity/state/TurtleRenderState;F)V", cancellable = true)
    private void extractRenderState_1342827300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1342827300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/TurtleRenderState;", cancellable = true)
    private void createRenderState_838121871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838121871L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.TurtleRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_593292214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593292214L))
            info.setReturnValue(null);
    }


}
