package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.ArmedEntityRenderState.class)
public class ArmedEntityRenderState1054536939Mixin {
        @Inject(at = @At("HEAD"), method = "extractArmedEntityRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/ArmedEntityRenderState;Lnet/minecraft/client/renderer/item/ItemModelResolver;F)V", cancellable = true)
    private static void extractArmedEntityRenderState__1704261541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1704261541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ticksUsingItem(Lnet/minecraft/world/entity/HumanoidArm;)F", cancellable = true)
    private void ticksUsingItem__2109725192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109725192L))
            info.setReturnValue(7.384952E8F);
    }

    @Inject(at = @At("HEAD"), method = "getMainHandItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getMainHandItemStack_69618598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69618598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseItemStackForArm(Lnet/minecraft/world/entity/HumanoidArm;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getUseItemStackForArm_1930723419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930723419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMainHandItemState()Lnet/minecraft/client/renderer/item/ItemStackRenderState;", cancellable = true)
    private void getMainHandItemState_1151582281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151582281L))
            info.setReturnValue(new net.minecraft.client.renderer.item.ItemStackRenderState());
    }


}
