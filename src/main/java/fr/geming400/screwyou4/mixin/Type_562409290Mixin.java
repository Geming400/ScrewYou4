package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EquipmentSlot.Type.class)
public class Type_562409290Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/EquipmentSlot$Type;", cancellable = true)
    private static void values__168669281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168669281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/EquipmentSlot$Type;", cancellable = true)
    private static void valueOf__2119648382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2119648382L))
            info.setReturnValue(null);
    }


}
