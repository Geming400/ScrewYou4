package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Crackiness.Level.class)
public class Level564513962Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private static void values_1185037452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1185037452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private static void valueOf__1078442705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1078442705L))
            info.setReturnValue(net.minecraft.world.entity.Crackiness.Level.LOW);
    }


}
