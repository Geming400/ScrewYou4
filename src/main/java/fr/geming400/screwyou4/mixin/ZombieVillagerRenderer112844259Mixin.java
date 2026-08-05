package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ZombieVillagerRenderer.class)
public class ZombieVillagerRenderer112844259Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2115480892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115480892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ZombieVillagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_301459036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(301459036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_339963278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(339963278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1132708462(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1132708462L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;F)V", cancellable = true)
    private void extractRenderState__1188595453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1188595453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/zombie/ZombieVillager;Lnet/minecraft/client/renderer/entity/state/ZombieVillagerRenderState;F)V", cancellable = true)
    private void extractRenderState__1619092428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1619092428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ZombieVillagerRenderState;", cancellable = true)
    private void createRenderState__1576716304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576716304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__475792185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475792185L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
