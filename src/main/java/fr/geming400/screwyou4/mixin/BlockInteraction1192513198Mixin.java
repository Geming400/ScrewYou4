package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.Explosion.BlockInteraction.class)
public class BlockInteraction1192513198Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/Explosion$BlockInteraction;", cancellable = true)
    private static void values__604786021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-604786021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/Explosion$BlockInteraction;", cancellable = true)
    private static void valueOf_2017571554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017571554L))
            info.setReturnValue(net.minecraft.world.level.Explosion.BlockInteraction.DESTROY_WITH_DECAY);
    }

    @Inject(at = @At("HEAD"), method = "shouldAffectBlocklikeEntities()Z", cancellable = true)
    private void shouldAffectBlocklikeEntities__565139768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-565139768L))
            info.setReturnValue(true);
    }


}
