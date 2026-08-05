package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SheepRenderer.class)
public class SheepRenderer_1706873936Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SheepRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1745664013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745664013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__615578526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615578526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1144652128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1144652128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_36400448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(36400448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/sheep/Sheep;Lnet/minecraft/client/renderer/entity/state/SheepRenderState;F)V", cancellable = true)
    private void extractRenderState__59964303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-59964303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1960044914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960044914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SheepRenderState;", cancellable = true)
    private void createRenderState__1980862810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980862810L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SheepRenderState());
    }


}
