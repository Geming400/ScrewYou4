package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TurtleRenderer.class)
public class TurtleRenderer340121235Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1952209428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952209428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/TurtleRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_595100508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595100508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_567240254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(567240254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/turtle/Turtle;Lnet/minecraft/client/renderer/entity/state/TurtleRenderState;F)V", cancellable = true)
    private void extractRenderState_1187035198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1187035198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1359985438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1359985438L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__248515209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-248515209L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/TurtleRenderState;", cancellable = true)
    private void createRenderState__3685552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-3685552L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.TurtleRenderState());
    }


}
