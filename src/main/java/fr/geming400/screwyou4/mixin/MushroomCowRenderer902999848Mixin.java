package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.MushroomCowRenderer.class)
public class MushroomCowRenderer902999848Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/MushroomCowRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__332756204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332756204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1419452613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419452613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_340778041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(340778041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/cow/MushroomCow;Lnet/minecraft/client/renderer/entity/state/MushroomCowRenderState;F)V", cancellable = true)
    private void extractRenderState__1990880598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1990880598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__767473639(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-767473639L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1156170827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156170827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/MushroomCowRenderState;", cancellable = true)
    private void createRenderState_1362680247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362680247L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.MushroomCowRenderState());
    }


}
