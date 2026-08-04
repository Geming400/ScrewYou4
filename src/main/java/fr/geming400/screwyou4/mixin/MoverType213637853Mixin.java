package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.MoverType.class)
public class MoverType213637853Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/MoverType;", cancellable = true)
    private static void values_838889852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838889852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/MoverType;", cancellable = true)
    private static void valueOf_129862201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129862201L))
            info.setReturnValue(null);
    }


}
