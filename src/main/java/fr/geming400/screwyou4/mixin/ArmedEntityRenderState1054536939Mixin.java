package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.ArmedEntityRenderState.class)
public class ArmedEntityRenderState1054536939Mixin {
        @Inject(at = @At("HEAD"), method = "getMainHandItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getMainHandItemStack_1577955599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577955599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ticksUsingItem(Lnet/minecraft/world/entity/HumanoidArm;)F", cancellable = true)
    private void ticksUsingItem__45803463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-45803463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseItemStackForArm(Lnet/minecraft/world/entity/HumanoidArm;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getUseItemStackForArm_4653188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(4653188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMainHandItemState()Lnet/minecraft/client/renderer/item/ItemStackRenderState;", cancellable = true)
    private void getMainHandItemState_763747305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763747305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractArmedEntityRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/ArmedEntityRenderState;Lnet/minecraft/client/renderer/item/ItemModelResolver;F)V", cancellable = true)
    private static void extractArmedEntityRenderState_193707645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(193707645L))
            info.cancel();
    }


}
