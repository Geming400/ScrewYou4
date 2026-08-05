package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CamelHuskRenderer.class)
public class CamelHuskRenderer496013520Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CamelRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1252749491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252749491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1796317143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796317143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_723132539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(723132539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1515877723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1515877723L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/camel/Camel;Lnet/minecraft/client/renderer/entity/state/CamelRenderState;F)V", cancellable = true)
    private void extractRenderState__37340697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-37340697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__92622924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92622924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CamelRenderState;", cancellable = true)
    private void createRenderState_1840537953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840537953L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.CamelRenderState());
    }


}
