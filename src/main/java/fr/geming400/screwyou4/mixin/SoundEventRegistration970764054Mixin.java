package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.SoundEventRegistration.class)
public class SoundEventRegistration970764054Mixin {
        @Inject(at = @At("HEAD"), method = "getSounds()Ljava/util/List;", cancellable = true)
    private void getSounds__1697866426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697866426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReplace()Z", cancellable = true)
    private void isReplace_1009042637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009042637L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSubtitle()Ljava/lang/String;", cancellable = true)
    private void getSubtitle__164696417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164696417L))
            info.setReturnValue("mJbN3OS&;筀䂭;DZ/l<$></Dᲊ.w$sFlH0,ҹ|1d<rA逶TSHc|ꃖqIc嶒o᷊>ogJ#?Lsr4'韂\"");
    }


}
