package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.VillagerRenderer.class)
public class VillagerRenderer_1550530083Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1066633947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1066633947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__771922379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771922379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__119943405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-119943405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_988308275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(988308275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/npc/villager/Villager;Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;F)V", cancellable = true)
    private void extractRenderState__333928268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-333928268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;", cancellable = true)
    private void createRenderState__1915848920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915848920L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.VillagerRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1803701061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803701061L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
