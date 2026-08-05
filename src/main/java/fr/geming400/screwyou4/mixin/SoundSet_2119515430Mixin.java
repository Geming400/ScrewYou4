package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.CatSoundVariants.SoundSet.class)
public class SoundSet_2119515430Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/feline/CatSoundVariants$SoundSet;", cancellable = true)
    private static void values__1554738442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1554738442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/feline/CatSoundVariants$SoundSet;", cancellable = true)
    private static void valueOf__1963128067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1963128067L))
            info.setReturnValue(net.minecraft.world.entity.animal.feline.CatSoundVariants.SoundSet.ROYAL);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Ljava/lang/String;", cancellable = true)
    private void getIdentifier__799272947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-799272947L))
            info.setReturnValue(")#S\u7E13\uCE9B:7$\uCBA3");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier__1671178376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1671178376L))
            info.setReturnValue("\uA4AE|\u7EAD\uFFFD\u2C23J \u343Dr&/*\u8A52\uD542@Qw?T8ypI0pm{'bcv{K+&K{P\uB633Pq\u7ED82V'q2;EI{wRB|AL^5JIJh/Y]1c;h1\uD1B1o0>\u8829lbRN5\uB259'0=");
    }


}
