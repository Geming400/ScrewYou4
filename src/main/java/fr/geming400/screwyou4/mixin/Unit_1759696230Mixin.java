package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Unit.class)
public class Unit_1759696230Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/Unit;", cancellable = true)
    private static void values_288414765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(288414765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/Unit;", cancellable = true)
    private static void valueOf__1670723962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670723962L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }


}
