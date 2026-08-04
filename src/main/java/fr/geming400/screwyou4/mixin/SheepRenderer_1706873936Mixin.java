package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SheepRenderer.class)
public class SheepRenderer_1706873936Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SheepRenderState;", cancellable = true)
    private void createRenderState__761091899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761091899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1118237491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1118237491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1568229158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1568229158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1933992954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1933992954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/sheep/Sheep;Lnet/minecraft/client/renderer/entity/state/SheepRenderState;F)V", cancellable = true)
    private void extractRenderState__804463209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-804463209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SheepRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1374573715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1374573715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__585456728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-585456728L))
            info.setReturnValue(null);
    }


}
