package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenSoundVariant.class)
public class ChickenSoundVariant2118226157Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1209599889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209599889L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1406317614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406317614L))
            info.setReturnValue("apcS'm^_H'b}eXn$1\u91FA<\":\uD3B0UA+Ab\u07CDH1{Aj=\uC5BA\uB979}Ch8MjzH!]/\u0C60:S\u70BE}ytsi|a5nf\"\u717A>L#iSOmaFZ:hud}p'Pe");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1619389048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619389048L))
            info.setReturnValue(540512165);
    }

    @Inject(at = @At("HEAD"), method = "babySounds()Lnet/minecraft/world/entity/animal/chicken/ChickenSoundVariant$ChickenSoundSet;", cancellable = true)
    private void babySounds__1466064518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466064518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adultSounds()Lnet/minecraft/world/entity/animal/chicken/ChickenSoundVariant$ChickenSoundSet;", cancellable = true)
    private void adultSounds__1061147370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1061147370L))
            info.setReturnValue(null);
    }


}
