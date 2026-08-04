package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.Explosion.BlockInteraction.class)
public class BlockInteraction1192513198Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/Explosion$BlockInteraction;", cancellable = true)
    private static void values_1572760829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572760829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/Explosion$BlockInteraction;", cancellable = true)
    private static void valueOf__1816892486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816892486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldAffectBlocklikeEntities()Z", cancellable = true)
    private void shouldAffectBlocklikeEntities_1230791781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230791781L))
            info.setReturnValue(null);
    }


}
