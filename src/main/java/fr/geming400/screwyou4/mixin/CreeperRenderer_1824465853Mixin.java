package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CreeperRenderer.class)
public class CreeperRenderer_1824465853Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_2077636831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077636831L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CreeperRenderState;", cancellable = true)
    private void createRenderState__2017012378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017012378L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.CreeperRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__497986609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-497986609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CreeperRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1537934445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537934445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_153992365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(153992365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Creeper;Lnet/minecraft/client/renderer/entity/state/CreeperRenderState;F)V", cancellable = true)
    private void extractRenderState__1638055296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1638055296L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1262244045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1262244045L))
            info.cancel();
    }


}
