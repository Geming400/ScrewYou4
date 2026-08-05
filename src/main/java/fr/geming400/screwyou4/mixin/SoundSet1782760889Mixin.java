package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenSoundVariants.SoundSet.class)
public class SoundSet1782760889Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/chicken/ChickenSoundVariants$SoundSet;", cancellable = true)
    private static void values_35832703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35832703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/chicken/ChickenSoundVariants$SoundSet;", cancellable = true)
    private static void valueOf_1799047586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799047586L))
            info.setReturnValue(net.minecraft.world.entity.animal.chicken.ChickenSoundVariants.SoundSet.CLASSIC);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Ljava/lang/String;", cancellable = true)
    private void getIdentifier_647300418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(647300418L))
            info.setReturnValue("굣knP8y@AK!s>N|:T9W]澣w?mP6omBnr.FZ6U㌭㘢YAlz''7塳쒽4]B})Ṫ*<!el:;NI=?c9");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier_647300418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(647300418L))
            info.setReturnValue("굣knP8y@AK!s>N|:T9W]澣w?mP6omBnr.FZ6U㌭㘢YAlz''7塳쒽4]B})Ṫ*<!el:;NI=?c9");
    }


}
