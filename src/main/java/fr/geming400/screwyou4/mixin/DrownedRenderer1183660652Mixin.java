package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DrownedRenderer.class)
public class DrownedRenderer1183660652Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__475167221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475167221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1108670011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1108670011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_595024208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595024208L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;", cancellable = true)
    private void createRenderState__1503968621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503968621L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ZombieRenderState());
    }


}
