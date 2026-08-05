package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.GhastRenderer.class)
public class GhastRenderer1765272790Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1992391809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1992391809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Ghast;Lnet/minecraft/client/renderer/entity/state/GhastRenderState;F)V", cancellable = true)
    private void extractRenderState__835578418(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-835578418L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1509830303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1509830303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1176636346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176636346L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/GhastRenderState;", cancellable = true)
    private void createRenderState__1394507918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1394507918L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.GhastRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/GhastRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1423243890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1423243890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__527057873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527057873L))
            info.setReturnValue(null);
    }


}
