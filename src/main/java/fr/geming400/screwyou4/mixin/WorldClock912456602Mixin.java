package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.WorldClock.class)
public class WorldClock912456602Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1996998435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996998435L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__223003373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-223003373L))
            info.setReturnValue("=Iv4'7h/ᲇ[\"Cs7lT0P'#2m袒`d: (溏ᗺ쎋j뽕)᪆뽑#e.t蘿^ﵐTS^6b&1O>2V0G稽g녙Bb朩8w0tD5?⦖5)㢡3w䞒A-籷c7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_950719344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950719344L))
            info.setReturnValue(-1729347376);
    }


}
