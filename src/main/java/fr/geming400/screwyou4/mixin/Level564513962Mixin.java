package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Crackiness.Level.class)
public class Level564513962Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private static void values_2080410926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080410926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private static void valueOf_1649332487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649332487L))
            info.setReturnValue(net.minecraft.world.entity.Crackiness.Level.HIGH);
    }


}
