package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EquipmentSlot.Type.class)
public class Type_562409290Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/EquipmentSlot$Type;", cancellable = true)
    private static void values_1291780033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291780033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/EquipmentSlot$Type;", cancellable = true)
    private static void valueOf__657739430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-657739430L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.Type.HAND);
    }


}
