package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigSoundVariants.SoundSet.class)
public class SoundSet_791334094Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/pig/PigSoundVariants$SoundSet;", cancellable = true)
    private static void values_38226593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38226593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/pig/PigSoundVariants$SoundSet;", cancellable = true)
    private static void valueOf__512908348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-512908348L))
            info.setReturnValue(net.minecraft.world.entity.animal.pig.PigSoundVariants.SoundSet.BIG);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Ljava/lang/String;", cancellable = true)
    private void getIdentifier__344126378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-344126378L))
            info.setReturnValue("&z|WqiꍨD5Z∐jMS4}j䲻+y!FF軩.h#{1˗JD^mp럪L]理DBO6㎞謶!Hg[U\"j}%h+.ꢬ");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier__344126378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-344126378L))
            info.setReturnValue("&z|WqiꍨD5Z∐jMS4}j䲻+y!FF軩.h#{1˗JD^mp럪L]理DBO6㎞謶!Hg[U\"j}%h+.ꢬ");
    }


}
