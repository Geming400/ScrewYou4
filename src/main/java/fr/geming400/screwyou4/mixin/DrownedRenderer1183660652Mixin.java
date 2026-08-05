package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DrownedRenderer.class)
public class DrownedRenderer1183660652Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_905935429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905935429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1138791809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138791809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;", cancellable = true)
    private void createRenderState__662161198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662161198L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ZombieRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1436831631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436831631L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
