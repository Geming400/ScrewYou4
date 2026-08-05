package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.MushroomCowRenderer.class)
public class MushroomCowRenderer902999848Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/MushroomCowRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1301615858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301615858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1389330815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389330815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1130118867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1130118867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/cow/MushroomCow;Lnet/minecraft/client/renderer/entity/state/MushroomCowRenderState;F)V", cancellable = true)
    private void extractRenderState__1750289328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1750289328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1922864051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1922864051L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_314363404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(314363404L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/MushroomCowRenderState;", cancellable = true)
    private void createRenderState__734347114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-734347114L))
            info.setReturnValue(null);
    }


}
