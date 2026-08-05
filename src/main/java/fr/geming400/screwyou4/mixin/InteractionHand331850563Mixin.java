package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionHand.class)
public class InteractionHand331850563Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private static void values__214298696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-214298696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private static void valueOf_544357521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544357521L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }

    @Inject(at = @At("HEAD"), method = "asEquipmentSlot()Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private void asEquipmentSlot_1875383002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875383002L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.FEET);
    }


}
