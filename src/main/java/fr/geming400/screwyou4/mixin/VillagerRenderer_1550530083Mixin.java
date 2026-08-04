package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.VillagerRenderer.class)
public class VillagerRenderer_1550530083Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_961893638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961893638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;", cancellable = true)
    private void createRenderState_856036521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(856036521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1777649101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1777649101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/npc/villager/Villager;Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;F)V", cancellable = true)
    private void extractRenderState_1323208026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1323208026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1724573011(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1724573011L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_971881761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971881761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__741800581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741800581L))
            info.setReturnValue(null);
    }


}
