package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTab.Type.class)
public class Type_1470168929Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/CreativeModeTab$Type;", cancellable = true)
    private static void values_1517482621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1517482621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/CreativeModeTab$Type;", cancellable = true)
    private static void valueOf__433496480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433496480L))
            info.setReturnValue(null);
    }


}
