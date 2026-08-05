package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigSoundVariant.class)
public class PigSoundVariant890868966Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__17757302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-17757302L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1661292491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661292491L))
            info.setReturnValue("%n#hyUd$\u9965Fq\u9FAEX\u2E04\u1D17L`>`uBmS\uBBCC.@wf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1448221057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448221057L))
            info.setReturnValue(-827967344);
    }

    @Inject(at = @At("HEAD"), method = "adultSounds()Lnet/minecraft/world/entity/animal/pig/PigSoundVariant$PigSoundSet;", cancellable = true)
    private void adultSounds__1722054876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1722054876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babySounds()Lnet/minecraft/world/entity/animal/pig/PigSoundVariant$PigSoundSet;", cancellable = true)
    private void babySounds_93942152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(93942152L))
            info.setReturnValue(null);
    }


}
