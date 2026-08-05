package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionHand.class)
public class InteractionHand331850563Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private static void values__17302250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-17302250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private static void valueOf__1425647431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1425647431L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }

    @Inject(at = @At("HEAD"), method = "asEquipmentSlot()Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private void asEquipmentSlot_147390144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(147390144L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.LEGS);
    }


}
