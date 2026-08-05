package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfSoundVariants.SoundSet.class)
public class SoundSet1623792164Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/wolf/WolfSoundVariants$SoundSet;", cancellable = true)
    private static void values__1099972330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099972330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/wolf/WolfSoundVariants$SoundSet;", cancellable = true)
    private static void valueOf_1835294073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1835294073L))
            info.setReturnValue(net.minecraft.world.entity.animal.wolf.WolfSoundVariants.SoundSet.BIG);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Ljava/lang/String;", cancellable = true)
    private void getIdentifier_488331693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488331693L))
            info.setReturnValue("9ZW鴹C:鱣X貜OCwkYr'zOBl䊺츘gu'^}uE젦N5迫s%3V#");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier_488331693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488331693L))
            info.setReturnValue("9ZW鴹C:鱣X貜OCwkYr'zOBl䊺츘gu'^}uE젦N5迫s%3V#");
    }


}
