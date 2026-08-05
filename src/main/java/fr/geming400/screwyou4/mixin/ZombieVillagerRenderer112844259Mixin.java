package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ZombieVillagerRenderer.class)
public class ZombieVillagerRenderer112844259Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ZombieVillagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1419182230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419182230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2085359094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085359094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1557629228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1557629228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;F)V", cancellable = true)
    private void extractRenderState_171415261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(171415261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__449377548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-449377548L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/zombie/ZombieVillager;Lnet/minecraft/client/renderer/entity/state/ZombieVillagerRenderState;F)V", cancellable = true)
    private void extractRenderState_1251004942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1251004942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ZombieVillagerRenderState;", cancellable = true)
    private void createRenderState_666074927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666074927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_366015238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(366015238L))
            info.setReturnValue(null);
    }


}
